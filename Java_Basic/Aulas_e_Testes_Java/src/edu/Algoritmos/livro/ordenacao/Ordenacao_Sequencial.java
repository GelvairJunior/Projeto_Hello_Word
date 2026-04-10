package edu.Algoritmos.livro.ordenacao;

public class Ordenacao_Sequencial {

	Item[] ordenacaoPorFusaoVetores(Item[] b){
		int n = b.length;
		Item[] a = new Item[n * 2];

		for (int i = 0; i < n; i++) {
		    a[i] = b[i];
		    a[i + n] = b[i];
		}
		
		int i, j, k, l, t, h, m, p, q, r;
		boolean up;
		
		
		up = true; p = 1;
		
		
		do { h = 1; m = n;
			if(up) {
				i = 0; j = n - 1; k = n; l = n*2 - 1;
			}else {
				k = 0; l = n - 1; i = n; j = n*2 - 1;
			}
			
			do {
				if(m >= p) { q = p;} else {q = m;}
				m = m-q;
				
				if(m >= p) {r = p; }else {r = m;}
				
				while(q != 0 && r != 0) {
					System.out.println(a[i] + " < Confere < " + a[j]);
					if (a[i].key < a[j].key) {
						System.out.println(a[k] + " Trocando " + a[i]);
						a[k] = a[i]; k = k+h; i++; q--;
					}else {
						System.out.println(a[k] + " Trocando " + a[j]);
						a[k] = a[j]; k = k+h; j--; r--;
					}
				}
				
				while (r > 0) {
					a[k] = a[j]; k = k+h; j--; r--;
				}
				
				while (q > 0) {
					a[k] = a[i]; k = k+h; i++; q--;
				}
				
				h = -h; t = k; k = l; l = t;

			}while(m > 0);
			
			up = !up; p = p*2;
		}while(p <= n);
		if(!up) {
			for(i = 0; i < n; i++) {
				a[i] = a[i+n];
			}
		}
		return a;
	}
}
