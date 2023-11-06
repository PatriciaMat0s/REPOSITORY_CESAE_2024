//  MATRIZES ---
//  Implemente um programa que permita adicionar 9 números inteiros (ler input do utilizador) a uma matriz 3x3 e que os imprima com o seguinte aspeto gráfico:
// 3 8 1
// 7 4 2
// 5 1 9

package FICHA_05;

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // Inicializar a matriz;
        int[][] matrix = new int[3][3];

        // Preencher o array - lógica de inserção:
        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
            for (int indiceCol = 0; indiceCol < matrix.length; indiceCol++) {
                System.out.print(" Insira o valor array[" + (indice) + "]: ");
                matrix[indiceRow][indiceCol] = input.nextInt();}
            System.out.print(" Insira o valor array[" + (indice1) + "]: ");
            matrix[indice1][] = input.nextInt();
        }

//        //IMPRIMIR O VECTOR como uma linha (opcional):
//        System.out.print("\n[");
//        for (int indice = 0; indice <10; indice++) {
//            if (indice < 9) {
//                System.out.print(matrix[indice] + ",");
//            } else {
//                System.out.print(matrix[indice]);
//            }
//        }

        System.out.print("]");

            }
        }

        // Apresentar o valor máximo:
        System.out.print("O maior número do array é " + valorMax + ".");
    }
}
