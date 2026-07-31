package edu.Algoritmos.livro.ordenacao;

import edu.Algoritmos.livro.ordenacao.ComparableKey;

public class Item implements ComparableKey{
    public int key;
    String nome;

    public Item(int key, String nome){
        this.key = key;
        this.nome = nome;
    }

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Item [key=" + key + ", nome=" + nome + "]";
	}
	
	
}