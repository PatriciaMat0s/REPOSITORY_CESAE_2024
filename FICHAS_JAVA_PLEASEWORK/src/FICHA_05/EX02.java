// Implemente um programa que permita adicionar comissões mensais a um array de tamanho 12 (1 posição para cada mês) e calcular o seu total anual.

package FICHA_05;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //DECLARAR VARIÁVEIS e o vector;
        double somatotal;
        somatotal=0; //variavel de acumulaçao

        double[] vetor = new double[12];
        //int [][] = new int[3][3]; //para inicializar matrizes

        //Adicionar comissoes a cada elemento do array:
        for (int indice = 0; indice <= 11; indice++) {
            System.out.print(" Insira a comissao do mês #" + (indice+1) + ": ");
            vetor[indice] = input.nextDouble();
        }

        //Calcular o total anual:
        for (int indice = 0; indice <= 11; indice++) {
            somatotal = somatotal + vetor[indice];
        }
        // Apresentar o total anual:
            System.out.print("O total anual de comissões é "+somatotal+" Euros.");
        }

    }