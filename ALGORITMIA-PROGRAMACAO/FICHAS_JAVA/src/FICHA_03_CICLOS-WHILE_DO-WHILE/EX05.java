//   Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e imprima os números inteiros neste intervalo.

package FICHA_03;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis e pedir o numero:
        int lim1, lim2;

        System.out.print("Introduza um número inteiro: ");
        lim1 = input.nextInt();

        System.out.print("Introduza um número inteiro: ");
        lim2 = input.nextInt();

        while ( lim1 <= lim2 ) {
            System.out.println(lim1);
            lim1++;
        }
    }
}