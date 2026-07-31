package edu.Algoritmos.livro.recursividade;

public class Mulher {
	Homem[] pref;
	Rank[] r;
	String name;
	
	public Mulher(String name) {
		this.name = name;
	}
	
	public void raneando(Homem[] m, int[] s) {
		r = new Rank[m.length];
		this.pref = m;
		
		for(int i = 0; i < r.length; i++) {
			r[i] = new Rank();
		}
		for(int i = 0; i < r.length; i++) {
			r[s[i]].m = this.pref[i];
		}
	}
	
	public void rankeamento() {
		for(int i = 0; i < pref.length; i++) {
			System.out.println("rank: " + i + ":" + r[i].m.name);
		}
	}
}
