package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class TopologiaLista {
	private Apontadores<Leader> head, tail, p, q; Apontadores<Trailer> t;
	private int n;
	
	public class Leader{int key; int count; Apontadores<Trailer> trail; Apontadores<Leader> next;}
	public class Trailer{Apontadores<Leader> id; Apontadores<Trailer> next;}
	
	public Apontadores<Leader> find(int w) {
		Apontadores<Leader> h = head; tail.p.key = w;
		while (h.p.key != w) {h = h.p.next;}
		if(h == tail) {
			n++;
			h = new Apontadores<Leader>(); h.p = new Leader();
			h.p.key = w; h.p.count = 0; h.p.trail = null; h.p.next = head; head = h;
		}
		return h;
	}
	
	public void addPreRequisito(int x, int y) {
		p = find(x); q = find(y);
		t = new Apontadores<Trailer>(); t.p = new Trailer();
		t.p.id = q; t.p.next = p.p.trail;
		p.p.trail = t; q.p.count = q.p.count + 1;
	}

	private void busca_premanbulos() {
		p = head; head = null;
		while(p != tail) {
			q = p; p = q.p.next;
			if(q.p.count == 0) {
				q.p.next = head; head = q;
			}
		}
	}
	
	public void ordParc() {
		busca_premanbulos();
		q = head;
		while(q != null) {
			System.out.println("chave: "+q.p.key); n--;
			t = q.p.trail; q = q.p.next; 
			while(t != null) {
				p = t.p.id; p.p.count = p.p.count-1;
				if(p.p.count == 0) {
					p.p.next = q; q = p;
				}
				t = t.p.next;
			}
		}
		if(n != 0) {System.out.println("Este conjunto não é parcialmente ordenado");}
		else {System.out.println("Este conjunto é parcialmente ordenado");}
	}
	
	public void printList() {
		Apontadores<Leader> w = head;
		while(w != null) {
			System.out.print("Key: " + w.p.key+ " |");
			System.out.println("Qtd: " + w.p.count);
			w = w.p.next;
		}
	}
	
	public TopologiaLista() {
		this.head = new Apontadores<Leader>(); this.t = new Apontadores<Trailer>();
		this.tail = head; n = 0; this.head.p = new Leader();
	}
	
}