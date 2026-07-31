package edu.Algoritmos.livro.recursividade;

public class Homem {
	Mulher[] pref;
	Rank[] r;
	String name;
	
	public Homem(String name) {
		this.name = name;
	}
	
	public void raneando(Mulher[] w, int[] s) {
		r = new Rank[w.length];
		this.pref = w;
		
		for(int i = 0; i < r.length; i++) {
			r[i] = new Rank();
		}
		for(int i = 0; i < r.length; i++) {
			r[s[i]].w = this.pref[i];
		}
	}
}
