package Questao_4;
import java.util.Scanner;

public class Questao1_4 {

    public static void main(String[] args) {
        int num, sucessor;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 80: ");
        num = input.nextInt();
        
        sucessor = (num == 80) ? 0 : num + 1;
        
        System.out.printf("O sucessor de %d é %d", num, sucessor);
    }
}