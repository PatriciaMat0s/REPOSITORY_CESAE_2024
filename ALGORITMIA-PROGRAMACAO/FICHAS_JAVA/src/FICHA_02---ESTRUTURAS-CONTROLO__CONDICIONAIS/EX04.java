//Na fórmula 1, os pontos no final de cada corrida são atribuidos da seguinte forma:
//        a. 1º Lugar: 10 pontos
//        b. 2º Lugar: 8 pontos
//        c. 3º Lugar: 6 pontos
//        d. 4º Lugar: 5 pontos
//        e. 5º Lugar: 4 pontos
//        f. 6º Lugar: 3 pontos
//        g. 7º Lugar: 2 pontos
//        h. 8º Lugar: 1 ponto
//        Escreva um programa que leia o lugar em que o piloto terminou e escreva quantos pontos ganhou.

        package FICHA_02;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);


        // vou declarar as variaveis:
        int lugar;

        // vou pedir e ler o lugar:
        System.out.print("EM QUE LUGAR FICOU NA CORRIDA? ");
        lugar=input.nextInt();

        switch (lugar) {
            case 1:  System.out.print("GANHOU 10 PONTOS!");
                break;
            case 2: System.out.print("GANHOU 8 PONTOS!");
                break;
            case 3: System.out.print("GANHOU 6 PONTOS!");
                break;
            case 4: System.out.print("GANHOU 5 PONTOS!");
                break;
            case 5: System.out.print("GANHOU 4 PONTOS!");
                break;
            case 6: System.out.print("GANHOU 3 PONTOS!");
                break;
            case 7: System.out.print("GANHOU 2 PONTOS!");
                break;
            case 8: System.out.print("GANHOU 1 PONTOS!");
                break;
            default: System.out.print("GANHOU JUÍZO PARA A PRÓXIMA!");;
        }
    }
}