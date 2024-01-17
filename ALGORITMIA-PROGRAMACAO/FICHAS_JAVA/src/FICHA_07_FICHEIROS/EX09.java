//
//// Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima a palavra mais frequente no ficheiro
//
//
//package FICHA_07;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
//import java.util.Scanner;
//
//public class EX09 {
//
//    public static void main(String[] args) throws FileNotFoundException {
//
//        //Vou abrir o ficheiro que quero copiar:
//        File ficheiro = new File("FILES/exercicio_09.txt");
//
//        //Vou inicializar o scanner - AKA MAQUINA DE LER - no ficheiro que quero copiar:
//        Scanner maquinaLer = new Scanner(ficheiro);
//
//        // Vou instanciar a maquina de escrever - vou escrever no ficheiro que criei:
//        PrintWriter maquinaEscrever = new PrintWriter(ficheiro);
//
//        //Vou instanciar e inicializar as variaveis
//        String linha;
//        //String [] vetor = new String [];
//        int lengthVetor=0;
//
//        // Vou transformar o meu ficheiro de texto num vetor de strings, adicionando linhas a linha
//        while (maquinaLer.hasNextLine()) {
//            linha = maquinaLer.nextLine();
//            String[ ] itensLinha = linha.split(" ");
//            lengthVetor = lengthVetor + itensLinha.length;
//
//            for(int i=0; i < itensLinha.length; i++) {
//                System.out.println(itensLinha.length);
//                System.out.println("Length meu vector" + lengthVetor);
//            }
//
//        }
//
//System.out.println("Length final: "+lengthVetor);
//
//    }
//}