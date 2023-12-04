//        Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
//        operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores.
//        No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
//        Exemplo: Deseja continuar? (introduza s/n).

package FICHA_04;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        double num1, num2;
        String operacao;
        int menu;

        do {
            System.out.print("INTRODUZA UM NÚMERO: ");
            num1 = input.nextDouble();

            System.out.print("INTRODUZA OUTRO NÚMERO: ");
            num2 = input.nextDouble();

            System.out.print("INTRODUZA A OPERAÇÃO QUE DESEJA EFECTUAR:  +    -    *    / ");
            operacao = input.next();

            switch (operacao) {
                case "+":
                    System.out.println("Soma = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Subtracção = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Produto = " + num1 * num2);
                    break;
                case "/":
                    System.out.println("Divisão = " + num1 / num2);
                    break;
                default:
                    System.out.println("Operação aritmética não conhecida. Seleccione entre + - * /");
            }

            System.out.print("DESEJA CONTINUAR A EFECTUAR CÁLCULOS? S-1 / N-0 ");
            menu = input.nextInt();

        } while (menu != 0);
    }
}