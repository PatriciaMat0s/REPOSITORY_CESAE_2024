//6. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.


package FICHA_05;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //DECLARAR VARIÁVEIS e o vector;
        int[] vetor = new double[3];

        //Preencher o array:
        for (int indice = 0; indice <= 3; indice++) {
            System.out.print(" Insira o valor do array[" + (indice) + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Lógica de resoluçao:
        for (int indice = 1; indice <= 3; indice++) {
            if (vetor[indice] > vetor[indice-1]) {
                
        }

        System.out.print("O maior número do array é " +  + ".");



    }
}