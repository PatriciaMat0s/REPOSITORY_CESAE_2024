//   Faça um programa que imprima os números inteiros de 1 a 100 inclusive,
//   e no final imprima também o valor do seu somatório. (Não necessita de Scanner ou input do utilizador

package FICHA_03;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {

        // Inicializar o scanner --- no need
        //Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num, soma=0;

        num =1;
        while ( num <= 100 ) {
            System.out.println(num);
            soma = soma + num ;    //soma=101*50;
            num++; //num=num+1;
        }
        System.out.print("A soma dos números de 1 a 100 é: " + soma );

    }
}