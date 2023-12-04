// Escreva um programa que leia dois valores numéricos e apresente o menor e depois o maior.

package FICHA_02;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num1, num2;

        // vou pedir e ler:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num1=input.nextInt();
        System.out.print("INTRODUZA OUTRO NÚMERO: ");
        num2=input.nextInt();

        if (num1 > num2) {
            System.out.print( num2 + " " + num1 ); // ou string vazia ""
        }

        if (num2 > num1) {
            System.out.print( num1 + " " + num2 );
        }

        if (num1 == num2) {
            System.out.print("SÃO IGUAIS!");
        }
    }
}