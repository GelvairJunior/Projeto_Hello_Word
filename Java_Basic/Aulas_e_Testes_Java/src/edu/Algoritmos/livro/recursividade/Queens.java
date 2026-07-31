package edu.Algoritmos.livro.recursividade;

public class Queens {
	
	static int[] x = new int[9];
	static boolean[] a = new boolean[9];
	static boolean[] b = new boolean[18];
	static boolean[] c = new boolean[18];
	
	public static void tente(int i, boolean q) {
		
		int ci;
		for(int j = 1; j <= 8; j++) { 
			ci = 8;
			ci = ci + (i-j);
			if(a[j] && b[i+j] && c[ci]) {
				x[i] = j;
				a[j] = false; b[i+j] = false; c[ci] = false;
				if (i < 8) {
					tente(i+1, q);
				}else {print();}
				a[j] = true; b[i+j] = true; c[ci] = true;
			}
			
		}
	}
	
	public static void print() {
		for(int i = 1; i <= 8; i++) {System.out.print("("+x[i]+", " +i+") -> ");}
		System.out.println(" ");
	}
	
	public static void test(){
		
		for(int i = 1; i <= 8; i++) {a[i] = true;}
		for(int i = 2; i <= 16; i++) {b[i] = true;}
		for(int i = 1; i <= 14; i++) {c[i] = true;}
		tente(1, true);
		
		
	}
}
