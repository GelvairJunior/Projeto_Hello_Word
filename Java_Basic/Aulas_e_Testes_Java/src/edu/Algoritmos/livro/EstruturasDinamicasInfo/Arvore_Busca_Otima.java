package edu.Algoritmos.livro.EstruturasDinamicasInfo;


public class Arvore_Busca_Otima<T> {
	class Node{T key; int count; Node left, right;}
	int[][] r, w, p; int n;
	
	public void teste(Sequencia<T> s) {
		
	}
	
	public int BalTree(int i, int j) {
		int k = (i+j+1)/ 2; r[i][j] = k;
		if(i >= j) {return 0;} else {return BalTree(i, k-1)+BalTree(k, j)+w[i][j];}
	}
	
	public void OptTree() {
		int x, min, i, j, k, h, m;
		for(i = 0; i < n; i++) {p[i][i] = 0;
			j = i+1; p[i][j] = w[i][j]; r[i][j]=j;
		}
		for (h=2; h < n; h++) {
			for(i=0; i < n-h; i++) {
				j = i+h; m=r[i][j-1]; min = p[i][m-1] + p[m][j];
				for(k = m+1; k < r[i+1][j]; k++) {
					x = p[i][k-1]+p[k][j];
					if (x<min) {
						m=k; min = x;
					}
				}
				p[i][j] = min + w[i][j]; r[i][j] = m;
			}
		}
		
	}
	
	public void printtree(Node t, int h) {
		if (t != null) {
			printtree(t.left, h+1);
			for(int i = 0; i <= h; i++) {System.out.print("   ");}
			System.out.println(t.key + " : " + t.count);
			printtree(t.right, h+1);
		}
	}
	
}
