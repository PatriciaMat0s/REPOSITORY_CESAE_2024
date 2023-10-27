//  Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

package FICHA_03;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        // vou declarar as variaveis e pedir o numero:
        int num, limite;
        num=0;
        System.out.print("Introduza um número inteiro para limitar: ");
        limite = input.nextInt();

        while (num<=limite ) {   //0 <=num dava execução infinita, limite tem ser fixo!
            System.out.println(num);
            num++;

            }
    }
}