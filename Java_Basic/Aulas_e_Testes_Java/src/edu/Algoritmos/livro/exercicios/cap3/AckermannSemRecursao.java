package edu.Algoritmos.livro.exercicios.cap3;

public class AckermannSemRecursao {
	
	record stack(){static int[] m; static int p;}
	public static int teste(int m, int n) {
		stack stack = new stack(); stack.m = new int[5000];
		stack.m[1] = m;stack.p = 1;
		
		while(stack.p > 0) {
			m = stack.m[stack.p]; stack.p--;
			if(m == 0) {
				n++;
			} else if(n==0) {
				stack.p++; stack.m[stack.p] = m-1;
				n=1;
			} else {
				stack.p++; stack.m[stack.p] = m-1;
				stack.p++; stack.m[stack.p] = m;
				n--;
			}
		}
		return n;
	}
	
}
