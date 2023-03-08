package Questao_5;

public class Questao5 {

    public static void main(String[] args) {
        double fatorial = 1;
        int n;
        for (n = 1; n <= 40; n++) {
            fatorial = n * fatorial; 
            System.out.println("O fatorial de "+n+" é ("+(n-1)+"!) * "+(n)+" = " +fatorial);
        }
    }
}

/* O tipo INT armazena somente até (16!), já o tipo LONG consegue armazenar até (21!),
pois para ambos casos o valor acaba ultrapassando o limite superior do tipo de 
dado utilizado, portanto a partir disso, uma forma melhor de observar além de (21!) 
seria utilizando o tipo DOUBLE que nos retornaria um valor conforme o de uma calculadora,
entretanto a partir de (11!) em diante a exibição/formatação do resultado já se torna diferente 
dos outros tipos testados.

*/