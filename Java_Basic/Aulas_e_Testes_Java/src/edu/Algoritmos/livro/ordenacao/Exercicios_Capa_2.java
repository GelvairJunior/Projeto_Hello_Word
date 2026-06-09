package edu.Algoritmos.livro.ordenacao;

public class Exercicios_Capa_2 {
	int comp = 0;
	run[] c;

	void ordCascata(Sequencia<Item> t0) {
		
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
	
	void runs(Item[] a, int orientacao) {
		int n = (a.length/2);
		int l = orientacao; int k = 1;
		int proximo = orientacao + 1; c = null;
		
		for (int i = orientacao; proximo < (n + orientacao); i++) {
			if(a[i].key > a[proximo].key) {
				k++;
			}
			proximo++;
		}
		if(k == 0) {c = null;}else{c = new run[k]; c[0] = new run(); c[0].ini = orientacao;}
		
		proximo = orientacao + 1; k = 0;
		for (int i = orientacao; proximo < n + orientacao; i++) {
			if(a[i].key <= a[proximo].key){
				l++; c[k].fim = l;
			}else {
				k++; l++;
				c[k] = new run(); c[k].ini = l; c[k].fim = l;
			}
			proximo++;
		}
		c[k].fim = orientacao+n-1;
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("Run = " + (1+i));
			System.out.println("ini = " + (c[i].ini));
			System.out.println("fim = " + (c[i].fim));
			for(int j = c[i].ini; j <= c[i].fim; j++) {
				System.out.println("a["+j+"] " + a[j]);
			}
			System.out.println("Proximo Run");
		}
	}
	
	Item[] ordFusaoNaturalDireta(Item[] b) {
		// bloco 1
		int n = b.length-1;
		Item[] a = new Item[b.length*2];
		for(int i = 0; i <= n; i++) {
			a[i] = b[i];
			a[n+i] = b[i];
		}
		
		boolean up = true; int p = 1;
		int t, h, m, i, j, k, l, q, r;
		
		i = 0; j = n; k = n+1; l = n*2;
		runs(a, i);
		// fim bloco 1
		
		// bloco 2
		do {
			
			h = 1; m = n;
			for(int runAtual = 0; runAtual < c.length-1; runAtual+=2) {
				q = c[runAtual].fim - c[runAtual].ini + 1;
				r = c[runAtual+1].fim - c[runAtual+1].ini + 1;
				i = c[runAtual].ini;
				j = c[runAtual+1].ini;
				
				while((q != 0) & (r !=0)) {
					
					if(a[i].key < a[j].key) {
						System.out.println("Merge 1 entre: q = " + q + " posição "+ k + " Item: " + a[k] + " = posição:" + i + " item: "+ a[i]);
						a[k] = a[i]; k = k+h; i++; q--;
					}else {
						System.out.println("Merge 2 entre: r = " + r + "  posição "+ k + " Item: " + a[k] + " = posição: " + j + " item: "+ a[j]);
						a[k] = a[j]; k = k+h; j++; r--;
					}
				}
				
				while(r > 0) {
					System.out.println("Merge 3 entre: r = " + r + " posição "+ k + " Item: " + a[k] + " = posição: " + j + " item: "+ a[j]);
					if(k == a.length) {break;}
					a[k] = a[j]; k = k+h; j++; r--;
				}
				
				while(q > 0) {
					System.out.println("Merge 4 entre: posição "+ k + " Item: " + a[k] + " = posição:" + i + " item: "+ a[i]);
					a[k] = a[i]; k = k+h; i++; q--;
				}
			}
			//fim bloco 2
				
			// bloco 3
			
			up = !up;
			if(up) {
				i = 0; j = n; k = n+1; l = n*2;
			}else {
				k = 0; l = n; i = n+1; j = n*2;
			}
			
			runs(a, i);
		}while(c.length > 1);
			
		if(!up) {
			for(i = 0; i <= n; i++) {
				System.out.println("b["+i+"]"+ " recebe " + "a["+(n+1+i)+"]");
				b[i] = a[n+1+i];
				System.out.println("a = "+a[n+1+i]);
				System.out.println("b = "+b[i]);
			}
		}else {
			for(i = 0; i <= n; i++) {
				System.out.println("b["+i+"]"+ " recebe " + "a["+i+"]");
				b[i] = a[i];
				System.out.println("a = "+a[i]);
				System.out.println("b = "+b[i]);
			}
		}
		return b;
			// fim bloco 3
	}
	
