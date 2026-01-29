package edu.Algoritmos.livro;

public class Types {
	public static void main(String[] args) {
		int i = 5;
		char c = 'A';
		double r = 4.5;
		boolean b = true;
		String S = "Junior";
		
		int[] v = {3,5,7,9};
		int[][] m = { {0,2,4,6,8}, {1,3,5,7,9} };
		
		char[] vC = {'N', 'i', 'k', 'l', 'a', 'u', 's'}; 
		char[][] mC = {{'A','l','g','o','r','t','m','o','s'},{'E','s','t','r','u','t','u','r','a','s'}};  
	
		Forma forma = new Forma();
		Cor cor = new Cor();
		Veiculo veiculo = new Veiculo();
		
		potenciaNegativa();
		
	}
	
	public static void potenciaNegativa() {
		int i, k, r;
		int n = 10;
		int[] d = {1,2,3,4,5,6,7,8,9,10};
		
		for (k = 1; k < n; k++) {
			System.out.print(".");
			r = 0;
			for (i = 1; i < k-1; i++) {
				r = 10*r + d[i];
				d[i] = r/2;
				r = r%2;
				System.out.print(d[i] );
			}
			d[k] = 5;
			System.out.println("5");
		}
		
	}
}
