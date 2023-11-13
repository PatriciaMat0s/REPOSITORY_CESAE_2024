// 2. Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem


package FICHA_07;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.PrintWriter;
import java.util.Scanner; // Import the Scanner class to read text files

public class EX02 {

    public static void main(String[] args) throws FileNotFoundException {

        String conteudoNovo="Vamos escrever esta frase no ficheiro! Yay!";

        //Vou criar o ficheiro:
        File novoFicheiro = new File("FILES/exercicio_02.txt") ;

        // Instanciar a maquina de escrevr - vou escrever no ficheiro que criei:
        PrintWriter maquinaEscrever = new PrintWriter(novoFicheiro);

        maquinaEscrever.println(conteudoNovo);
        maquinaEscrever.println("Escreve qualquer coisa!");

        maquinaEscrever.close();

    }
}