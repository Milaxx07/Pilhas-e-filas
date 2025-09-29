import java.util.NoSuchElementException;

public class Fila {

    private final int[] dados;
    private int inicio;
    private int fim;
    private int tamanhoAtual;
    private final int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanhoAtual = 0;
    }

    public boolean isEmpty() {
        return this.tamanhoAtual == 0;
    }

    public boolean isFull() {
        return this.tamanhoAtual == this.capacidade;
    }

    public void enqueue(int valor) {
        if (isFull()) {
            throw new IllegalStateException("A fila está cheia!");
        }
        this.fim = (this.fim + 1) % this.capacidade;
        this.dados[this.fim] = valor;
        this.tamanhoAtual++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia!");
        }
        int valorInicio = this.dados[this.inicio];
        this.inicio = (this.inicio + 1) % this.capacidade;
        this.tamanhoAtual--;
        return valorInicio;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("A fila está vazia!");
        }
        return this.dados[this.inicio];
    }
}