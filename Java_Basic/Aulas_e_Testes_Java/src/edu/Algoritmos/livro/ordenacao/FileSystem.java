package edu.Algoritmos.livro.ordenacao;

public class FileSystem<T> {
    // Constante máxima (limite teórico de dados)
	final int MAX_LENGTH = 4096;
	
	boolean eof = false;
	int pos;
	int length;
	T[] data;

    // Abre / inicializa uma nova sequência
    void open() {
        this.pos = 0;
        this.length = 0;
        this.eof = false;
        this.data = (T[]) new Object[10];
    }

    // Escreve uma "palavra" (WORD) na sequência
    void writeWord(T w) {
        
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
    T readWord() {
    	if (pos >= length) {
            eof = true;
            return null;
        }

    	T w = (T) data[pos];
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
