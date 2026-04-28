package edu.Algoritmos.livro.ordenacao;

import edu.Algoritmos.livro.ordenacao.Sequencia;

public class Sequencia<Object>{   
    boolean eof;
    FileSystem<Object> f;
    Object first;        // lista dinâmica (sequência de itens)
    
    void OpenSeq(){
    	this.f = new FileSystem<Object>();
        f.open(this.f);
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
    
    void copy(Sequencia<Object> x) {
    	f.writeWord(x.first);
    }

    void read() {
        first = f.readWord();   // 🔥 lê próximo item
        eof = f.eof;
    }
    
}