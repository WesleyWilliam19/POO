package Questao_9;

public class Questao9 {

    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        
        System.out.println("[Sequencia de Fibonacci]\n");
        System.out.println("["+anterior+"]");
        
        while (atual <= 100) {
            System.out.println("["+atual+"]");
            atual = anterior + atual;
            anterior = atual - anterior;
        }/*anterior = 0 -> 1 -> 2 -> 3 -> 5 ...
              atual = 1 -> 1 -> 3 -> 5 -> 8 -> 13 ...*/
    }
}
