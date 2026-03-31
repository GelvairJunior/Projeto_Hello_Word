package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_De_Vetores_Direta {
	Item[] ordInsercao(Item[] a){//insercao
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
	
	Item[] ordInsercaoBinaria(Item[] a){//insercao  modificado
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
	
	Item[] ordSelecao(Item[] a) {// seleçao
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
	
	Item[] ordBubbleSort(Item[] a) {//permutação
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
	
	Item[] ordShakerSort(Item[] a) {//permutação modificado
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
	
	Item[] ordInsecaoSofisticado(Item[] a) {//inserção sofisticado
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
	
	Item[] ordHeap(Item[] a) {//selecao sofisticado

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
	
	private void escorrega_Sift(Item[] a, int L, int R) {//Arvore construção
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
	
	private Item[] ordPartition(Item[] a) {//codigo morto
		Item x = a[22];
		Item w;
		int i = 1;
		int j = a.length - 1;
		do {
			while(a[i].key < x.key) {
				i++;
			}
			while(x.key < a[j].key) {
				j--;
			}
			if(i <= j) {
				System.out.println(a[i]+" "+ a[j]);
				w = a[i]; a[i] = a[j]; a[j] = w; i++; j--;
			}
		}while (i < j);
		
		return a;
	}
	
	private Item mediana(Item[] a) { //Calculo para mediana
		Item x = a[14];
		
		return x;
		
	}
	
	Item[] ordQuick(Item[] a, int L, int R) {//permutacao sofisticado mlr
		Item x;
		Item w;
		int i = L; int j = R;
		
		x = a[(L+R)/2];
		do {
			while (a[i].key < x.key) {i++;}
			while (x.key < a[j].key) {j--;}
			
			if(i <= j) {
				System.out.println(a[i]+" "+ a[j]);
				w = a[i]; a[i] = a[j]; a[j] = w; i++; j--;
			}
			
		}while(i < j);
		
		if(L < j) {ordQuick(a, L, j);}
		if(i < R) {ordQuick(a, i, R);}
		
		
		return a;
	}
	
	record Stack(int L, int R){}
	
	Item[] ordNonRecursiveQuick(Item[] a) {//permutacao sofisticado mlr
		int M = 12;
		Item x, w;
		int i, j, L, R;
		int s;
		int n = a.length - 1;
		Stack[] stack = new Stack[M];
		
		s = 1; stack[1] = new Stack(0, n);
		do {
			L = stack[s].L; R = stack[s].R; s--;
			do {
				i = L; j = R; x = a[(L+R)/2];
				do {
					while(a[i].key < x.key) {i++;}
					while(x.key < a[j].key) {j--;}
					if (i <= j) {
						System.out.println(a[i]+" "+a[j]);
						w = a[i]; a[i] = a[j]; a[j] = w; i++; j--;
					}
				}while(i < j);
				System.out.println(s);
				if(j - L < R - i) {
					if(i < R) {
						s++; stack[s] = new Stack(i, R);
						System.out.println("s++");
					}
					R = j;
				}else{
					if(L < j) {
						s++; stack[s] = new Stack(L, j);
						System.out.println("s++");
					}
					L = i;
					System.out.println(s);
				}
				System.out.println("utilização do L >= R");
			}while(L < R);
			System.out.println("utilização do s == 0");
			System.out.println(s);
		}while(s > 0);
		
		return a;
	}
	
	Item findMediana(Item[] a) {
		System.out.println("--------------------------------------------");
		int i,j,L,R,k;
		Item x, w;
		k = (a.length-1)/2;
		L = 0; R = a.length - 1;
		while(L < R) {
			x = a[(L + R) / 2]; i = L; j = R;
			do {
				while (a[i].key < x.key) {i++;}
				while (x.key < a[j].key) {j--;}
				if (i <= j) {
					w = a[i]; a[i] = a[j]; a[j] = w; i++; j--;
				}
			}while(i <= j);
			if(j < k) {L = i;}
			if(k < i) {R = j;}
		}
		
		return a[k];
	}
}