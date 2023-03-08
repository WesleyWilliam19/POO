package Questao_10;
import java.util.Scanner;

public class Questao1_10 {

    public static void main(String[] args) {
        int num;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para ver sua tabela de multiplicação: ");
        num = input.nextInt();

        System.out.println("Taboada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
