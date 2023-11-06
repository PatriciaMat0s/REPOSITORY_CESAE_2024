//Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem de inserção.

package FICHA_05;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //DECLARAR VARIÁVEIS;
        int[] vetor = new int[10];
        //int [][] = new int[3][3];

        //PREENCHER O ARRAY:
        for (int indice = 0; indice <= 9; indice++) {
            System.out.print(" Insira um número no Array[" + indice + "]:");
            vetor[indice] = input.nextInt();
        }

        //IMPRIMIR O VECTOR:

        for (int indice = 0; indice <= 9; indice++) {
            System.out.println("Vector[" + indice + "]:" + vetor[indice]);
        }

        //IMPRIMIR O VECTOR como uma linha (opcional):

        System.out.print("\n[");
        for (int indice = 0; indice <10; indice++) {
            if (indice < 9) {
                System.out.print(vetor[indice] + ",");
            } else {
                System.out.print(vetor[indice]);
            }
        }
        System.out.print("]");
        }
    }