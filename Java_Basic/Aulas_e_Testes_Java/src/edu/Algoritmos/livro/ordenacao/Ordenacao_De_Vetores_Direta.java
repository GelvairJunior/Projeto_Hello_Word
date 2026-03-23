package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_De_Vetores_Direta {
	Item[] ordInsercao(Item[] a){
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i].key + a[i].nome + " ");
		}
		System.out.println("");
		
		
		int index;
		int i, j;
		Item x;
		int n = a.length;
		
		
		for(i = 2; i < a.length; i++){

	        x = a[i]; // chave inicial
	        j = i;

	        while(j >= 0 && a[j-1].key > x.key){
	            a[j] = a[j-1];
	            j--;
	        }

	        a[j] = x;
	    }
		
		
		
		System.out.println("-------------------------");
		for(i = 0; i<a.length; i++) {
			System.out.print(a[i].key + a[i].nome + " ");
		}
		System.out.println("");
		
		return a;
	}
	
	Item[] ordInsercaoBinaria(Item[] a){
		int i, m, j, R, L;
		Item x;
		int n = a.length;
		
		for(i = 0; i<n; i++) {
			System.out.print(a[i].key + a[i].nome + " ");
		}
		
		for(i = 2; i <n; i++) {
			x = a[i]; j = i; L = 1; R = i;
			
			while (L<R) {
				m = (L+R)/2;
				if (a[m].key <= x.key){
					L = m +1;
				}else {R = m;}
			}
			
			for(j = i; j < R; j++) {
				a[j] = a[j-1];
			}
			
			a[R] = x;
			
		}
		
		System.out.println("");
		System.out.println("-------------------------");
		for(i = 0; i<n; i++) {
			System.out.print(a[i].key + a[i].nome + " ");
		}
		
		return a;
	}
	
	Item[] ordSelecao(Item[] a) {
		int j, k;
		Item x;
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i].key + a[i].nome + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < a.length; i++) {
			k = i; x = a[i];
			for(j = i + 1; j < a.length; j++) {
				if(a[j].key < x.key) {
					k = j; x = a[k];
				}
			}
			a[k] = a[i]; a[i] = x;
		}
		
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i].key + a[i].nome + " ");
		}
		System.out.println("");
		
		return a;
	}
	
	Item[] ordBubbleSort(Item[] a) {
		int i, j, k;
		Item x;
		
		
		return a;
	}
	
	Item[] ordShakerSort(Item[] a) {
		int i, j, k;
		Item x;
		
		
		return a;
	}
}