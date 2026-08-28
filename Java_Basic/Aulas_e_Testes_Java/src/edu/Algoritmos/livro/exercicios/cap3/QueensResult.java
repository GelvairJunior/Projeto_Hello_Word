package edu.Algoritmos.livro.exercicios.cap3;

import java.util.ArrayList;

public class QueensResult {
	
	static int[] x = new int[9];
	static boolean[] a = new boolean[9];
	static boolean[] b = new boolean[18];
	static boolean[] c = new boolean[18];
	static ArrayList solucao = new ArrayList();
	
	public static void tente(int i, boolean q) {	
		int ci;
		for(int j = 1; j <= 8; j++) {
			ci = 8;
			ci = ci + (i-j);
			if(a[j] && b[i+j] && c[ci]) {
				x[i] = j;
				a[j] = false; b[i+j] = false; c[ci] = false;
				if (i < 8) {tente(i+1, q);}else{
					if (menorResultado()) {print();}
				}
				
				a[j] = true; b[i+j] = true; c[ci] = true;
			}
		}
	}
	
	public static boolean menorResultado() {
	    int[][] solucoes = new int[8][8]; int i, j;
	    for (i = 0; i < 8; i++) {solucoes[0][i] = x[i + 1];} // original
	    for (i = 0; i < 8; i++) {solucoes[1][i] = 9 - x[i + 1];} // espelho vertical
	    for (i = 0; i < 8; i++) {solucoes[2][7 - i] = x[i + 1];} // espelho horizontal
	    for (i = 0; i < 8; i++) {solucoes[3][8 - x[i + 1]] = i + 1;} // rotação de 180
	    for (i = 0; i < 8; i++) {solucoes[4][x[i+1]-1] = 8 - i;} // rotação de 90
	    for (i = 0; i < 8; i++) {solucoes[5][8 - x[i+1]] = i + 1;} // rotação 270
	    for (i = 0; i < 8; i++) {solucoes[6][x[i + 1] - 1] = i + 1;} // reflexao na diagonal principal
	    for (i = 0; i < 8; i++) {solucoes[7][8 - x[i + 1]] = 8 - i;} // reflexao na diagonal secundaria

	    // Verifica se x é a menor solução
	    for (j = 1; j < 8; j++) {
	        for (i = 0; i < 8; i++) {
	            if (solucoes[j][i] < solucoes[0][i]) {return false;}
	            if (solucoes[j][i] > solucoes[0][i]) {break;}
	        }
	    }
	    return true;
	}

	public static void print() {
		String str = "("+x[1]+", " +1+")";
		for(int i = 2; i <= 8; i++) {
			str = str+" -> ";
			str = str+"("+x[i]+", " +i+")";
		}
		System.out.println(str);
		solucao.add(str);
	}
		
	public static void test() {
		for(int i = 1; i <= 8; i++) {a[i] = true;}
		for(int i = 2; i <= 16; i++) {b[i] = true;}
		for(int i = 1; i <= 14; i++) {c[i] = true;}
		tente(1, true);	
		System.out.println(solucao.size());
	}
	
}
