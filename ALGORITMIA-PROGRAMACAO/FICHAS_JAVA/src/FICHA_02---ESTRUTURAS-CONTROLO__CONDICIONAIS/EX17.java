//Um banco autoriza a conceção de um crédito especial aos seus clientes, num montante variável com base no seu
//        saldo médio do último ano. Faça um programa que leia o saldo médio de um cliente e calcule o valor do crédito
//        especial de acordo com a seguinte tabela. Mostre uma mensagem com o saldo médio e o valor de crédito.
//        Saldo Médio
//        Percentagem
//        De 0 a 2000 (inclusive)
//        Nenhum crédito
//        De 2000 a 4000 (inclusive)
//        20% do valor do saldo médio
//        De 4000 a 6000 (inclusive)
//        30% do valor do saldo médio
//        Acima de 6000
//        40% do valor do saldo médio
//
//package FICHA__02;
//import java.util.Scanner;
//
//public class EX17 {
//    public static void main(String[] args) {
//
//        // vou instanciar o Scanner - sempre mandatório:
//        Scanner input = new Scanner(System.in);
//
//        // vou declarar as variaveis:
//        int num1, num2, num3;
//
//        // vou pedir e ler:
//        System.out.print("Introduza um número: ");
//        num1=input.nextInt();
//        System.out.print("Introduza um número: ");
//        num2=input.nextInt();
//        System.out.print("Introduza um número: ");
//        num3=input.nextInt();
//
//
//        if (num1 < num2 && num1 < num3) {
//            System.out.println( num"" + num1 );
//        }
//
//        if (num2 < num1 && num2 < num3) {
//            System.out.println( "O menor dos números é: " + num2 );
//        }
//
//        if (num3 < num1 && num2 < num3) {
//            System.out.println( "O menor dos números é: " + num3 );
//        }
//
//
//    }
//}