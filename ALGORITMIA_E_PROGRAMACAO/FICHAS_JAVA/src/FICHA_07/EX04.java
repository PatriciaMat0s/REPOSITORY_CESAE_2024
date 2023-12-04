//  Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na consola.


package FICHA_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro = new File("FILES/exercicio_04.csv");

        //Vou inicializar o scanner no ficheiro que quero ler:
        Scanner maquinaLer = new Scanner(ficheiro);

        //Vou instanciar a variavel string
        String linha;

        //Vou ler as linhas do ficheiro
        while (maquinaLer.hasNextLine()){
            linha = maquinaLer.nextLine();
            System.out.println(linha);
        }

    }

}
