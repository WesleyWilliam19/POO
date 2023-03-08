package Questao_6;

public class Questao6 {

    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int proximo = primeiro + segundo;
        // proximo = 0 + 1 -> 1
        
        System.out.println("[Sequencia de Fibonacci]\n");
        System.out.println(" \t["+primeiro+"]");
        System.out.println(" \t["+segundo+"]");
        
        while (proximo <= 100) {
            System.out.println(""+primeiro+" + "+segundo+" = ["+proximo+"]");
            primeiro = segundo; // primeiro = segundo -> segundo = 1
            segundo = proximo;  //segundo = proximo -> proximo = 1 
            proximo = primeiro + segundo; //proximo = 1 + 1 -> 2
        }
    }
}
/* ex
primeiro + segundo = proximo

primeiro = 0
segundo  = 1
Enquanto (proximo <100) {
0 + 1    = 1
1 + 1    = 2
1 + 2    = 3
2 + 3    = 5
3 + 5    = 8
5 + 8    = 13
8 + 13   = 21
... (0, 1, 1 ,2 ,3 ,5 ,8, 13, 21)
*/



