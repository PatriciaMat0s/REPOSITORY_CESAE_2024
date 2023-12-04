//Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
//‘C’ ou decrescente ‘D’, e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a escolha.

package FICHA_02;

import java.util.Scanner;

public class EX15 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num1, num2, num3;
        String ordem;

        // vou pedir e ler:
        System.out.print("Introduza um número: ");
        num1=input.nextInt();
        System.out.print("Introduza um número: ");
        num2=input.nextInt();
        System.out.print("Introduza um número: ");
        num3=input.nextInt();

        System.out.print("INTRODUZA 'C' SE QUISER ORDENAR POR ORDEM CRESCENTE OU 'D' SE QUISER ORDENAR POR ORDEM DECRESCENTE : ");
        ordem = input.next();

        switch (ordem) {
            case "C":
                if (num1 < num2 && num1 < num3) {
                    if (num2 < num3) {
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }
                    if (num2 > num3) {
                        System.out.println(num1 + " " + num3 + " " + num2);
                    }
                }

                if (num2 < num1 && num2 < num3) {
                    if (num1 < num3) {
                        System.out.println(num2 + " " + num1 + " " + num3);
                    }
                    if (num1 > num3) {
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                }

                if (num3 < num1 && num3 < num2) {
                    if (num1 < num2) {
                        System.out.println(num3 + " " + num1 + " " + num2);
                    }
                    if (num1 > num2) {
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                }
                break;

            case "D":
                if (num1 < num2 && num1 < num3) {
                    if (num2 < num3) {
                        System.out.println(num3 + " " + num2 + " " + num1);
                    }
                    if (num2 > num3) {
                        System.out.println(num2 + " " + num3 + " " + num1);
                    }
                }

                if (num2 < num1 && num2 < num3) {
                    if (num1 < num3) {
                        System.out.println(num3 + " " + num1 + " " + num2);
                    }
                    if (num1 > num3) {
                        System.out.println(num1 + " " + num3 + " " + num3);
                    }
                }

                if (num3 < num1 && num3 < num2) {
                    if (num1 < num2) {
                        System.out.println(num2 + " " + num1 + " " + num3);
                    }
                    if (num1 > num2) {
                        System.out.println(num1 + " " + num2 + " " + num3);
                    }
                }
                break;
            default:
        }
    }
}