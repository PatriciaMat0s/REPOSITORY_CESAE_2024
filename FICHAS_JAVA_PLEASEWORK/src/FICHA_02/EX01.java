//1. Leia dois números inteiros e escreva na consola o maior deles.

package FICHA_02;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num1, num2;

        // vou pedir os dois numeros e ler ambos:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num1 = input.nextInt();
        System.out.print("INTRODUZA OUTRO NÚMERO: ");
        num2 = input.nextInt();

        // vou imprimir na consola o maior:
        if (num1 > num2) {
            System.out.print("O MAIOR É: " + num1);
        }

        if (num2 > num1) {
            System.out.print("O MAIOR É: " + num2);
        }

        if (num1 == num2) {
            System.out.print("NÃO HÁ MAIOR, SÃO IGUAIS!");
        }
    }
}