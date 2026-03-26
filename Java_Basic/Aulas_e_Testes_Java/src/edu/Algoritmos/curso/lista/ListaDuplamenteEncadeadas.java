package edu.Algoritmos.curso.lista;

public class ListaDuplamenteEncadeadas<T> {
	
	private No<T> primeiroNo;
	private No<T> ultimoNo;
	private int tamanhoLista; 
	
	public ListaDuplamenteEncadeadas() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	private No<T> getNo(int index) {
		No<T> noAuxiliar = primeiroNo;
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		return noAuxiliar;
	}
	
	public T get(int index) {
		return this.getNo(index).getObject();
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	public void add(T elemento) {
		No<T> novoNo = new No<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		
		if(primeiroNo == null) {
			primeiroNo = novoNo;
		}
		
		if(ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		
		ultimoNo = novoNo;
		
		this.tamanhoLista++;
	}
	
	public void add(int index, T elemento) {
		No<T> noAuxiliar = getNo(index);
		No<T> novoNo = new No<>(elemento);
		novoNo.setNoProximo(noAuxiliar);
		
		if(novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
		}else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if(index == 0) {
			primeiroNo = novoNo;
		}else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
		}
		
		this.tamanhoLista++;
	}
	
	public T remove(int index) {
		No<T> noAuxiliar = getNo(index);
		if(index == 0) {
			primeiroNo = primeiroNo.getNoProximo();
			if(primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
			}
		}else {
			noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
			if(noAuxiliar != ultimoNo) {
				noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
			}else {
				ultimoNo = noAuxiliar;
			}
		}
		
		this.tamanhoLista--;
		return noAuxiliar.getObject();
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = primeiroNo;
		for(int i = 0; i < size(); i++) {
			strRetorno += "[No{conteudo="+noAuxiliar.getObject() + "}] --->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		strRetorno += "null";
		
		return strRetorno;
	}

	
	
}
