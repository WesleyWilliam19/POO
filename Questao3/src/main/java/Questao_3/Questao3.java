package Questao_3;

public class Questao3 {

    public static void main(String[] args) {
        int num;
        
        System.out.println("Múltiplos de 3, de 1 a 100:");
        for(num = 1; num < 100; num++){
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
