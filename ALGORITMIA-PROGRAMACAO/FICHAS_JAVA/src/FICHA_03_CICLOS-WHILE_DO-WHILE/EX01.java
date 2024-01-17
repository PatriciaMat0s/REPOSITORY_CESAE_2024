// 1. Faça um programa que imprima os números no intervalo de 1 a 250 inclusive.

package FICHA_03;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        // Nao é necessário o scanner nem o input do utilizador:
       // Scanner input = new Scanner(System.in);
//        System.out.print("Introduza o valor em Euros (múltiplo de 5) a decompor: ");
//        valor=input.nextInt();

        // vou declarar as variaveis:
        int num;
     //   num =0;
//        while ( num >= 0 && num <= 249 ) {
//            num++; //num=num+1;
//            System.out.println(num);
//        }

        num =1;
        while ( num <= 250 ) {
            System.out.println(num);
            num++; //num=num+1;
        }

    }
}