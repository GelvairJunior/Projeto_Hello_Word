package edu.Algoritmos.curso.lista;

public class ListaCircular<T> {
	
	private No<T> cauda;
	private No<T> cabeca;
	private int tamanhoLista;
	
	public ListaCircular() {
		this.cabeca = null;
		this.cauda = null;
		this.tamanhoLista = 0;
	}

	public T get(int index) {
		return this.getNo(index).getObject();
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	public boolean isEmpty() {
		return tamanhoLista == 0;
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty()) {throw new IndexOutOfBoundsException("A lista está vazia");}
		
		if(index == 0) {
			return this.cabeca;
		}
		
		No<T> noAuxiliar = this.cabeca;
		for(int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getRefNo();
		}
		
		return noAuxiliar;
	}
	
	public void remove(int index) {
		if(index >= this.tamanhoLista) {throw new IndexOutOfBoundsException("O index é maior que a lista");}
		
		
		
		No<T> noAuxiliar = cabeca;
		
		if(index == 0) {
			
			this.cauda = this.cauda.getRefNo();
			this.cabeca.setRefNo(this.cauda);
			
		}else if(index == 1) {
			
			this.cauda.setRefNo(this.cauda.getRefNo().getRefNo());
			
		}else {
			
			for(int i = 0; i < index-1; i++) {
				noAuxiliar = noAuxiliar.getRefNo();
			}
			
			noAuxiliar.setRefNo(noAuxiliar.getRefNo().getRefNo());
			
		}
	
		tamanhoLista--;
		
		//return noRemovido;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if(this.tamanhoLista == 0) {
			
			this.cabeca = novoNo;
			this.cauda = this.cabeca;
			this.cabeca.setRefNo(cauda);
			
		}else {
			
			novoNo.setRefNo(this.cauda);
			this.cauda.setRefNo(novoNo);
			this.cauda = novoNo;
			
		}
		
		this.tamanhoLista++;
		
	}

	@Override
	public String toString() {
		String strRetorno = "";
		
		No<T> noAuxiliar = this.cabeca;
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[No{conteudo="+ noAuxiliar.getObject() + "}]---->";
			noAuxiliar = noAuxiliar.getRefNo();
		}
			
		strRetorno += this.isEmpty() != true ? "(Retorna ao inicio)" : "[]";
		
		return strRetorno;
	}
	
	
}
