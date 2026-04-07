package edu.Algoritmos.curso.arvores;

import edu.Algoritmos.curso.arvores.models.Obj;

public class main {

	public static void main(String[] args) {
		ArvoreBinaria<Obj> arvore = new ArvoreBinaria<>();

		System.out.println("Aqui estamos utilizando a Estrutura de Dadps de Arvore Binaria");
		System.out.println("Vamos utilizar com valores numericos");
		Obj[] obj = new Obj[10];
		
		arvore.inserir(obj[0] = new Obj(13));
		arvore.inserir(obj[1] = new Obj(10));
		arvore.inserir(obj[2] = new Obj(25));
		arvore.inserir(obj[3] = new Obj(12));
		arvore.inserir(obj[4] = new Obj(2));
		arvore.inserir(obj[5] = new Obj(20));
		arvore.inserir(obj[6] = new Obj(31));
		arvore.inserir(obj[7] = new Obj(29));
		
		System.out.println();
		arvore.exibirInOrdem();
		arvore.exibirPosOrdem();
		arvore.exibirPreOrdem();
		
		arvore.inserir(obj[8] = new Obj(32));
		
		arvore.exibirInOrdem();
		
		arvore.remover(obj[7]);
		arvore.remover(obj[6]);
		// os que dao problema são 6, 2, 1 e o 0 (só da erro quando tem Filhos a direita)
		arvore.exibirPreOrdem();
		System.out.println("");
		
		
	}
}
