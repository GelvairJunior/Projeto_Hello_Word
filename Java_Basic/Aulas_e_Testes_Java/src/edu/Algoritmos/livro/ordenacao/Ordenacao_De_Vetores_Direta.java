package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_De_Vetores_Direta {
	Item[] ordInsercao(Item[] a){
		int index;
		int i, j;
		Item x;
		int n = a.length;
		
		
		for(i = 1; i < n; i++){

	        x = a[i]; // chave inicial
	        j = i;

	        while(j >= 0 && a[j-1].key > x.key){
	            a[j] = a[j-1];
	            j--;
	        }

	        a[j] = x;
	    }
		
		return a;
	}
	
	Item[] ordInsercaoBinaria(Item[] a){
		int i, m, j, R, L;
		Item x;
		int n = a.length;
		
		for(i = 1; i <n; i++) {
			x = a[i]; j = i; L = 0; R = i;
			
			while (L<R) {
				m = (L+R)/2;
				if (a[m].key <= x.key){
					L = m +1;
				}else {R = m;}
			}
			
			for(j = i; j > R; j--) {
				a[j] = a[j-1];
			}
			
			a[R] = x;
			
		}
		
		return a;
	}
	
	Item[] ordSelecao(Item[] a) {
		int j, k;
		Item x;
		
		for(int i = 0; i < a.length; i++) {
			k = i; x = a[i];
			for(j = i + 1; j < a.length; j++) {
				if(a[j].key < x.key) {
					k = j; x = a[k];
				}
			}
			a[k] = a[i]; a[i] = x;
		}
		
		return a;
	}
	
	Item[] ordBubbleSort(Item[] a) {
		int i, j;
		Item x;
		
		for(i = 0; i < a.length; i++) {
			for(j = a.length-1; j > i; j--) {
				if(a[j-1].key > a[j].key) {
					x = a[j-1]; a[j-1] = a[j]; a[j] = x;
				}
			}
		}
		
		return a;
	}
	
	Item[] ordShakerSort(Item[] a) {
		int j, k;
		Item x;
		int L, R;
		R = a.length -1; k = a.length; L = 0;
		
		do{
			for(j = R; j > L; j--) {
				if(a[j-1].key > a[j].key) {
					x = a[j-1]; a[j-1] = a[j]; a[j] = x; k = j;
				
				}
			}
			L=k;
			
			for(j = L; j < R; j++) {
				if(a[j].key > a[j+1].key) {
					x = a[j]; a[j] = a[j+1]; a[j+1] = x; k = j;
				}
			}
			R=k;
		}while(L < R);
		
		
		return a;
	}
	
	Item[] ordInsecaoSofisticado(Item[] a) {
		int i, j, s, k;
		int m;
		Item x;
		int t = 4;
		int[] h = new int[t];

		h[0] = 9; h[1] = 5; h[2] = 3; h[3] = 1;
		
		for(m = 0; m < t; m++) {
			
			k = h[m];// s = -k; sentinela
			
			for(i = m; i< a.length; i++) {
				
				x = a[i]; j = i;
				
				while(j >=m && a[j-m].key > x.key) {
					a[j] = a[j-m]; 
					j = j-m ;
				}
				
				a[j] = x;
			}
		}
		
		return a;
	}
	
	Item[] ordHeap(Item[] a) {
		//versão mlr da seleção
		Item x;
		int L, R;
		int n = a.length -1;
		
		L = (n/2);
		R = n;
		while (L > 0) {
			L--; 
			escorrega_Sift(a, L, R);
		}
		while(R>0) {
			x = a[0]; a[0] = a[R]; a[R] = x;
			R--;
			this.escorrega_Sift(a, L, R);
		}
		
		return a;
	}
	
	private void escorrega_Sift(Item[] a, int L, int R) {
		int i, j;
		Item x;
		
		i = L; j = 2*L; x = a[L];
		if(j < R && a[j+1].key > a[j].key) {j++;}
		while(j <= R && x.key < a[j].key) {
			System.out.println("R = "+ R + " j = " + j + " L = " + L + " i = "+ i);
			a[i] = a[j]; i = j; j = 2*j;
			if(j < R && a[j].key < a[j+1].key) {j++;}
		}
		a[i] = x;
		
	}
}