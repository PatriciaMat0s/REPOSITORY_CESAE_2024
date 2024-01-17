// Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par inserido.
// Caso não exista, deverá informar o utilizador.

//package FICHA_05;
//
//import java.util.Scanner;
//
//    public class EX07 {
//        public static void main(String[] args) {
//
//            // Inicializar o scanner:
//            Scanner input = new Scanner(System.in);
//
//            // DECLARAR VARIÁVEIS e o vector;
//            int[] vetor = new int[10];
//            int valorMaxPar;
//
//            // Preencher o array - lógica de inserção:
//            for (int indice = 0; indice < vetor.length; indice++) {
//                System.out.print(" Insira o valor array[" + (indice) + "]: ");
//                vetor[indice] = input.nextInt();
//            }
//
//            //interessa comparar a um par, mesmo que nao seja o maior:
//            for (int indice = 0; indice < vetor.length; indice++) {
//                System.out.print(" Insira o valor array[" + (indice) + "]: ");
//                maiorvetor[indice]
//            }
//
//            //valorMax=vetor[0]; //ou qualquer posicao, qq uma dá! o zero é apenas mais seguro pois todos os vectores o têm,
//            // caso se mude o tamanho ou o indice
//
////            // Calcular o valor máximo - lógica de resolução:
////            for (int indice = 0; indice <= 9; indice++) {
////                if (vetor[indice] > valorMax && vetor [indice]%2==0){
////                    valorMax=vetor[indice];
////                }
////            }
//
//            // Apresentar o valor máximo:
//            System.out.print("O maior número par do array é " + valorMax + ".");
//        }
//    }



// Implemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par inserido.
// Caso não exista, deverá informar o utilizador.

package FICHA_05;
import java.util.Scanner;
public class EX07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int[] vetor = new int[10];
        int maiorElementoPar=-1;

        // Ler vetor
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Insira um número no Vetor[" + indice + "]: ");
            vetor[indice] = input.nextInt();
        }

        // Encontrar um par qualquer para inicializar maiorElementoPar
        for (int indice = 0; indice < vetor.length; indice++) {
            if(vetor[indice]%2==0){
                maiorElementoPar=vetor[indice];
            }
        }

        // Encontrar o maior par
        for (int indice = 0; indice < vetor.length; indice++) {
            if(vetor[indice]>maiorElementoPar && vetor[indice]%2==0){
                maiorElementoPar=vetor[indice];
            }
        }

        if(maiorElementoPar%2==0){
            System.out.println("Maior Par: "+maiorElementoPar);
        }else{
            System.out.println("Não há pares no vetor");
        }


    }
}