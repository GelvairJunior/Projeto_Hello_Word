package edu.Algoritmos.livro.tentativas;

import java.util.ArrayList;
import java.util.List;
import edu.Algoritmos.livro.FileSystem;

public class Buffer {
	public static final int N = 1024;
	static int n;
	static int in;
	static int out;
	static Semaforo nonFull = new Semaforo();
	static Semaforo nonEmpty = new Semaforo();
	static ArrayList buf = new ArrayList(N-1);	
	
	
	public static void main(String[] args) {
		nonFull.init(true);  // buffer inicialmente vazio -> pode escrever
	    nonEmpty.init(false); // não há nada ainda -> não pode ler	
	}
	
	public static void deposit(int x) {
		try {
			if (n == N) {
				System.out.println("Produtor esperando (buffer cheio)");
				nonFull.waitSignal();
			}
			n++;
			buf.add(x);
			in = (in+1) % N;
			if (n == 1) {nonEmpty.sendSignal();}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void fetch() {
		String x;
		try {
			if (n == 0) {
				System.out.println("O buffer esta vazio");
				nonEmpty.waitSignal();
			}
			n--;
			x = (String) buf.get(out);
			out = (out+1) % N;
			
			if (n == N-1) {nonFull.sendSignal();}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
