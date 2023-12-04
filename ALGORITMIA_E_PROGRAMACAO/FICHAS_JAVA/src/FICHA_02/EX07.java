// Escreva um programa que leia um número, depois apresente se é par ou ímpar.

package FICHA_02;
import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num;

        // vou pedir e ler:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num=input.nextInt();

        if (num % 2 == 0) {
            System.out.print( "O número " + num + " é par!" );
        }

        else {
            System.out.print( "O número " + num + " é ímpar!" );
        }
    }
}