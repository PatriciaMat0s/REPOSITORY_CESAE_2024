////  MATRIZES ---
////  Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira junto aos elementos da segunda
//
//package FICHA_05;
//
//import java.util.Scanner;
//
//public class EX12 {
//    public static void main(String[] args) {
//
//        // Inicializar o scanner:
//        Scanner input = new Scanner(System.in);
//
//        // Inicializar a matriz;
//        int[][] matrix = new int[10][2];
//        int[] vetor1 = new int [10]; //podia ser qq elemento da matriz
//        int[] vetor2 = new int[10];
//
//
//        // Preencher ã matriz - lógica de inserção:
//        for (int indiceRow = 0; indiceRow < vetor1.length; indiceRow++) {
//                System.out.print(" Insira o valor matriz[" + indiceRow + "]: ");
//                vetor1[indiceRow] = input.nextInt();
//            }
//        }
//
//        // Lógica de resolucao - encontrar maior e menor valor na matriz:
//        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
//            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
//                if (matrix[indiceRow][indiceCol] > maior){
//                    maior=matrix[indiceRow][indiceCol];}
//                if (matrix[indiceRow][indiceCol] < menor){
//                    menor=matrix[indiceRow][indiceCol];}
//            }
//        }
//
//        // Imprimir a matriz:
//        for (int indiceRow = 0; indiceRow < matrix.length; indiceRow++) {
//            for (int indiceCol = 0; indiceCol < matrix[0].length; indiceCol++) {
//                System.out.print(matrix[indiceRow][indiceCol] +"\t"); //tabulação
//            }
//            System.out.print("\n"); //ou System.out.println("");
//        }
//
//        // Apresentar o valor máximo:
//        System.out.print("O valor menor é " + menor + " e o valor maior é " + maior + ".");
//    }
//}