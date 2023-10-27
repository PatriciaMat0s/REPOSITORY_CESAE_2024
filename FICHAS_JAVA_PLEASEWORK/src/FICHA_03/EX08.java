//   Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
//   deve dizer a média dos números introduzidos (excluindo o -1)

package FICHA_03;

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {

        // Inicializar o scanner --- no need
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        Double num, soma, numIteracoes;

        num = 0.0;
        soma = 0.0;
        numIteracoes = 0.0;

        while ( num != -1 ) {
            soma = soma + num ;
            System.out.print("Introduza um número inteiro: ");
            num = input.nextDouble();
            // System.out.println(num);

            //System.out.println(soma);
            numIteracoes++;
            //System.out.println(numIteracoes);
        }
       // soma = soma+1; nao é necessario se a linha 22 estiver na 26
        numIteracoes = numIteracoes-1;

        //System.out.println("Numero iteraçoes totais: " + numIteracoes);
        //System.out.println("Soma total: " + soma);
        System.out.print("A média dos números é " + (soma/numIteracoes) );

    }
}