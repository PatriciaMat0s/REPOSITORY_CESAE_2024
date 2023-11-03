////   14. Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo while.
////Exemplo de Fatorial de 5: 5x4x3x2x1=120

import java.util.Scanner;
public class EX14 {
    public static void main(String[] args) {
//
//        //Inicializar o scanner:
        Scanner input = new Scanner(System.in);
////
//        // vou declarar e inicializar as variaveis e pedir o numero de ciclos:
        int num, cont, factorial;
        cont = factorial = 1; //cuidado

//
        System.out.print("Introduza um número inteiro: ");
        num= input.nextInt();
//
        while (cont <= num) {
//
            factorial = factorial * cont;
            cont++;
        }
        System.out.print("Factorial de " +num+": "+factorial);

    }
}
