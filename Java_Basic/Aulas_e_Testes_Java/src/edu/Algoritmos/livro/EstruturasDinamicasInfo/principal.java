package edu.Algoritmos.livro.EstruturasDinamicasInfo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class principal {
	
	public static void main(String args[]) {
		//recursivo();
		System.out.println("________________________________________");
		//lists();
		System.out.println("________________________________________");
		//listOrd();
		System.out.println("________________________________________");
		//topologiaList();
		System.out.println("________________________________________");
		Arvores_principal.main();
		
	}
	
	public static void topologiaList() {
		TopologiaLista list = new TopologiaLista();
		int[] x = {1, 2, 4, 2, 4, 6, 1, 3, 5, 7, 7, 9, 9};
		int[] y = {2, 4, 6, 10,8, 3, 3, 5, 8, 5, 9, 4, 10};
		for(int i = 0; i < x.length; i++) {
			list.addPreRequisito(x[i], y[i]);// y é um pré-requisito de x; x < y
		}
		list.ordParc();
	}

	public static void listOrd()  {
		String caminhoArquivo = "C:/Users/gabri/OneDrive/Área de Trabalho/oreilly_getting_started_with_sql-master/Dev/Git/Projeto_Hello_Word/Java_Basic/Aulas_e_Testes_Java/src/edu/Algoritmos/livro/EstruturasDinamicasInfo/texto.txt";
		BufferedReader leitor = null;
		FileReader leitorArquivo;
		try {
			leitorArquivo = new FileReader(caminhoArquivo);
			leitor = new BufferedReader(leitorArquivo);
			Listas list = new Listas();
			String line;
			try {
				line = leitor.readLine();
				String[] s = line.split(" ");
				while(line != null) {list.iniciar(s); s = line.split(" "); line = leitor.readLine();}
				list.printList();
			} catch (IOException e) {e.printStackTrace();}
		} catch (FileNotFoundException e) {e.printStackTrace();} 
		
	}
	
	public static void lists() {
		Lista_Apontadores_Explicito list = new Lista_Apontadores_Explicito();
		list.addFimInicio(10);
		list.varrer();
		System.out.println("--------------");
		list.addFila(4, 7);
		list.addFila(10);
		list.varrer();
		System.out.println(list.busca(4).nome);
		list.remover(10);
		System.out.println("--------------");
		list.varrer();
	}
	
	public static void recursivo() {
		estrutura_recursiva junior1 = new estrutura_recursiva("junior", true, true);
		junior1.mostrar_parentes();
		Apontadores_Explicito junior = new Apontadores_Explicito("junior");
		Apontadores_Explicito jose = new Apontadores_Explicito("jose");
		Apontadores_Explicito maria = new Apontadores_Explicito("maria");
		junior.add(); jose.add("nailson", true); maria.add("nathalia", false);
		jose.mae.p = maria.mae.p;
		junior.mae.p.pai.p = jose; junior.mae.p.mae.p = maria;
		junior.mostrar_parentes();
	}
}