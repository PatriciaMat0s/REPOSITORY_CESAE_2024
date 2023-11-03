// Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (1 posição para cada mês) e calcular o seu total anual.

package FICHA_05;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //INICIALIZAR E DECLARAR VARIÁVEIS e o vector;
        int somatotal;
        somatotal=0;

        int[] vetor = new int[12];
        //int [][] = new int[3][3]; //inicializar matrizes

        //PEDIR VARIÁVEIS PARA CADA ÍNDICE DO ARRAY:
        for (int indice = 0; indice <= 11; indice++) {
            System.out.print(" Insira a comissao do mês #" + (indice+1) + ": ");
            vetor[indice] = input.nextInt();
            somatotal = somatotal + vetor[indice];
        }

            System.out.print("O total anual é "+somatotal+" Euros.");
        }

    }