package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Listas {
	public class Word{String key; int count; Word next;}
	Word sentinel = new Word();
	Word root = sentinel;
	
	public void searchInListOrd(String x) {
		Word w1, w2; w1 = root; sentinel.key = x; 
		if(w1 == sentinel) {root = new Word(); root.key = x; root.count = 1; root.next = sentinel;}
		else if(w1.key.equals(x)) {w1.count = w1.count + 1;}
		else {
			
			do{
				w2 = w1; w1 = w2.next;
			}while(!w1.key.equals(x));
			
			if(w1 == sentinel) {
				w2 = root; root = new Word();
				root.key = x; root.count = 1; root.next = w2;
			}else {
				w1.count = w1.count + 1; 
				w2.next = w1.next; w1.next = root; root = w1;
			}
		}
	}
	
	public void searchOrd(String x) {
		Word w1, w2, w3; w2 = root; w1 = w2.next;
		while(w1 != null && w1.key.compareTo(x)<0)  {w2 = w1; w1 = w2.next;}
		if(w1 == null || w1.key.compareTo(x)>0) {
			w3 = new Word(); w2.next = w3;
			w3.key = x; w3.count = 1; w3.next = w1;
		}else {w1.count = w1.count + 1;}
	}
	
	public void search(String x) {
		Word w = root; sentinel.key = x;
		while(!w.key.equals(x))  {w = w.next;}
		if(w == sentinel) {
			w = new Word();
			w.key = x; w.count = 1; w.next = root; root = w;
		}else {w.count = w.count + 1;}
	}
	
	public void printList() {
		Word w = root.next;
		while(w != null) {
			System.out.print("Key: " + w.key+ " |");
			System.out.println("Qtd: " + w.count);
			w = w.next;
		}
	}

	public void iniciar(String[] words) { for(int i = 0; i < words.length; i++) {String k = words[i].toLowerCase(); searchInListOrd(k); } }
}
