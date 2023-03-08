package Questao_8;
import java.util.Scanner;

public class Questao1_8 {

    public static void main(String[] args) {
        int h1, h2, m1, m2;// h = Homem
        int hVelho, hNovo, mVelha, mNova; // m = Mulher
        int soma, produto; //soma e produto das idades
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro homem: ");
        h1 = input.nextInt();
        System.out.println("Digite a idade do segundo homem: ");
        h2 = input.nextInt();
        
        System.out.println("Digite a idade da primeira mulher :");
        m1 = input.nextInt();
        System.out.println("Digite a idade da segunda mulher: ");
        m2 = input.nextInt();     
        
        // Verifica as idades
        if (h1 > h2) { // Caso o primeiro homem seja mais velho
            hVelho = h1;
            hNovo = h2;
        } else { // Situação inversa
            hVelho = h2;
            hNovo = h1;
        }
        
        if (m1 < m2) {
            mNova = m1;
            mVelha = m2;
        } else {
            mNova = m2;
            mVelha = m1;
        }
        
        soma = hVelho + mNova;
        produto = hNovo * mVelha;
        
        System.out.println("A soma das idades entre o homem mais velho e a mulher mais nova é de: " +soma);
        System.out.println("O produto das idades entre o homem mais novo e a mulher mais velha é de: " +produto);  
    }
}
