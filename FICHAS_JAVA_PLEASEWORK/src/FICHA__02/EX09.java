// Crie um programa que mostre o menor de três números inteiros lidos.

package FICHA__02;
import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num1, num2, num3;

        // vou pedir e ler:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num1=input.nextInt();

        System.out.print("INTRODUZA OUTRO NÚMERO: ");
        num2=input.nextInt();

        System.out.print("INTRODUZA UM ÚLTIMO NÚMERO: ");
        num3=input.nextInt();

        // vou aferir e apresentar o menor numero:
        if (num1 < num2 && num1 < num3) {
            System.out.println( "O menor dos números é: " + num1 );
        }

        if (num2 < num1 && num2 < num3) {
            System.out.println( "O menor dos números é: " + num2 );
        }

        if (num3 < num1 && num2 < num3) {
            System.out.println( "O menor dos números é: " + num3 );
        }


//
//        if (num1 < num2) {
//            if (num1 < num3) {
//                System.out.println("O menor dos números é: " + num1);
//            } else {
//                System.out.println("Não há apenas um número menor");
//            }
//        }
//
//        if (num2 < num1) {
//            if (num2 < num3) {
//                System.out.println("O menor dos números é: " + num2);
//            } else {
//                System.out.println("Não há apenas um número menor");
//            }
//        }
//
//        if (num3 < num1) {
//            if (num3 < num2) {
//                System.out.println("O menor dos números é: " + num3);
//            } else {
//                System.out.println("Não há apenas um número menor");
//            }
//        }

    }
}