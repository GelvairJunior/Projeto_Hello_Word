package edu.Algoritmos.curso;

public class Nós<T>{
	
	private T conteudo;
	private Nós<T> proximoNo;
	
	public Nós(T conteudo) {
		super();
		this.conteudo = conteudo;
		this.proximoNo = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public Nós getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(Nós proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "Nós{" + "Conteudo = '" + conteudo +'\''+ '}';
	}
	
	
	
}
