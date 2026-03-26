package edu.Algoritmos.curso.lista;

public class No<T>{
	
	private T object;
	private No refNo;
	private No<T> noProximo;
	private No<T> noPrevio;
	
	public No(T obj, No proximoNo) {
		super();
		this.object = obj;
		this.refNo = proximoNo;
	}
	
	public No(T obj) {
		super();
		this.refNo = null;
		this.object = obj;
	}
	
	public No() {
		super();
		this.refNo = null;
	}
	
	
	
	public No<T> getNoProximo() {
		return noProximo;
	}
	
	public No<T> getNoPrevio() {
		return noPrevio;
	}
	
	
	public void setNoPrevio(No<T> noPrevio) {
		this.noPrevio = noPrevio;
	}
	
	public void setNoProximo(No<T> noProximo) {
		this.noProximo = noProximo;
	}
	
	
	
	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}

	public T getObject () {
		return object;
	}

	public void setDado(T obj) {
		this.object = obj;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
	
	public String toStringEncadeado() {
		String str = "No [object=" + object + "]";
		
		if(refNo != null) {
			str += "->" + refNo.toString();
		}else {
			str += "->null";
		}
		
		return str;
		
	}
	
	public String toStringEncadeadoDuplo() {
		String str = "No [object=" + object + "]";
		
		
		
		return str;
		
	}
}
