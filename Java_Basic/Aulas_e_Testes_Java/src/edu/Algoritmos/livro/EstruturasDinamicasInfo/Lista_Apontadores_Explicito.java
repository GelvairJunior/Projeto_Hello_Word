package edu.Algoritmos.livro.EstruturasDinamicasInfo;
import java.util.Random;

public class Lista_Apontadores_Explicito {
	public class Node{int key; Apontadores<Node> next = null; String nome; }
	Apontadores<Node> p;
	Node entrada, saida;
	Random random = new Random();
	
	public void addFimInicio(int n) {
		p = null; Apontadores<Node> q = null;
		
		int fim = n;
		while(n>0) {
			q = new Apontadores<Node>(); q.p = new Node();
			if(fim == n) {saida = q.p;}
			q.p.next = p; p = q;
			q.p.key = random.nextInt(99); n--;
			q.p.nome = randomWord(6);
		}
		entrada = q.p;
	}
	
	public void addFila(int n, int pos) {
		Apontadores<Node> q = new Apontadores<Node>();
		q.p = entrada; int i = 0;Apontadores<Node> t;
		Node r = new Node(); r.key = n; r.nome = randomWord(5);
		while(q != null && pos > i) { q = q.p.next; i++; }
		t = q.p.next; q.p = r; r.next = t;
	}
	
	public void addFila(int n) {
		Apontadores<Node> q = new Apontadores<Node>();
		q.p = entrada;Apontadores<Node> t = new Apontadores<Node>();
		Node r = new Node(); r.key = n; r.nome = randomWord(5);t.p = r;
		while(q.p.next != null) {q = q.p.next;}
		q.p.next = t;
	}
	
	public Node remover(int i) {
		Node q; Apontadores<Node> v = new Apontadores<Node>(); v.p = entrada;
		q = busca(i);
		while(v.p.next != null && v.p.next.p!= q) {v = v.p.next;}
		if(v.p.next.p.next == null) {v.p.next = null;}
		else {v.p.next.p = q.next.p;}
		System.out.println(v.p.key);
		return q;
	}
	
	public Node busca(int i) {
		Apontadores<Node> q = new Apontadores<Node>(); q.p = entrada;
		while(q != null && q.p.key != i) {q = q.p.next;}
		return q.p;
	}
	
	public void varrer() {
		Apontadores<Node> q = new Apontadores<Node>();
		q.p = entrada;
		while(q != null) {
			System.out.println("key:  " + q.p.key);
			System.out.println("nome: " + q.p.nome);
			q = q.p.next;
		}
	}
	
	
	public String randomWord(int qtdLetter) {
		char[] letter = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String name = "";
		for(int i = 0; i<qtdLetter; i++) {name = name + letter[random.nextInt(letter.length)];}
		return name;
	}
}
