//         Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100.
//         De seguida, deverá permitir ao jogador 2 tentar acertar no valor inserido pelo jogador 1.
//         A cada iteração, enquanto o valor não for descoberto, deverá informar se o valor introduzido pelo
//         jogador 2 é inferior ou superior ao valor inserido pelo jogador 1.
//         No final (quando o valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.


package FICHA_04;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        int numJog1, numJog2, numTents;
        numTents = 0;

        // ciclo para nao deixar o utilizador avançar caso nao coloque um num adequado:
        do {
            System.out.print("Jogador 1, insira um número entre 0 e 100: ");
            numJog1 = input.nextInt();
        } while (numJog1>100);


        do {
            System.out.print("Jogador 2, adivinhe o número (de 0 a 100): ");
            numJog2 = input.nextInt();

            if (numJog2 > numJog1) {
                System.out.println("Incorrecto, o número a adivinhar é menor!");
            }
            if (numJog2 < numJog1) {
                System.out.println("Incorrecto, o número a adivinhar é maior!");
            }

            numTents++;  //conta o numero de tentativas

        } while (numJog2 != numJog1);

        System.out.println("ADIVINHOU o número em " + numTents + " tentativas! Yay!");

    }
}