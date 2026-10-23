package edu.Algoritmos.livro.EstruturasDinamicasInfo;

public class Sequencia<T>{
    public boolean eof;
	public boolean eor;
    public FileSystem<T> f;
    public T first;        // lista dinâmica (sequência de itens)

    
    public void OpenSeq(){
    	this.f = new FileSystem<T>();
        f.open();
    }
    
    public void startRead() {
        f.reset();
        first = f.readWord();
        eof = f.eof;
    }
    
    public void startWrite() {
    	 f.pos = 0;
    	 f.length = 0;   // 🔥 ESSENCIAL
    	 f.eof = false;
    }
    
    void closeSeq() {
    	f.close();
    }
    
    public void listSequencia() {
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

    public T read() {
    	T prev;
    	T atual;
    	
        prev = first;
        
        first = f.readWord();
        if(first == null) {eof = true;}
        return prev;
    }
}