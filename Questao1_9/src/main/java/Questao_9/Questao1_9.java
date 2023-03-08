package Questao_9;
import java.util.Scanner;

public class Questao1_9 {

    public static void main(String[] args) {
        int num1, num2, soma, multiplicacao, subtracao;
        double divisao, resto;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
         num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        multiplicacao = num1 * num2;
        subtracao = num1 - num2;
        divisao = num1 / num2;
        resto = num1 % num2;

        System.out.println(" " + num1 + " + " + num2 + " = " + soma);
        System.out.println(" " + num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println(" " + num1 + " - " + num2 + " = " + subtracao);
        System.out.println(" " + num1 + " / " + num2 + " = " + divisao);
        System.out.println(" " + num1 + " / " + num2 + " -> resta: " + resto);
    }
}

