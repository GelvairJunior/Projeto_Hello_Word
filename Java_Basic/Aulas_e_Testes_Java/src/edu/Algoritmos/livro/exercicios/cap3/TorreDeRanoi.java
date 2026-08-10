package edu.Algoritmos.livro.exercicios.cap3;

import java.util.ArrayList;

public class TorreDeRanoi {

	pino[] pino;
	int m;
	int[] discos;
	
	record pino(ArrayList<Integer> discos) {}
	
	public TorreDeRanoi(int n) {
		m = n;
		ArrayList<Integer> discos = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i++) {
			discos.add(i);
 		}
		
		this.pino = new pino[3+1];
		pino[1] = new pino(discos);
		pino[2] = new pino(new ArrayList<Integer>());
		pino[3] = new pino(new ArrayList<Integer>());

	}
	
	public void teste() {
		mover(m, 1, 3, 2);
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("pino" + i +" = " + pino[i].discos.toString()+"***");
		}
	}
	
	public void mover(int n, int origem, int destino, int auxiliar) {
		if(n == 1) {
			pino[destino].discos.add(pino[origem].discos.removeLast()); 
		}
		if(n > 1) {
			pino[destino].discos.add(pino[origem].discos.removeLast());
			if(pino[origem].discos.size() > 0) {
				pino[auxiliar].discos.add(pino[origem].discos.removeLast());
			}
			mover(n-1, auxiliar, destino, origem);	
		}
	}
	
}
