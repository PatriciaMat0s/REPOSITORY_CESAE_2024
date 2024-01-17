//  Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
//Suponha que o número lido da entrada será maior que 2

package FICHA_03;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        // vou declarar as variaveis e pedir o numero:
        int cont, limite;
        cont=2;
        System.out.print("Introduza um número inteiro para limitar: ");
        limite = input.nextInt();

        while (cont<=limite ) {   //0 <=num dava execução infinita, limite tem ser fixo!
            System.out.println(cont);
            cont = cont + 2;
        }
    }
}