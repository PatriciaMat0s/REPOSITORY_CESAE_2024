//    Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e imprima os múltiplos de 5 entre eles.


package FICHA_03;
import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        // vou declarar as variaveis e pedir o numero:
        int cont, limInf, limSup;
//        cont=0; //cuidado

        System.out.print("Introduza um número inteiro para o início do intervalo: ");
        limInf = input.nextInt();
        cont = limInf;

        System.out.print("Introduza um número inteiro para o início do intervalo: ");
        limSup = input.nextInt();


        while (cont <= limSup) {
            if ( cont%5 == 0){ //u, multiplo de 5 é um numero divisivel por 5
                System.out.println(cont);}
            cont++;
        }
    }
}