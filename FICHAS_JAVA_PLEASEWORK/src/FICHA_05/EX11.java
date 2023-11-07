//  MATRIZES ---
//  Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido pelo utilizador.
//  Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir o conteudo da matriz (tal como no EX08)

package FICHA_05;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // Inicializar a matriz;
        int[][] matrix = new int[3][3];
        int menor= matrix[0][0]; //podia ser qq elemento da matriz
        int maior= matrix[0][0]; //podia ser qq elemento da matriz


        // Preencher ã matriz - lógica de inserção:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
                System.out.print(" Insira o valor matriz[" + indiceRow + "][" + indiceCol +"]: ");
                matrix[indiceRow][indiceCol] = input.nextInt();
            }
        }

        // Lógica de resolucao - encontrar maior e menor valor na matriz:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
                if (matrix[indiceRow][indiceCol] > maior){
                    maior=matrix[indiceRow][indiceCol];}
                if (matrix[indiceRow][indiceCol] < menor){
                    menor=matrix[indiceRow][indiceCol];}
            }
        }

        // Imprimir a matriz:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
                System.out.print(matrix[indiceRow][indiceCol] +"\t"); //tabulação
            }
            System.out.print("\n"); //ou System.out.println("");
        }

        // Apresentar o valor máximo:
        System.out.print("O valor menor é " + menor + " e o valor maior é " + maior + ".");
    }
}