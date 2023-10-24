// Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
//realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
//a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.

package FICHA__02;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        double num1, num2;
        String opera;

        // vou pedir e ler:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num1=input.nextDouble();

        System.out.print("INTRODUZA OUTRO NÚMERO: ");
        num2=input.nextDouble();

        System.out.print("INTRODUZA A OPERAÇÃO QUE DESEJA EFECTUAR:  +  ou  -  ou  *  ou  / ");
        opera=input.next();


        switch (opera) {
            case "+": System.out.println("Soma = " + (num1+num2));
                break;
            case "-": System.out.println("Subtracção = " + (num1-num2));
                break;
            case "*": System.out.println("Produto = " + num1*num2);
                break;
            case "/": System.out.println("Divisão = " + num1/num2);
                break;
            default:
                    System.out.println("Operação aritmética não conhecida. Seleccione entre + - * /");;
        }

// TIP: uma string não pode ser tratada desta forma:
//        if (opera == "-"){
//            System.out.println("if resultou");
//        }

    }
}