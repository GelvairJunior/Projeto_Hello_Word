package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_Sequencial{
	int N = 6;// quantidade de sequencias
	int d[] = new int[N];
	int a[] = new int[N];
	int j, z, level;
	
	private void select() {
		if(d[j] < d[j+1]) {j++;}
		else {
			if(d[j] == 0) {
				level++; z = a[1];
				for(int i = 0; i < N-1; i++) {
					d[i] = z + a[i+1] - a[i]; a[i] = z + a[i+1];
				}
			}
			j = 0;
		}
		d[j] = d[j] - 1;
		
	}
	
	private void copyRun(Sequencia<Item> f0, Sequencia<Item> b) {
		Item last = (Item) f0.first;
	    b.f.writeWord(last);
	    f0.read();
	    
	    while (!f0.eof && !f0.eor) {
	        last = (Item) f0.first;
	        b.f.writeWord(last);
	        f0.read();
	    }
	}
	
	public Sequencia<Item> ordNaturalMerge(Sequencia<Item> f0) {
	    Sequencia<Item> b = new Sequencia<Item>();
	    Sequencia<Item> c = new Sequencia<Item>();
	    b.OpenSeq();
	    c.OpenSeq();
	    
	    int runs;
	    
	    do {
	        runs = 0;

	        f0.startRead();
	        b.startWrite();
	        c.startWrite();

	        while (f0.first != null) {
	            copyRun(f0, b);
	            runs++;
	            
	            if(f0.first == null) {break;}
	            
	            copyRun(f0, c);
                runs++;
	        }
	        
	        f0.startWrite();
	        b.startRead();
	        c.startRead();
	        
	        while(!b.eof && !c.eof) {
	        	if(c.first.key <= b.first.key) {
	        		f0.copy(c);
	        		c.read();
	        	} else {
	        		f0.copy(b);
	        		b.read();
	        	}
	        }
	        
	        while(!b.eof) {
	        	f0.copy(b);
	        	b.read();
	        }
	        
	        while(!c.eof) {
	        	f0.copy(c);
	        	c.read();
	        }
	        
	        
	    } while (runs > 1);
	    
	    return f0;
	}
	
	public Sequencia<Item> ordBalancedMerge(Sequencia<Item> f0) {
		// bloco 1------------------------------------------------------
		int nh = N/2; // Sequencia dividido no meio entrada e saida
		int s = 0; // cordoes 
		int j = 0, i = 0, L = 0; // indices
		int k1; // quantidade de sequências de entrada ATIVAS
		int k2; // quantidade de sequências ainda ativas na RUN atual
		int mx, tx;
		
		int[] t = new int[N]; // entradas e saidas
		int[] ta = new int[nh]; // entradas ativas
		
		f0.startRead();
		
		Item x, min;
		
		for(i = 0; i < N; i++) {
			t[i] = i;
		}
		
		// fim bloco 1------------------------------------------------------
		
		// bloco 2------------------------------------------------------
		
		// copiar f0 para f[0]... f[N]
		Sequencia<Item> f[] = new Sequencia[N];
		for(i = 0; i < N; i++) {
			f[i] = new Sequencia<Item>();
			f[i].OpenSeq();
			f[i].startWrite();
		}
		
		j = -1; f0.startRead();
		do {
			j = (j + 1) % nh;
			copyRun(f0, f[j]);
			L++;
		}while(!f0.eof);
		
		// fim bloco 2------------------------------------------------------
		
		// bloco 3---------------------------------------------------------
		do {
			k1 = 0;
			
			// prepara para ler entradas
			for (i = 0; i < nh; i++) {
			    f[t[i]].startRead();

			    if (!f[t[i]].eof && f[t[i]].first != null) {
			        ta[k1++] = i;
			    }
			    
			}
			
			// prepara para escrever nas saidas
			for (i = nh; i < N; i++) {
	            f[t[i]].startWrite();
	            
	        }
			
			L = 0; 
			j = nh; // j = indice das sequencia das saidas
			
			// fim bloco 3----------------------------------------------------
			
			// bloco 4--------------------------------------------------------
			do { // fusoes de cordoes de entradas para t[j]
				L++;
				k2 = k1;
				
				do {
					i = 1; mx = 0; min = f[t[ta[0]]].first;
					
					while(i < k2) {
						x = f[t[ta[i]]].first;
						if(x != null && x.key < min.key) {
							min = x; mx = i;
						}
						i++;
						
					}
					f[t[j]].copy(f[t[ta[mx]]]);
					f[t[ta[mx]]].read();
					
					
					if(f[t[ta[mx]]].eof) {// libera a sequência esgotada
						f[t[ta[mx]]].startWrite();
						k1--; k2--;
						ta[mx] = ta[k2];
						ta[k2] = ta[k1];
						
					}else if(f[t[ta[mx]]].eor){
						k2--; 
						tx = ta[mx]; 
						
						ta[mx] = ta[k2]; 
						ta[k2] = tx;
						 
					}
					
				}while(k2 > 0);
				
				j = (j - nh + 1) % nh + nh; // avança para próxima saída
				
			}while(k1 > 0);
			// fim bloco 4-------------------------------------------------------------------------
			
		// bloco 5--------------------------------------------------------------------------
			
			// Rotaciona t[] saida viram entradas, entradas viram saidas
			for(i = 0; i < nh; i++) {
				tx = t[i]; t[i] = t[i+nh]; t[i+nh] = tx;
			}
			
		}while(L > 1);
		
		return f[0];
		
		// fim bloco 5----------------------------------------------------------------------------
	}

	public Sequencia<Item> ordPolifase(Sequencia<Item> f0) {
		//DistributeRuns runs_iniciais = new DistributeRuns(); runs_iniciais.distribute(f0);
		
		// bloco 1--------------------------------------------------------------------------------
		
		int t[] = new int[N]; int ta[] = new int[N];
		
		Sequencia<Item> f[] = new Sequencia[N];
		Item x, min;
		int i, mx, tn, k, dn;
		int n = N - 1;
		
		for(i = 0; i < N; i++) {
			f[i] = new Sequencia<Item>();
			f[i].OpenSeq();
			
		}
		
		for(i = 0; i < N-1; i++) {
			f[i].startRead();
			a[i] = 1;
			d[i] = 1;
		}
		
		level = 1; j = 0; 
		a[n] = 0; d[n] = 0; 
		f0.startRead();
		i = 0;
		dn = 0;
		// fim bloco 1----------------------------------------------------------------------------
		
		// teste
		
		// Bloco 2--------------------------------------------------------------------------------
		do {
			select();
			copyRun(f0, f[j]);
		}while(!f0.eof && !(j == n));
		
		while(!f0.eof) {
			select();
			if(f[j].first.key <= f0.first.key) {
				copyRun(f0, f[j]);
				if(f0.eof) {
					d[j] = d[j]+1;
				}else {
					copyRun(f0, f[j]);
				}
			}else {
				copyRun(f0, f[j]);
			}
			
		}
		
		for(i = 0; i < n; i++) {
			t[i] = i;
			f[i].startRead();
		}
		t[n] = n;
		// fim bloco 2---------------------------------------------------------------------------
		
		// teste---------------------------------------------------------------------------------
		//for(i = 0; i < N; i++) {
		//	System.out.println(i + "------------------------------");
		//	f[i].listSequencia();
		//}
		
		// Bloco 3------------------------------------------------------------------------------
		do { //obter um cordão t[n] a partir da fusão de t[0]... t[n-1] para t[n]
			z = a[n-1]; 
			d[n] = 0; 
			f[t[n]].startWrite();
			
		
			do { // fusão de um cordão
				
				k = 0;
				for(i = 0; i < n; i++) {
					if(d[i] > 0) {d[i]--;}
					else {ta[k] = t[i]; k++;}
				}
				if(k == 0) {d[n]++;}
				
				else { // obter um cordao t[n] a partir de t[0], ..., t[k] para t[n]
					
					do {
						mx = 0; min = f[ta[0]].first;
						for(i = 1; i < k; i++) {   // vai até k inclusive
							
							x = f[ta[i]].first;
						    if(x != null && x.key < min.key) { min = x; mx = i; }
						}
						
						f[t[n]].copy(f[ta[mx]]);
						f[ta[mx]].read();
						
						if(f[ta[mx]].eof || f[ta[mx]].eor) {ta[mx] = ta[k - 1]; k--;}// abandonar fonte
					
					}while(k > 0);
				}
				z--;
			}while(z > 0);
		// fim bloco 3--------------------------------------------------------------------------
			
			//teste
			//System.out.println("Entrada");
			//for(i = 0; i < n; i++) {
			//	System.out.println("Sequencia " + t[i] + "------------------------------");
			//	f[t[i]].listSequencia();
			//}
			//System.out.println("------------------------------");
			//System.out.println("Saida sequencia " + t[n]);
			//f[t[n]].listSequencia();
			//i = 0;
			
		// Bloco 4-----------------------------------------------------------------------------
			f[t[n]].startRead(); // fazer a rotação das sequencias
			tn = t[n]; dn = dn + d[n]; z = a[n-1];
			
			for(i = n-1; i > 0; i--) {
				t[i+1] = t[i]; 
				d[i+1] = d[i]; 
				a[i+1] = a[i]-z;
			}
			
			t[1] = tn; d[0] = dn; a[1] = z;
			
			f[t[n]].startWrite(); level--;
			
		}while(level > 0);
		// fim bloco 4-------------------------------------------------------------------------
		
		// teste
		//System.out.println("resultado");
		//f[t[1]].listSequencia();
		
		return f[t[1]];
		
	}
	
	
}