// 5. Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.

package FICHA_05;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //DECLARAR VARIÁVEIS e o vector;
       double[] vetor = new double[10];
       double soma, media;
        soma=0; //variavel de acumulação


        //Preencher o array:
        for (int indice = 0; indice <= vetor.length-1; indice++) {
            System.out.print(" Insira o valor do array[" + (indice) + "]: ");
            vetor[indice] = input.nextDouble();
            soma=soma+vetor[indice];
        }
        media = soma / 10;

        // Apresentar o valor máximo:
        System.out.print("O maior número do array é " + media  + ".");
    }
}