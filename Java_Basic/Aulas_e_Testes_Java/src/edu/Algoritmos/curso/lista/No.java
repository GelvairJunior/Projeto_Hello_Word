package edu.Algoritmos.curso.lista;

public class No<T>{
	
	private T object;
	private No refNo;
	
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
}
