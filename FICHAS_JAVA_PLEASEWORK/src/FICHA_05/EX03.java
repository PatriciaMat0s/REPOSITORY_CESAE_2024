// Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento

package FICHA_05;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //INICIALIZAR E DECLARAR VARIÁVEIS e o vector;

        int[] vetor = new int[10];
        //int [][] = new int[3][3]; //inicializar matrizes

        //PEDIR VARIÁVEIS PARA CADA ÍNDICE DO ARRAY:
        for (int indice = 0; indice <= 9; indice++) {
            System.out.print(" Insira um número no Array[" + indice + "]:");
            vetor[indice] = input.nextInt();

        }

            System.out.print("O maior elento do Array é "++".");
        }

    }