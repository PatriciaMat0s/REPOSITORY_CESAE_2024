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
        double val1, val2;



// vou pedir os numeros e lê-los:
        System.out.print("INTRODUZA UM NÚMERO: ");
        val1=input.nextDouble();

        System.out.print("INTRODUZA O SEGUNDO NÚMERO: ");
        val2=input.nextDouble();

        //FORMA FÁCIL:
//        double aux;
//        aux = val1;
//        val1=val2;
//        val2=aux;

        // vou retornar os valores com a ordem trocada:
        System.out.println( "\nval1: " + val1 );
        System.out.println( "val2: " + val2 );


        //FORMA CRIATIVA, VAMOS TROCAR AS VARIAVEIS
        val1=val1+val2;
        val2=val1-val2;
        val1 = val1 - val2;





    }

}