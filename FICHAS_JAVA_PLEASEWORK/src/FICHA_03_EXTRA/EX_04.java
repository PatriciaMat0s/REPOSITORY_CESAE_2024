package FICHA_03_EXTRA;

import java.util.Scanner;

public class EX_04 {
    public static void main(String[] args) {


        // EXERCICIO 4.1:
//        **********
//        **********
//        **********
//        **********
        for (int row=1 ; row<=4 ; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print("*");}
            System.out.println();
        }

        System.out.println();
        // EXERCICIO 4.2:
//        *
//        **
//        ***
//        ****
//        *****
        for (int row=1 ; row<=5 ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");}
            System.out.println();
        }

        System.out.println();
        // EXERCICIO 4.3 (enunciado n inclui os underscores):
//  ____*
//  ___***
//  __*****
//  _*******
//  *********
        int espacos = 4 - 1; // Número inicial de espaços em cada linha
        int asteriscos = 1; // Número inicial de asteriscos em cada linha

        // Ciclo para cada linha
        for (int i = 1; i <= 4; i++) {

            // Imprimir espaços em branco
            for (int j = 1; j <= espacos; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            // Enter
            System.out.println();

            // Atualizar contadores de espaços e asteriscos para a próxima linha
            espacos--;
            asteriscos += 2;
        }

    }
}