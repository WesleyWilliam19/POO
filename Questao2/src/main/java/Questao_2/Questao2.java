package Questao_2;


public class Questao2 {

    public static void main(String[] args) {
        //Imprimir soma
        int soma = 0;
        int min;
        // Resultado da soma = (min + max) * ((max - min + 1) / 2) 
        for(min = 0; min <= 1000; min++){
            soma = soma + min;
        }
        System.out.println("Resultado da soma: " + soma);
        
        //Imprimir o calculo e a soma
        /*
        int soma = 0; 
        int ultimoValor; 
        int min;
        
        for (min = 0; min <= 1000; min++) { 
            ultimoValor = soma; 
            soma = soma + min;
            //soma += min; 
            System.out.printf("%d = %d + %d\n",  soma, ultimoValor, min); 
        }
        System.out.println("Resultado da soma: " + soma);
        */
    }
}