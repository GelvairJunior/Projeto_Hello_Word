package edu.Algoritmos.livro;

import java.util.concurrent.Semaphore;

public class Buffer_correct {
	// Constantes
    private static final int Nc = 128;  // bloco do consumidor
    private static final int Np = 16;   // bloco do produtor
    private static final int N  = 1024; // tamanho total do buffer

    // Variáveis de estado
    private static int ne = N; // blocos vazios
    private static int nf = 0; // blocos cheios
    private static int in = 0; // índice de escrita
    private static int out = 0; // índice de leitura

    private static final int[] buf = new int[N];

    // Sinais (semáforos binários)
    private static final Semaphore nonfull = new Semaphore(1);   // pode escrever
    private static final Semaphore nonempty = new Semaphore(0);  // nada para ler ainda

    // Inicialização
    static {
        init(nonfull);
        init(nonempty);
    }

    // === API pública ===
    public static void deposit(int[] x) throws InterruptedException {
        ne -= Np;
        if (ne < 0) {
            // buffer cheio -> espera
            nonfull.acquire();
        }

        // escreve bloco de Np elementos
        for (int i = 0; i < Np; i++) {
            buf[in] = x[i];
            in = (in + 1) % N;
        }

        nf += Np;

        if (nf >= Nc) {
            nonempty.release(); // há dados suficientes para o consumidor
        }
    }

    public static void fetch(int[] x) throws InterruptedException {
        nf -= Nc;
        if (nf < 0) {
            // buffer vazio -> espera
            nonempty.acquire();
        }

        // lê bloco de Nc elementos
        for (int i = 0; i < Nc; i++) {
            x[i] = buf[out];
            out = (out + 1) % N;
        }

        ne += Nc;

        if (ne >= Np) {
            nonfull.release(); // há espaço suficiente para o produtor
        }
    }

    // Inicialização de sinais (simples)
    private static void init(Semaphore s) {
        s.drainPermits();
    }
    
    // === Demonstração ===
    public void teste() {
        Thread produtor = new Thread(() -> {
            try {
                for (int b = 0; b < 10; b++) {
                    int[] bloco = new int[Np];
                    for (int i = 0; i < Np; i++) bloco[i] = b * Np + i;
                    deposit(bloco);
                    System.out.println("Produtor gravou bloco " + b);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumidor = new Thread(() -> {
            try {
                for (int b = 0; b < 10; b++) {
                    int[] bloco = new int[Nc];
                    fetch(bloco);
                    System.out.println("Consumidor leu bloco " + b + " (primeiro valor " + bloco[0] + ")");
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        produtor.start();
        consumidor.start();
    }
}
