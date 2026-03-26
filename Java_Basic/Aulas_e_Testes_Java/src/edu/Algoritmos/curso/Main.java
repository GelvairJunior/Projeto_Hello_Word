package edu.Algoritmos.curso;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import edu.Algoritmos.curso.lista.Fifo;
import edu.Algoritmos.curso.lista.ListaDuplamenteEncadeadas;
import edu.Algoritmos.curso.lista.ListaEncadeada;
import edu.Algoritmos.curso.lista.No;
import edu.Algoritmos.curso.lista.Pilha;


public class Main {

	public static void main(String[] args) {
		Objeto obj = new Objeto(5);
		System.out.println(obj);
		System.out.println("--------------------------");
		System.out.println("Nós e Encadeamento de Nós com Generics de java");
		
		Nós<String> no1 = new Nós( "Conteudo no1");
		
		Nós<String> no2 = new Nós("Conteudo no2");
		no1.setProximoNo(no2);
		
		Nós<String> no3 = new Nós("Conteudo no3");
		no2.setProximoNo(no3);
		
		Nós<Integer> no4 = new Nós(1);
		no3.setProximoNo(no4);
		
		//no1->no2->no3->no4->null
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		
		System.out.println("-------------------");

		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
		
		System.out.println("-------------------------------");
		
		System.out.println("Pilha/Lifo");
		
		Pilha<Integer> minhaPilha = new Pilha<Integer>();
		
		minhaPilha.push(1);
		minhaPilha.push(2);
		minhaPilha.push(3);
		minhaPilha.push(4);
		minhaPilha.push(5);
		minhaPilha.push(6);
		minhaPilha.push(7);
		minhaPilha.push(8);
		
		System.out.println(minhaPilha);
		
		System.out.println(minhaPilha.pop());
		System.out.println(minhaPilha.pop());
		
		System.out.println(minhaPilha);
		
		minhaPilha.push(99);
		System.out.println(minhaPilha);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Fila/FIFO");
		
		Fifo<String> minhaFila = new Fifo<String>();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("");
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Lista Encadeada");
		
		ListaEncadeada<String> lista = new ListaEncadeada<String>();
		
		lista.add("teste 1");
		lista.add("teste 2");
		lista.add("teste 3");
		lista.add("teste 4");
		
		System.out.println(lista);
		System.out.println("Pegando "+lista.get(3));
		System.out.println("Removendo "+ lista.remove(2));
		System.out.println("Lista de tamanho: "+lista.size());
		System.out.println(lista);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("Lista Duplamente Encadeadas");
		
		ListaDuplamenteEncadeadas<String> listas_Duplas = new ListaDuplamenteEncadeadas<String>();
		
		listas_Duplas.add("Teste 1");
		listas_Duplas.add("Teste 2");
		listas_Duplas.add("Teste 3");
		listas_Duplas.add("Teste 4");
		listas_Duplas.add("Teste 5");
		
		System.out.println(listas_Duplas);
		
		listas_Duplas.add(3, "Teste 3.5");
		
		System.out.println(listas_Duplas);
		
		System.out.println(listas_Duplas.remove(2));;
		
		System.out.println(listas_Duplas);
	}
}
