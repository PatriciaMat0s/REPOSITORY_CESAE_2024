package EX06;


import EX05.Carro;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calculadora myCalculator = new Calculadora();

        double num1, num2;
        System.out.println("Introduza num1: ");
        num1=input.nextDouble();
        System.out.println("Introduza num2: ");
        num2=input.nextDouble();

        System.out.println("Soma: "); //para concatenar teria de ter um return de valor na funcao, nao um sout. sout de sout da asneira
        myCalculator.adicao(num1, num2);

        System.out.println("Subtracao: ");
        myCalculator.subtracao(num1, num2);

        System.out.println("Multiplicacao: ");
        myCalculator.multiplicacao(num1, num2);

        System.out.println("Divisao: ");
        myCalculator.divisao(num1, num2);
    }

}
