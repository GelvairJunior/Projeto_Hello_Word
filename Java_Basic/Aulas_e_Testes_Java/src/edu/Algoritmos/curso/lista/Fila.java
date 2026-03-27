package edu.Algoritmos.curso.lista;

public class Fifo<T>{

	private No<T> refNoEntradaFila;
	
	public Fifo(){
		No refNoEntradaFila = null;
	}
	
	public T first() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				} else {
					break;
				}
				
			}
			return (T) primeiroNo.getObject();
		}
		
		return null;
	}
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while (true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				} else {
					noAuxiliar.setRefNo(null);
					break;
				}
				
			}
			return (T) primeiroNo.getObject();
		}
		
		return null;
	}
	
	public void enqueue(T objeto) {
		No novoNo = new No(objeto);
		novoNo.setRefNo(refNoEntradaFila);;
		refNoEntradaFila = novoNo;
	}
	
	public boolean isEmpty() {
		return refNoEntradaFila == null ? true : false;
	}
	
	public String toString() {
		String stringRetorno = "";
		
		No noAuxiliar = refNoEntradaFila;
		if(refNoEntradaFila != null){
			while(true) {
				stringRetorno += "[No{dado="+ noAuxiliar.toString()+"}]---->";
				
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					stringRetorno += "null\n";
					break;
				}
				
			}
		}else {
			stringRetorno += "null\n";
		}
	
		stringRetorno += "=================";
		return stringRetorno;
	}
}
