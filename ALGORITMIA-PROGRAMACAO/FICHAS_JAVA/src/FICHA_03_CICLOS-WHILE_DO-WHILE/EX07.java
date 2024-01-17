//   Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
//     a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14   16 17 18 19 20

package FICHA_03;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {

        // Inicializar o scanner --- no need
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis e pedir o numero:
        int num;
        int limInf;
        int limSup;

        System.out.print("Introduza um número inteiro: ");
        num = input.nextInt();
        limInf = num-5;
        limSup = num+4;

        while ( limInf < num ) {
            System.out.println(limInf);
            limInf++;
        }

       num++; /// muita atencao a este incremnto
        System.out.println(" ");

        while ( num <= limSup) {
            System.out.println(num);
            num++;
        }
    }
}