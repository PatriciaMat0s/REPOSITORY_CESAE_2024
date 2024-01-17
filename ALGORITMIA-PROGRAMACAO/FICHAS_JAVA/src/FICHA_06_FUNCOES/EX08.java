//8.      Implemente funções que, dadas 2 matrizes de inteiros com a mesma dimensão, apresente (numa função) em
//        forma de matriz o resultado da soma das 2 matrizes e (noutra função) o somatório dos seus elementos.


package FICHA_06;

import java.util.Scanner;

import static FICHA_06.BibliotecaMatrizes.imprimirMatrizInteiros;

public class EX08 {

    /**
     * Método que retorna o maior elemento do array
     *
     * @param matriz1, matriz2 : matrizes a serem analisadas
     * @return
     */
    public static void somarMatrizes(int[][] matriz1, int[][] matriz2) {

        // Imprimir a matriz na consola
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print((matriz1[linha][coluna] + matriz2[linha][coluna]) + "\t");
            }
            System.out.println();
        }
    }

    public static int somatorioMatrizes(int[][] matriz1, int[][] matriz2) {
        int somatorio = 0;

        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                somatorio = somatorio + matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        return somatorio;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar matrizes
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        System.out.println("***** Matriz 1 *****");
        // Ler matriz1
        for (int linha = 0; linha < matriz1.length; linha++) {
            for (int coluna = 0; coluna < matriz1[0].length; coluna++) {
                System.out.print("Insira na matriz1[" + linha + "][" + coluna + "]: ");
                matriz1[linha][coluna] = input.nextInt();
            }
        }

        System.out.println("***** Matriz 2 *****");
        // Ler matriz2
        for (int linha = 0; linha < matriz2.length; linha++) {
            for (int coluna = 0; coluna < matriz2[0].length; coluna++) {
                System.out.print("Insira na matriz2[" + linha + "][" + coluna + "]: ");
                matriz2[linha][coluna] = input.nextInt();
            }
        }

        System.out.println();

        System.out.println("\n***** Matriz 1 *****\n");
        imprimirMatrizInteiros(matriz1);

        System.out.println("\n\n***** Matriz 2 *****\n");
        imprimirMatrizInteiros(matriz2);

        System.out.println("\nSomar Matrizes");

        // Somar Matrizes
        somarMatrizes(matriz1, matriz2);

        System.out.println();

        // Somatorio Matrizes
        System.out.println("Somatorio Matrizes: " + somatorioMatrizes(matriz1, matriz2));

    }
}