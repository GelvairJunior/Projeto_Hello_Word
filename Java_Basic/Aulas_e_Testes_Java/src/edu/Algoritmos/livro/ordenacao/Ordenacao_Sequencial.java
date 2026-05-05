package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_Sequencial{
	
	Sequencia<Item> ordNaturalMerge(Sequencia<Item> a) {
	    Sequencia<Item> b = new Sequencia<Item>();
	    Sequencia<Item> c = new Sequencia<Item>();
	    b.OpenSeq();
	    c.OpenSeq();
	    
	    int runs;
	    
	    do {
	        runs = 0;

	        a.startRead();
	        b.startWrite();
	        c.startWrite();

	        while (a.first != null) {
	            copyRun(a, b);
	            runs++;
	            
	            if(a.first == null) {break;}
	            
	            copyRun(a, c);
                runs++;
	        }
	        
	        a.startWrite();
	        b.startRead();
	        c.startRead();
	        
	        while(!b.eof && !c.eof) {
	        	if(c.first.key <= b.first.key) {
	        		a.copy(c);
	        		c.read();
	        	} else {
	        		a.copy(b);
	        		b.read();
	        	}
	        }
	        
	        while(!b.eof) {
	        	a.copy(b);
	        	b.read();
	        }
	        
	        while(!c.eof) {
	        	a.copy(c);
	        	c.read();
	        }
	        
	        
	    } while (runs > 1);
	    
	    return a;
	}

	private void copyRun(Sequencia<Item> a, Sequencia<Item> b) {
	    Item last = (Item) a.first;
	    b.f.writeWord(last);
	    a.read();

	    while (!a.eof && !a.eor) {
	        last = (Item) a.first;
	        b.f.writeWord(last);
	        a.read();
	    }
	}
	
	public Sequencia ordBalancedMerge(Sequencia<Item> f0) {
		// bloco 1------------------------------------------------------
		int N = 6; // numero maximo de sequencias
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
}