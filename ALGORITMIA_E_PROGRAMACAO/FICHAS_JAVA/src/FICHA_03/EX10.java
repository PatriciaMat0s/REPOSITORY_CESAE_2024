//   Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os
//   números inteiros de 0 até limite inclusive, com incremento de salto. Suponha que limite e salto são maiores que zero.
//   Exemplo: Valores lidos: 10 (limite) e 3 (salto)  //Saída do algoritmo: 0 3 6 9


package FICHA_03;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        // vou declarar as variaveis e pedir o numero:
        int cont, limite, incremento;
        cont=0;
        System.out.print("Introduza um número inteiro para ser o limite: ");
        limite = input.nextInt();

        System.out.print("Introduza um número inteiro para ser o incremento: ");
        incremento = input.nextInt();

        while (cont<=limite ) {   //0 <=num dava execução infinita, limite tem ser fixo!
            System.out.println(cont);
            cont = cont + incremento;
            }
    }
}