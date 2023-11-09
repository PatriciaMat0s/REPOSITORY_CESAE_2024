//  Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
//Exemplo:
//Valores Lidos: 22 32
// Resultado: 10 32 PM
//Valores Lidos: 10 44
//Resultado: 10 44 AM

package FICHA_02;
import java.util.Scanner;

public class EX13 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int horas, mins;

        // vou pedir e ler:
        System.out.print("Introduza as horas no sistema 24H: ");
        horas=input.nextInt();
        System.out.print("Introduza os minutos no sistema 24H: ");
        mins=input.nextInt();


        if (horas <= 12) {
            System.out.print( horas +" "+ mins + " AM" );
        }

        else {
            System.out.print( (horas-12) +" "+ mins + " PM" );
        }
    }
}