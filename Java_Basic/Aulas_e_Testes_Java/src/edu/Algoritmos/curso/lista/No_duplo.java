package edu.Algoritmos.curso.lista;

public class No_duplo<T> {
	
	private T conteudo;
	private No_duplo<T> noProximo;
	private No_duplo<T> noPrevio;
	
	public No_duplo(T conteudo) {
		super();
		this.conteudo = conteudo;
	}
	

	public T getConteudo() {
		return conteudo;
	}
	
	
	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	
	public No_duplo<T> getNoProximo() {
		return noProximo;
	}
	
	
	public void setNoProximo(No_duplo<T> noProximo) {
		this.noProximo = noProximo;
	}
	
	
	public No_duplo<T> getNoPrevio() {
		return noPrevio;
	}
	
	
	public void setNoPrevio(No_duplo<T> noPrevio) {
		this.noPrevio = noPrevio;
	}
	
	
	@Override
	public String toString() {
		
		return "No_duplo [conteudo=" + conteudo + "]";
		
	}
	
	
}
