// Faça um programa que imprima os números ímpares no intervalo de 531 a 750 inclusive.

package FICHA_03;

public class EX03 {
    public static void main(String[] args) {

        // Nao é necessário o scanner nem o input do utilizador:
       // Scanner input = new Scanner(System.in);
//        System.out.print("Introduza o valor em Euros (múltiplo de 5) a decompor: ");
//        valor=input.nextInt();

        // vou declarar as variaveis:
        int num;
        num =531;

        while ( num <= 750 ) {
            if (num%2!=0) {
                System.out.println(num);
            }
            num = num + 1;
        }
    }
}