//   14. Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo while.
//Exemplo de Fatorial de 5: 5x4x3x2x1=120
//Exemplo de Fatorial de 8: 8x7x6x5x4x3x2x1=40320

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args) {
//
//        //Inicializar o scanner:
        Scanner input = new Scanner(System.in);
////
//        // vou declarar e inicializar as variaveis e pedir o numero de ciclos:
        int num, cont;
        cont =1;
//
        System.out.print("Introduza um número inteiro: ");
        num = input.nextInt();
//
        while (cont <= n) {

//
        }
//        System.out.println(limSup);
//        System.out.println(numsCresc);


        //VERIFICAR SE É SEMPRE CRESCENTE
        // ATENCAO: NUMERO DE COMPARAÇOES (DOIS A DOIS NUMEROS) = NUMERO DE NUMEROS (IGUAL AO DE CICLOS) - 1;
        //numsCresc == limSup-1:

        if (numsCresc == limSup-1) {
            System.out.print("Sequência está em ordem crescente!");
        } else {
            System.out.print("Sequência está em ordem NÃO crescente.");
        }
    }
}