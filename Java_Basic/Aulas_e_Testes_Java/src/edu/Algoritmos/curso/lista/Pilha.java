package edu.Algoritmos.curso.lista;
    
public class Pilha<T>{
    
	private No<T> refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public void push(T objeto) {
		No novoNo = new No(objeto);
		No auxiliarNo = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		novoNo.setRefNo(auxiliarNo);
	}
	
	public T pop() {
		if(!isEmpty()) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return (T) noPoped.getObject();
		}
		return null;
	}
	
	public Object top() {
		return refNoEntradaPilha.getObject();
	}
	
	public boolean isEmpty() {
		
		return refNoEntradaPilha == null ? true : false;
	}
    
	@Override
	public String toString() {
	
		String stringRetorno = "--------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado="+ noAuxiliar.toString()+"}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		
		stringRetorno += "=================";
		return stringRetorno;
	}
	
}