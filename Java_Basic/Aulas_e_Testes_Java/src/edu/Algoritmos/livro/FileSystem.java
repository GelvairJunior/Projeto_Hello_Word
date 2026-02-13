package edu.Algoritmos.livro;
import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    // Constante máxima (limite teórico de dados)
    public static final int MAX_LENGTH = 4096;

    // Tipo Sequence (registro)
    public static class Sequence {
        int pos;           // posição atual
        int length;        // tamanho da sequência
        boolean eof;       // flag de fim
        List<Integer> a;   // lista dinâmica (sequência de WORDs)

        public Sequence() {
            a = new ArrayList<>();
            pos = 0;
            length = 0;
            eof = false;
        }
    }

    // Abre / inicializa uma nova sequência
    public static void open(Sequence f) {
        f.a.clear();
        f.pos = 0;
        f.length = 0;
        f.eof = false;
    }

    // Escreve uma "palavra" (WORD) na sequência
    public static void writeWord(Sequence f, int w) {
        if (f.length >= MAX_LENGTH) {
            throw new RuntimeException("Capacidade máxima atingida");
        }

        if (f.pos < f.a.size()) {
            f.a.set(f.pos, w);
        } else {
            f.a.add(w);
        }

        f.pos++;
        f.length = f.pos;
    }

    // Reinicia o cursor de leitura
    public static void reset(Sequence f) {
        f.pos = 0;
        f.eof = false;
    }

    // Lê uma "palavra" (WORD) da sequência
    public static int readWord(Sequence f) {
        if (f.pos >= f.length) {
            f.eof = true;
            throw new RuntimeException("End of File (EOF)");
        }

        int w = f.a.get(f.pos);
        f.pos++;
        if (f.pos >= f.length) f.eof = true;
        return w;
    }

    // Fecha a sequência (aqui, só limpa)
    public static void close(Sequence f) {
        f.a.clear();
        f.pos = 0;
        f.length = 0;
        f.eof = true;
    }

    // --- Exemplo de uso ---
    public static void main(String[] args) {
        Sequence seq = new Sequence();

        open(seq);
        System.out.println("Sequência aberta.");

        for (int i = 1; i <= 5; i++) {
            writeWord(seq, i * 10);
        }

        System.out.println("Dados gravados: " + seq.a);
        reset(seq);

        System.out.println("Lendo sequência:");
        while (!seq.eof) {
            try {
                int w = readWord(seq);
                System.out.println("Leitura: " + w);
            } catch (RuntimeException e) {
                System.out.println("EOF atingido.");
                break;
            }
        }

        close(seq);
        System.out.println("Sequência fechada.");
    }
}