// Implemente um programa que leia uma matriz 4x4, apresenta a soma dos elementos na diagonal principal

package FICHA_05;
import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[][] matriz = new int[4][4];
        int somatorio = 0;

        // preencher matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Insira na matriz[" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }

        // Calcular a soma daigonal prncpl
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                if(linha==coluna){
                    somatorio=somatorio+matriz[linha][coluna];
                }
            }
        }

        System.out.println("Somatório da Diagonal Principal: "+somatorio);
    }
}