package FICHA_01;

import java.util.Scanner;

public class EX09 {

    public static void main(String[] args) {

// vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);

// vou declarar variaveis:
        double num1, num2, num3;
        int codigo, ndias;

// vou pedir os numeros e lê-los:

        System.out.print("INTRODUZA O CODIGO DO FUNCIONÁRIO: ");
        codigo=input.nextInt();

        System.out.print("INTRODUZA O NÚMERO DE DIAS QUE O FUNCIONÁRIO " + codigo + " TRABALHOU NO MÊS: ");
        ndias=input.nextInt();


// vou retornar as operaçoes pretendidas:
        System.out.println("FUNCIONÁRIO Nª: " + codigo + ":");
        System.out.println("SALÁRIO ILÍQUIDO/BRUTO: " + (ndias*5 + ndias*40) + " Euros.");
        System.out.println("TOTAL SUBSÍDEO ALIMENTAÇÃO: " + (ndias*5) + " Euros.");
        System.out.println("VALOR IRS RETIDO: " + ((ndias*5 + ndias*40)*.9) + " Euros.");
        System.out.println("VALOR TOTAL DE SS A ENTREGAR: " + ((ndias*5 + ndias*40)*.11 + (ndias*5 + ndias*40)*.2375) + " Euros.");
        System.out.println("SALÁRIO LÍQUIDO: " + ((ndias*5 + ndias*40) - (ndias*5 + ndias*40)*.11 - (ndias*5 + ndias*40)*.2375) + " Euros.");


    }


}
