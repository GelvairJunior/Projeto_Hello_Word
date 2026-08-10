package edu.Algoritmos.livro.exercicios.cap2;

import edu.Algoritmos.livro.ordenacao.Item;
import edu.Algoritmos.livro.ordenacao.Sequencia;

public class test {
	public static void main(String[] args) {
		Exercicios_Capa_2 text = new Exercicios_Capa_2();
		Sequencia<Item> sequencia = new Sequencia<Item>(); 
		Item[] tabela = new Item[30];
		int[] des = {0,8,40,45,7,6,9,12,15,16,34,32,38,14,24,26,28,27,92,1,20,29,25,29,65,3,42,55,44,68};
		String[] sas = { "A","L","G","O","R","I","T","M","O","_","E","_","E","S","T","R","U","T","U","R","A", "_", "D", "E", "_", "D", "A", "D", "O", "S"};

		System.out.println("dado bruto");
		for(int i = 0; i < tabela.length; i++) {
			tabela[i] = new Item(des[i], sas[i]);
			System.out.println(tabela[i]);
			
		}
		
		sequencia.OpenSeq();
		sequencia.startWrite();
		
		for(int i = 0; i < tabela.length; i++) {
			sequencia.f.writeWord(tabela[i]);
		}
		
		System.out.println("_______________________________________________________");
		//text.QuickBubbleSort(tabela);
		//text.QuickSelection(tabela);
		//text.ordQuickSortMenorMaior(tabela);
		//text.ordFusaoNaturalDireta(tabela);
		
		text.ordCascata(sequencia);
		
		System.out.println("resultado");
		for(int i = 0; i < tabela.length; i++) {System.out.println(tabela[i]);}
		//sequencia.listSequencia();
	}
}
