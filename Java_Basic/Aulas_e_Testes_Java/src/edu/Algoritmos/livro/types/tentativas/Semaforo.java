package edu.Algoritmos.livro.types.tentativas;
import java.util.concurrent.Semaphore;

public class Semaforo {
	private final Semaphore sem = new Semaphore(0);

    public void waitSignal() throws InterruptedException {
        sem.acquire(); // bloqueia até alguém enviar
    }

    public void sendSignal() {
        sem.release(); // libera (notifica)
    }

    public void init(boolean available) {
        sem.drainPermits(); // zera tudo
        if (available) sem.release(); // opcional: inicia liberado
    }
}
