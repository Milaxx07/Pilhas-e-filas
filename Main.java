public class Main {
    
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha(5);
        System.out.println("Pilha com capacidade 5 criada.");

        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);
        System.out.println("Valores 10, 20 e 30 inseridos.");

        System.out.println("Elemento no topo: " + minhaPilha.peek());

        System.out.println("Removendo elementos da pilha...");
        while (!minhaPilha.isEmpty()) {
            System.out.println("Removido: " + minhaPilha.pop());
        }

        System.out.println("A pilha está vazia? " + minhaPilha.isEmpty());
    }
}