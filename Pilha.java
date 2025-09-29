import java.util.EmptyStackException;

public class Pilha {

    private final int[] dados;
    private int topo;
    private final int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }
    
    public boolean isFull() {
        return this.topo == this.capacidade - 1;
    }

    public void push(int valor) {
        if (isFull()) {
            throw new StackOverflowError("A pilha está cheia!");
        }
        this.topo++;
        this.dados[this.topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int valorTopo = this.dados[this.topo];
        this.topo--;
        return valorTopo;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.dados[this.topo];
    }
}