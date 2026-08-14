package edu.Algoritmos.livro.exercicios.cap3;

public class NPermutacoesFatoracao {
	static int n;
	static int[] f;

	public static void test(int s) {
		n = s;f = new int[s+1];
		for(int i = 1; i <= s; i++) {
			f[i] = i;
		}
		sub1(n);
		
	}
	
	private static int sub1(int m) {
		int s;
		if(m == 1) {
			for(int l = 1; l <= n; l++) {
				System.out.print(f[l] + " ");
			}
			System.out.println("");
			return 1;
		}
		for(int i = 1; i <= m; i++) {
			s = f[i]; f[i] = f[m]; f[m] = s;
			sub1(m-1);
			s = f[i]; f[i] = f[m]; f[m] = s; 
		}
		return 1;
	}
}
