//6. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
/// vou avaliar cada elemnto com o respectivamente anterior


package FICHA_05;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);

        //DECLARAR VARIÁVEIS e o vector;
        int[] vetor = new int[10];
        int somaCresc;
        somaCresc = 0;
        //boolean crescente = true; //linhas 29 a 31

        //Preencher o array:
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print(" Insira o valor do array[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Lógica de resoluçao:
        for (int indice = 1; indice < vetor.length; indice++) {

//            if (vetor[indice] <= vetor[indice-1]) {
//                crescente=false;}
//                }

            if (vetor[indice] > vetor[indice-1]) {
                somaCresc++;
        }
            if (somaCresc == indice-1){
                System.out.print("Os elementos do array estão em ordem CRESCENTE!");
            }else{
                System.out.print("Os elementos do array NÃO estão em ordem CRESCENTE!");
            }

        }
    }
}



