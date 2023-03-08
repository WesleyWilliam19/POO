package Questao_7;
import java.util.Scanner;

public class Questao1_7 {

    public static void main(String[] args) {
        double altura = 0;
        double menorAltura, maiorAltura;
        menorAltura = Double.MAX_VALUE; //Limite superior
        maiorAltura = Double.MIN_VALUE; //Limete inferior
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Digite uma altura ou -1 para encerrar: ");
            altura = input.nextDouble();
            
            if (altura != -1) {
                if (altura < menorAltura) {
                    menorAltura = altura;
                }
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                }
            }
        } while (altura != -1);
        if (menorAltura != Double.MAX_VALUE) {
            System.out.printf("\na) A menor altura é %.2f metros.\n", menorAltura);
        }
        if (maiorAltura != Double.MIN_VALUE) {
            System.out.printf("b) A maior altura é %.2f metros.\n", maiorAltura);
        }
    }
}

