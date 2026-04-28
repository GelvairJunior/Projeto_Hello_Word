package edu.Algoritmos.livro.ordenacao;

public class FileSystem<Object> {
    // Constante máxima (limite teórico de dados)
	final int MAX_LENGTH = 4096;
	
	boolean eof = false;
	int pos;
	int length;
	Object[] data;

    // Abre / inicializa uma nova sequência
    void open(FileSystem<Object> f) {
        f.pos = 0;
        f.length = 0;
        f.eof = false;
    }

    // Escreve uma "palavra" (WORD) na sequência
    void writeWord(Object w) {
        if (length >= MAX_LENGTH) {
        	throw new RuntimeException("FileSystem cheio");
        }

        if (pos >= length) {
            data = java.util.Arrays.copyOf(data, data.length + 10);
        }
           
        data[pos] = w;
        
        pos++;
        length = pos;
    }

    // Reinicia o cursor de leitura
    void reset() {
        this.pos = 0;
        this.eof = false;
    }

    // Lê uma "palavra" (WORD) da sequência
    Object readWord() {
    	if (pos >= length) {
            eof = true;
            return null;
        }

    	Object w = (Object) data[pos];
        pos++;
        return w;
    }

    // Fecha a sequência (aqui, só limpa)
    void close() {
        data = null;
        pos = 0;
        length = 0;
        eof = true;
    }
    
}
