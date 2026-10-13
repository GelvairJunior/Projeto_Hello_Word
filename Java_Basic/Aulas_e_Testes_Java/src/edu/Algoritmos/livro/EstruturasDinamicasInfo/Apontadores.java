package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Apontadores<T> {
	T p = null;

	public Apontadores() {
		super();
	}
	
	public Apontadores(T p) {
		super();
		this.p = p;
	}

	public void proximo(T p) {
		this.p = p;
	}

}
