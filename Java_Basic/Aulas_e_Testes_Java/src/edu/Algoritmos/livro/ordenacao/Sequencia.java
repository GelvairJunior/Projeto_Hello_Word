package edu.Algoritmos.livro.ordenacao;

import edu.Algoritmos.livro.ordenacao.Sequencia;

public class Sequencia<T extends ComparableKey>{
    boolean eof, eor;
    FileSystem<T> f;
    T first;        // lista dinâmica (sequência de itens)

    
    void OpenSeq(){
    	this.f = new FileSystem<T>();
        f.open();
    }
    
    void startRead() {
        f.reset();
        first = f.readWord();
        eof = f.eof;
    }
    
    void startWrite() {
    	 f.pos = 0;
    	 f.length = 0;   // 🔥 ESSENCIAL
    	 f.eof = false;
    }
    
    void closeSeq() {
    	f.close();
    }
    
    void listSequencia() {
        f.reset();
        Object w;

        while ((w = f.readWord()) != null) {
            System.out.println(w);
        }

        f.reset();
    	
    }
    
    void copy(Sequencia<T> x) {
    	f.writeWord((T) x.first);
    }

    void read() {
    	T prev;
    	T atual;
    	
    	// pensar como arrimar essa gambiarra
        prev = first;

        first = f.readWord();
        
        atual = first;
        
        if (first == null) {
            eof = true;
            eor = true;
            return;
        }

        if (prev != null && atual.getKey() < prev.getKey()) {
            eor = true;
        } else {
            eor = false;
        }
        
    }
}