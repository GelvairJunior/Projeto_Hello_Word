package edu.Algoritmos.livro.ordenacao;

public class OrdenacaoPrincipal {
	public static void main(String[] args) {
		Ordenacao_De_Vetores_Direta ordV = new Ordenacao_De_Vetores_Direta();
		Item[] tabela = new Item[23];
		int[] des = { 0,8,40,45,7,6,9,12,15,16,34,32,38,14,24,26,28,27,92,1,20,17,22, 21};
		String[] sas = { "A","L","G","O","R","I","T","M","O","_","E","_","E","S","T","R","U","T","U","R","A", "_", "D", "E", "_"};
		//9, 5, 3, 4,"$", "$", "$", "$",
		
		
		for(int i = 0; i < tabela.length; i++) {
			tabela[i] = new Item(des[i], sas[i]);
		}
		for(int i = 0; i < tabela.length; i++) {
			System.out.println(tabela[i]);
		}
		//tabela = ordV.ordInsercao(tabela);
		//tabela = ordV.ordSelecao(tabela);
		//tabela = ordV.ordBubbleSort(tabela);
		//tabela = ordV.ordShakerSort(tabela);
		//tabela = ordV.ordInsecaoSofisticado(tabela);
		//tabela = ordV.ordHeap(tabela);
		//tabela = ordV.ordQuick(tabela, 0, tabela.length-1);
		//tabela = ordV.ordNonRecursiveQuick(tabela);
		System.out.println(ordV.findMediana(tabela));
		
		System.out.println("--------------------------------------------");
		
		for(int i = 0; i < tabela.length; i++) {
			System.out.println(tabela[i]);
		}
	}
}
