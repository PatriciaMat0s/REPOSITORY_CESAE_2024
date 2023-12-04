// Escreva um programa que leia dois valores inteiros e os armazene na variáveis valor1 e valor2.
// Permute o valor das variáveis e apresente o resultado.
// De seguida, verifique se consegue efetuar esta troca sem criar variáveis adicionais

package FICHA_01;
import java.util.Scanner;

public class EX06 {

    public static void main(String[] args) {

// vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);

// vou declarar variaveis:
        double valor1, valor2;

// vou pedir os numeros e lê-los:
        System.out.print("INTRODUZA UM NÚMERO: ");
        valor1=input.nextDouble();

        System.out.print("INTRODUZA O SEGUNDO NÚMERO: ");
        valor2=input.nextDouble();

        // Apresentar valor1 e valor2
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);

        //FORMA FÁCIL:
        double aux;
        aux = valor1;
        valor1=valor2;
        valor2=aux;

        // vou retornar os valores com a ordem trocada:
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);

        ////////////////////////////////////////////////////////////
        System.out.println("FORMA CRIATIVA DE TROCAR AS VARIAVEIS:");
        System.out.println( "\nVal1: " + valor1 );
        System.out.println( "Val2: " + valor2 );

        // Trocar as variáveis
        System.out.println("\nA trocar as variáveis...");

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;


        // Apresentar valor1 e valor2
        System.out.println("\nValor1: " + valor1);
        System.out.println("Valor2: " + valor2);





    }

}