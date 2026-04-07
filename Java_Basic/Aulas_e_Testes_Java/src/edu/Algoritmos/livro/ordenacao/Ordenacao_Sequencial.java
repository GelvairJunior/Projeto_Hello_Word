package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_Sequencial {

	void ordenacaoPorFusaoVetores(Item[] b){
		Item[] a = new Item[b.length*2];
		for (int j=0, i = 0; i < a.length-1; i++) {
			if(i < b.length) {
				a[i] = b[i];
			}else {
				a[i] = b[j];
				j++;
			}
		}
		
		int i, j, k, l, t, h, m, p, q, r;
		boolean up;
		int n = b.length -1;
		
		up = true; p = 1;
		
		do { 
			h= 1; m = n;
			if(up) {
				i = 1; j = n; k = n+1; l = n*2;
			}else {
				k = 1; l = n; i = n+1; j = n*2;
			}
			
			do {
				
				h = -h; t = k; k = l; l = t;
			}while(m == 0);
			
			up = !up; p = p*2;
		}while(p>=n);
		
	}
}
