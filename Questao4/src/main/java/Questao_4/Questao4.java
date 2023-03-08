package Questao_4;

public class Questao4 {

    public static void main(String[] args) {
        int fatorial = 1;
        int n;
        for (n = 1; n <= 10; n++) {
            fatorial = n * fatorial; 
            System.out.println("O fatorial de "+n+" é ("+(n-1)+"!) * "+(n)+" = " +fatorial);
        }
    }
}
