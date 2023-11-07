//  MATRIZES ---
//  Faça um programa que preencha cada posição de uma matriz 3x5 com valores inteiros introduzidos pelo utilizador.
//  Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz

package FICHA_05;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // Inicializar a matriz;
        int[][] matrix = new int[3][5];
        int valor_a_encontrar, contagem=0;


        // Preencher ã matriz - lógica de inserção:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
                System.out.print(" Insira o valor matriz[" + indiceRow + "][" + indiceCol +"]: ");
                matrix[indiceRow][indiceCol] = input.nextInt();
            }
        }

        System.out.print(" Insira um valor (para encintrar na matriz): ");
        valor_a_encontrar = input.nextInt();

        //Somatório - lógica de resolucao:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
                if (matrix[indiceRow][indiceCol] == valor_a_encontrar){
                    contagem++;
                }
            }
        }

        // Apresentar o valor máximo:
        System.out.print("O valor " + valor_a_encontrar + " aparece " + contagem + " vezes na matriz.");
    }
}