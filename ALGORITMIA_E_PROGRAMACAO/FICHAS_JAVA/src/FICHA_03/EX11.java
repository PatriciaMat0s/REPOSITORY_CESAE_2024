//    Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecidos pelo
//    utilizador e conte quantos deles estão nos seguintes intervalos:
//    [0.25], [26,50], [51,75] e [76,100]. A entrada de dados deve terminar quando for lido um número negativo.


package FICHA_03;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        // vou declarar as variaveis:
        int num, interval1, interval2, interval3, interval4;
        // vou inicializar as variaveis:
        num = interval1 = interval2 = interval3 = interval4 = 0;

        while (num >= 0) {

            System.out.println("Introduza um valor inteiro positivo:");
            num = input.nextInt();
            if (num >= 0 && num <= 25) {
                interval1++;
            }
            if (num >= 26 && num <= 50) {
                interval2++;
            }
            if (num >= 51 && num <= 75) {
                interval3++;
            }
            if (num >= 76 && num <= 100) {
                interval4++;
            }
        }
        System.out.println("Número de valores no intervalo [0.25]: " + interval1);
        System.out.println("Número de valores no intervalo [26.50]: " + interval2);
        System.out.println("Número de valores no intervalo [51.75]: " + interval3);
        System.out.println("Número de valores no intervalo [76.100]: " + interval4);

    }
}