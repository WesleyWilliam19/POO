package Questao_2;
import java.util.Scanner;

public class Questao1_2 {

    public static void main(String[] args) {
        double tempo, velocidade, distancia, combustivel;
        
        Scanner input = new Scanner(System.in);          
        
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        tempo = input.nextDouble();
       
        System.out.print("Digite a velocidade média durante o percurso (em km/h): ");
        velocidade = input.nextDouble();
        
        distancia = velocidade * tempo;
        combustivel = (distancia / 12);
        
        System.out.println("\nO tempo gasto na viagem foi de: " +tempo+ "h");
        System.out.println("A velocidade média foi de: " +velocidade+ "km/h");
        System.out.println("O percurso foi de: " +distancia+ "km");
        System.out.println("Você gastou: " +combustivel+ "L de combustível");
    }
}
    
