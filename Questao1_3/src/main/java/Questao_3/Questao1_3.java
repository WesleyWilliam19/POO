package Questao_3;
import java.util.Scanner;

public class Questao1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro no formato CDU: ");
        int numCDU = input.nextInt();
        input.close();

        // Convertendo o número para uma string
        //String numStr = Integer.toString(numCDU);
        String numStr = String.valueOf (numCDU);

        // Invertendo a ordem dos caracteres
        String numInvertidoStr = "";
        for (int i = numStr.length() - 1; i >= 0; i--) {
            numInvertidoStr += numStr.charAt(i);
        }

        // Convertendo a string resultante de volta para um número inteiro
        int numUDC = Integer.parseInt(numInvertidoStr);

        System.out.println("O número " + numCDU + " no formato UDC é: " + numUDC);
    }
}
// verificar
