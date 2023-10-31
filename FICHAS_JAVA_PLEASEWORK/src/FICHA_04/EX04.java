//         Escreva um programa que indique se um número pedido ao utilizador é primo.
//         (Chamamos de número primo um número natural que só possui dois divisores: 1 e ele mesmo).
//         (Por exemplo: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, etc…)


package FICHA_04;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        int num, contagemDivisiveis;
        contagemDivisiveis=0;

        System.out.print("INTRODUZA UM NÚMERO INTEIRO: ");
        num = input.nextInt();


        for (int n=1 ; n<=num ; n++){
            if (num%n == 0) {
                contagemDivisiveis++;
               //System.out.println(contagemDivisiveis);
            }
        }

        if (contagemDivisiveis == 2) { //considera-se o 1 nao primo!
            System.out.println("O NÚMERO " + num + " É PRIMO!");
        } else {
            System.out.println("O NÚMERO " + num + " NÃO É PRIMO!");
        }

    }
}