	void ordQuickSortMenorMaior(Item[] a) {
		
		Stack[] stack = new Stack[6];
		stack[1] = new Stack(0, a.length-1);
		
		ordQuickSortOneRecursive(a, 1, stack);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}	
	}
	
	void QuickBubbleSort(Item[] a) {
		int m = 10;
		ordBubbleSort(a, m);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}	
		
		System.out.println("elementos percorridos = "+ comp);
		System.out.println("objetivo = " + ((m-1) * a.length));
	}
	
	void QuickSelection(Item[] a) {
		int m = 10;
		ordSelecao(a, m);
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("elementos manipulados = "+ comp);
		System.out.println("esperados elementos manipulados = "+ (a.length)*m);
	}
	
	private Item[] ordBubbleSort(Item[] a, int m) {//permutação
		int i, j; Item x;
		ordQuick(a, 0, a.length-1, m);
		
		for(i = 0; i < m-1; i++) {
			for(j = a.length-1; j > i; j--) {
				comp++;
				if(a[j-1].key > a[j].key) {
					x = a[j-1]; a[j-1] = a[j]; a[j] = x;
				}
			}
		}
		
		return a;
	}
	
	private Item[] ordSelecao(Item[] a, int m) {
		int j, k; Item x;
		ordQuick(a, 0, a.length-1, m);
		
		for(int i = 0; i < a.length; i++) {
			k = i; x = a[i];
			for(j = i + 1; j < a.length; j++) {
				comp++;
				if(a[j].key < x.key) {
					k = j; x = a[k];
				}
			}
			a[k] = a[i]; a[i] = x;
		}
		
		
		return a;
	}
	
	private Item[] ordQuick(Item[] a, int L, int R, int m) {//permutacao sofisticado mlr
		Item x; Item w; 
		int i = L; int j = R;
		int tamanho = R - L;
		
		x = a[(L+R)/2];
		do {
			while (a[i].key < x.key) {i++;}
			while (x.key < a[j].key) {j--;}
			if(i <= j) {w = a[i]; a[i] = a[j]; a[j] = w; i++; j--;}
		}while(i < j);

		if(tamanho > m) {
			if(L < j) {ordQuick(a, L, j, m);}
			if(i < R) {ordQuick(a, i, R, m);}
		}
		return a;
	}
	
	record Stack(int L, int R){}
	Item[] ordQuickSortOneRecursive(Item[] a, int s, Stack[] stack) {//permutacao sofisticado mlr
		Item x, w;
		int i, j, L, R;
		int n = a.length - 1;
		int left = 0; int right = 0;
		
		L = stack[s].L; R = stack[s].R; s--;
		
			
		do {
				
			i = L; j = R; x = a[(L+R)/2];
				
			do {
				while(a[i].key < x.key) {i++;}
				while(x.key < a[j].key) {j--;}
				if (i <= j) {
					w = a[i]; a[i] = a[j]; a[j] = w; i++; j--;
				}
			}while(i < j);
			
			left = j - L; right = R - i;
			if(left < right) {
				if(i < R) {
					s++; stack[s] = new Stack(i, R);
				}
				R = j;
			}else{
				if(L < j) {
					s++; stack[s] = new Stack(L, j);
				}
				L = i;
			}
				
		}while(L < R);
			
		if(s > 0) {
			ordQuickSortOneRecursive(a, s, stack);
		}
		
		return a;
	}
	
}