package Questao_8;

public class Questao8 {

    public static void main(String[] args) {
	int maximo = 5;
        int linha;
        int coluna;
        
	for (linha = 1; linha <= maximo; linha++) {
            for (coluna = 1; coluna <= linha; coluna++) {
		System.out.print(linha * coluna + " ");
            }
            System.out.println();
	}
    }
}
