package edu.Algoritmos.curso.lista;

public class ListaEncadeada<T>{

	No<T> referenciaEntrada;
	
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	public void add(T conteudo) {
		
		No<T> novoNo = new No<>(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for(int i=0; i < this.size()-1; i++) {
			noAuxiliar = noAuxiliar.getRefNo();
		}
		
		noAuxiliar.setRefNo(novoNo);
	}
	
	public T remove(int index) {
		
		No<T> noPivor = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noPivor.getRefNo();
			return noPivor.getObject();
		}
		
		No<T> noAnterior = getNo(index-1);
		noAnterior.setRefNo(noPivor.getRefNo());
		return noPivor.getObject();
	
	}
	
	public T get(int index) {
		return getNo(index).getObject();
	}
	
	private No<T> getNo(int index) { //internamente
		
		validarIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for(int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getRefNo();
		}
		
		return noRetorno;
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while (true) {
			if(referenciaAux != null) {
				tamanhoLista++;
				if(referenciaAux.getRefNo() != null) {
					referenciaAux = referenciaAux.getRefNo(); 
				}else {
					break;
				}
			}else{
				break;
			}
		}
		
		return tamanhoLista;
	}
	
	private void validarIndice(int index) {
		if (index >= size()){
			throw new IndexOutOfBoundsException("Não existe o indice "+ index + " na lista, o ultimo indice da lista é "+ (size()-1) + "."); 
		}
	}
	
	boolean isEmpty(){
		return referenciaEntrada == null ? true : false;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "No[conteudo=" + noAuxiliar.getObject() + "]-->";;
			noAuxiliar = noAuxiliar.getRefNo();
		}
		strRetorno += "null";
		
		return strRetorno;
	}
	
	
}
