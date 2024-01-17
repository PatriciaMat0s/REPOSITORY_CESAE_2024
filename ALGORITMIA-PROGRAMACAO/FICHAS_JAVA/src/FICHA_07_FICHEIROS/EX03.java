//Escreva um programa que leia o conteúdo de um ficheiro de texto e o grave noutro arquivo

package FICHA_07;

import javax.management.MBeanAttributeInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX03 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro1 = new File("FILES/exercicio_03.txt") ;

        //Vou criar o ficheiro onde quero guardar o que copiei:
        File ficheiro2 = new File("FILES/exercicio_03_copiado.txt") ;

        //Vou inicializar o scanner no ficheiro que quero copiar:
        Scanner sc = new Scanner(ficheiro1);

        // Vou instanciar a maquina de escrevEr - vou escrever no ficheiro que criei:
        PrintWriter maquinaEscrever = new PrintWriter(ficheiro2);

        //Vou instanciar a variavel string
        String linha;

        //Vou ler as linhas do ficheiro
        while (sc.hasNextLine()){
            linha = sc.nextLine();
            System.out.println(linha);
            maquinaEscrever.println(linha);
        }

        maquinaEscrever.close();

    }

}
