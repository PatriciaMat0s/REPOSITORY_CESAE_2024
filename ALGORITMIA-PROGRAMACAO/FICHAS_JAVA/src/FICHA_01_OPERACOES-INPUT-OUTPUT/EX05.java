package FICHA_01;

import java.util.Scanner;

public class EX05 {



    public static void main(String[] args) {



// vou instanciar o Scanner (obrigatório):

        Scanner input = new Scanner(System.in);



// vou declarar variaveis:

        double num1, num2, num3, media;



// vou pedir os numeros e lê-los:

        System.out.print("INTRODUZA UM NÚMERO: ");

        num1=input.nextDouble();

        System.out.print("INTRODUZA O SEGUNDO NÚMERO: ");

        num2=input.nextDouble();

        System.out.print("INTRODUZA O TERCEIRO NÚMERO: ");

        num3=input.nextDouble();





// vou retornar as operaçoes pretendidas:

        System.out.println("A MÉDIA DOS NÚMEROS É " + (num1+num2+num3)/3 + " E A SUA MÉDIA PONDERADA (20/30/50) É " + (num1*0.2+num2*0.3+num3*0.5) + ".");

    }

}