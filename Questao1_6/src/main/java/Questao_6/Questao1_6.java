package Questao_6;

public class Questao1_6 {

    public static void main(String[] args) {
        double deposito, taxaJuros, rendimento, valorTotal;
        deposito = 800.0;
        taxaJuros = 5.0;
        
        //Rendimento = depósito * taxaJuros/100
        rendimento = deposito * taxaJuros / 100.0;
        //valorTotal = depósito + rendimento
        valorTotal = deposito + rendimento;
        
        System.out.printf("O rendimento é de: R$%.2f\n", rendimento);
        System.out.printf("Valor total com rendimento: R$%.2f\n", valorTotal);
    }
}
