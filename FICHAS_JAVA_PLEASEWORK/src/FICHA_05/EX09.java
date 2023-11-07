//  MATRIZES ---
//  Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos

package FICHA_05;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // Inicializar a matriz;
        int[][] matrix = new int[5][5];
        double somatorio;
        somatorio=0;

        // Preencher ã matriz - lógica de inserção:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix.length; indiceCol++) {
                System.out.print(" Insira o valor matriz[" + indiceRow + "][" + indiceCol +"]: ");
                matrix[indiceRow][indiceCol] = input.nextInt();
            }
        }

        //Somatório - lógica de resolucao:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix.length; indiceCol++) {
                somatorio=somatorio+ matrix[indiceRow][indiceCol];
            }
        }

        // Apresentar o valor máximo:
        System.out.print("O somatório dos elementos da matriz é " + somatorio + ".");
    }
}