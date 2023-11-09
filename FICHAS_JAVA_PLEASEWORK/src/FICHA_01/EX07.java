// Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos. Apresente o valor
// a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.

package FICHA_01;
import java.util.Scanner;

public class EX07 {

    public static void main(String[] args) {

// vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);

// vou declarar variaveis:
        double num1, num2, num3;


// vou pedir os numeros e lê-los:

        System.out.print("INTRODUZA O PREÇO DO PRIMEIRO ARTIGO: ");
        num1=input.nextDouble();

        System.out.print("INTRODUZA O PREÇO DO SEGUNDO ARTIGO: ");
        num2=input.nextDouble();

        System.out.print("INTRODUZA O PREÇO DO TERCEIRO ARTIGO: ");
        num3=input.nextDouble();


// vou retornar as operaçoes pretendidas:
        System.out.println("TOTAL A PAGAR É, COM 10% DE DESCONTO INCLUÍDO: " + (num1+num2+num3)*0.9 + " Euros.");

    }

}