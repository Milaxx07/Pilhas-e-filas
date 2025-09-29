public class Main {

    public static void main(String[] args) {
        Fila minhaFila = new Fila(5);
        System.out.println("Fila com capacidade 5 criada.");

        minhaFila.enqueue(10);
        minhaFila.enqueue(20);
        minhaFila.enqueue(30);
        System.out.println("Valores 10, 20 e 30 inseridos.");

        System.out.println("Primeiro elemento da fila: " + minhaFila.peek());

        System.out.println("Removendo elementos da fila...");
        while (!minhaFila.isEmpty()) {
            System.out.println("Removido: " + minhaFila.dequeue());
        }

        System.out.println("A fila está vazia? " + minhaFila.isEmpty());
    }
}