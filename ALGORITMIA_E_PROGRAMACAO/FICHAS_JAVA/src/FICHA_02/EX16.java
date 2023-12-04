//Escreva um programa que lê um valor em euros (múltiplo de 5) e calcula qual o menor número possível de notas
//        de 200, 100, 50, 20, 10, 5 em que o valor pode ser decomposto.
//        Escrever o valor lido e a relação de notas necessárias.

package FICHA_02;
import java.util.Scanner;

public class EX16 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int valor;
        //int duz, cem, cinq, vin, dez, cinco; NAO! BASTA UMA VARIAVEL
        int numNotas;

        // vou pedir e ler:
        System.out.print("Introduza o valor em Euros (múltiplo de 5) a decompor: ");
        valor=input.nextInt();
        System.out.print("O seu valor decompõe-se em: ");


        if (valor % 5 == 0) {
            numNotas = valor / 200;
            System.out.print(" > " + numNotas + "notas de 200 Eur.");

            numNotas = (valor % 200) / 100;
            System.out.println(" > " + numNotas + " notas de 100 Eur.");

            numNotas = ((valor % 200) % 100 ) / 50;
            System.out.println(" > " + numNotas + " notas de 50 Eur.");

            numNotas = (((valor % 200) % 100 ) % 50) / 20;
            System.out.println(" > " + numNotas + " notas de 20 Eur.");

            numNotas = ((((valor % 200) % 100 ) % 50) % 20) /10;
            System.out.println(" > " + numNotas + " notas de 10 Eur.");

            numNotas = (((((valor % 200) % 100 ) % 50) % 20) % 10) /5;
            System.out.println(" > " + numNotas + " notas de 5 Eur.");


        } else {
            System.out.print("Valor inválido, introduza um valor múltiplo de 5! ");
        }

    }
}