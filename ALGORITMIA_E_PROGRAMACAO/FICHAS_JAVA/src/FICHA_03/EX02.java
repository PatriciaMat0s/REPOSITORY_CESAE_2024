// Faça um programa que imprima os números pares no intervalo de 1 a 400 inclusive.

package FICHA_03;

public class EX02 {
    public static void main(String[] args) {

        // Nao é necessário o scanner nem o input do utilizador:
       // Scanner input = new Scanner(System.in);
//        System.out.print("Introduza o valor em Euros (múltiplo de 5) a decompor: ");
//        valor=input.nextInt();

        // vou declarar as variaveis:
        int num;
        num =0;

        while ( num >= 0 && num <= 400) {
            num = num + 1;
            if (num%2==0) {
                System.out.println(num);
            }
        }
    }
}