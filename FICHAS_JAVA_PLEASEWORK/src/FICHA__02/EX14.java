//   Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.


package FICHA__02;
import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num1, num2, num3;

        // vou pedir e ler:
        System.out.print("Introduza um número: ");
        num1=input.nextInt();
        System.out.print("Introduza um número: ");
        num2=input.nextInt();
        System.out.print("Introduza um número: ");
        num3=input.nextInt();


        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println( num1 + " " + num2 + " " + num3);
            }
            if (num2 > num3) {
                System.out.println( num1 + " " + num3 + " " + num2);
            }
        }

        if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println( num2 + " " + num1 + " " + num3);
            }
            if (num1 > num3) {
                System.out.println( num2 + " " + num3 + " " + num1);
            }
        }

        if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                System.out.println( num3 + " " + num1 + " " + num2);
            }
            if (num1 > num2) {
                System.out.println( num3 + " " + num2 + " " + num1);
            }
        }

    }
}