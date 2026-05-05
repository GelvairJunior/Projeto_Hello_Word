package edu.Algoritmos.livro.ordenacao;

public class OrdenacaoPrincipal {
	public static void main(String[] args) {
		Ordenacao_De_Vetores_Direta ordV = new Ordenacao_De_Vetores_Direta();
	
		Item[] tabela = new Item[24];
		Item[] tabela2 = new Item[24];
		int[] des = { 0,8,40,45,7,6,9,12,15,16,34,32,38,14,24,26,28,27,92,1,20,29,25,29};
		String[] sas = { "A","L","G","O","R","I","T","M","O","_","E","_","E","S","T","R","U","T","U","R","A", "_", "D", "E", "_"};
		//9, 5, 3, 4,"$", "$", "$", "$",
		
		System.out.println("dado bruto");
		for(int i = 0; i < tabela.length; i++) {
			tabela[i] = new Item(des[i], sas[i]);
			tabela2[i] = new Item(des[i], sas[i]);
			System.out.println(tabela[i]);
		}
		
		
		
		System.out.println("=========================================");
		
		//tabela2 = ordV.ordInsercao(tabela2);
		//tabela2 = ordV.ordSelecao(tabela2);
		//tabela2 = ordV.ordBubbleSort(tabela2);
		//tabela2 = ordV.ordShakerSort(tabela2);
		//tabela2 = ordV.ordInsecaoSofisticado(tabela2);
		//tabela2 = ordV.ordHeap(tabela2);
		tabela2 = ordV.ordQuick(tabela2, 0, tabela2.length-1);
		//tabela2  = ordV.ordNonRecursiveQuick(tabela2);
		//System.out.println(ordV.findMediana(tabela2));
		
		
		//tabela = ordV.ordenacaoPorFusaoVetores(tabela);
		
		System.out.println("--------------------------------------------");
		
		Sequencia<Item> sequencia = new Sequencia<Item>(); 
		Ordenacao_Sequencial ordS = new Ordenacao_Sequencial();
		
		sequencia.OpenSeq();
		sequencia.startWrite();
		
		for(int i = 0; i < tabela.length; i++) {
			sequencia.f.writeWord(tabela[i]);
		}
		
		//sequencia = ordS.ordNaturalMerge(sequencia);
		sequencia = ordS.ordBalancedMerge(sequencia);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Aqui é ordenação de vetores");
		for(int i = 0; i < tabela2.length; i++) {
			System.out.println(tabela2[i]);
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Aqui é ordenação de sequencias");
		sequencia.listSequencia();
	}
}
