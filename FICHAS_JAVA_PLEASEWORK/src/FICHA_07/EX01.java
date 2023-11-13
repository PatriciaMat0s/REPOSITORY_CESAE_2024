
//1. Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima na consola


package FICHA_07;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class EX01 {

public static void main(String[] args) throws FileNotFoundException {

        File ficheiro = new File("FILES/exercicio_01.txt") ;

        Scanner sc = new Scanner(ficheiro);

        String linha;

        while (sc.hasNextLine()){
                linha = sc.nextLine();
                System.out.println(linha);
                }
        }
}
