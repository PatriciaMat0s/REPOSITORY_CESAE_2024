//// Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento


package FICHA_05;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // DECLARAR VARIÁVEIS e o vector;
        int[] vetor = new int[10];
        int valorMax;

        // Preencher o array - lógica de inserção:
        for (int indice = 0; indice <= 9; indice++) {
            System.out.print(" Insira o valor array[" + (indice) + "]: ");
            vetor[indice] = input.nextInt();
        }

        valorMax=vetor[0];
        //valorMax=vetor[9];
        // OU qualquer posicao, qq uma dá! o 0 é apenas mais seguro pois todos os vectores o têm,
        // caso se mude o tamanho ou o indice


        // Calcular o valor máximo - lógica de resolução:
        for (int indice = 0; indice <= 9; indice++) {
            if (vetor[indice] > valorMax){
                valorMax=vetor[indice];
            }

        }

        // Apresentar o valor máximo:
        System.out.print("O maior número do array é " + valorMax + ".");
    }
}