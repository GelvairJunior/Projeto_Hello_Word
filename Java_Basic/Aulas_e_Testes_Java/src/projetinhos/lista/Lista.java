package projetinhos.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	ArrayList lista = new ArrayList();
	ArrayList mensagem = new ArrayList();
	ArrayList<Integer> id = new ArrayList();
	
	public void mostrar() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua tarefa: ");
		adicionarLista(scan.next());
		
		System.out.print("Digite outra tarefa: ");
		adicionarLista(scan.next());
		
		listarLista();
	}
	
	void listarLista() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	void adicionarLista(String mensagem) {
		id.add(idIncrement());
		this.mensagem.add(mensagem);
		
		lista.add(id.getLast()+ " | " + this.mensagem.getLast());
	}
	
	void concluirLista(int i) {
		System.out.println("Removendo a tarefa " + i);
		lista.remove(i);
		id.remove(i);
		mensagem.remove(i);
		
		listarLista();
	}
	
	private int idIncrement() {
		int ids;
		ids = id.size();
		
		return ids;
	}
}
