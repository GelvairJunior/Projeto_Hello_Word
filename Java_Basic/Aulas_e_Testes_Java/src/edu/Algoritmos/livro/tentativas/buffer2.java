package edu.Algoritmos.livro.tentativas;

import java.util.ArrayList;
import java.util.List;
import edu.Algoritmos.livro.FileSystem;

public class buffer2 {
	public static final int N = 1024;
	public static final int Nc = 128;
	public static final int Np = 16;
	
	static int in;
	static int out;
	static int nf;
	static int ne;
	static Semaforo nonFull = new Semaforo();
	static Semaforo nonEmpty = new Semaforo();
	static int[] buf = new int[N-1];	
	
	
	public static void main(String[] args) {
		ne = N;
		nf = 0;
		in = 0;  
		out = 0;
		
		nonFull.init(true);  // buffer inicialmente vazio -> pode escrever
	    nonEmpty.init(false); // não há nada ainda -> não pode ler	
	}
	
	public static void deposit(int x) {
		ne = ne-Np;
		
		try {
			if (ne < 0) {
				System.out.println("Produtor esperando (buffer cheio)");
				nonFull.waitSignal();
			}
			for(int i = 0; i == Np - 1; i++) {
				buf[in] = (x);
				in++;			
			}
			if (in == N) {in = 0;}
			nf = nf + Np;
			if (nf >= 1) {nonEmpty.sendSignal();}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void fetch() {
		int[] x = null;
		try {
			if (nf < 0) {
				System.out.println("O buffer esta vazio");
				nonEmpty.waitSignal();
			}
			for(int i = 0; i == Nc; i++) {
				x[i] = buf[out];
				out = out+1;
			}
			if(out == N) {out = 0;}
			ne = ne + Nc;
			if (ne >= 0) {nonFull.sendSignal();}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}