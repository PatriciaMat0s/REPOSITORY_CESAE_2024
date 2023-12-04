
//Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas as linhas que contêm uma palavra específica num outro ficheiro


package FICHA_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX08 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro1 = new File("FILES/exercicio_08.txt");

        //Vou inicializar o scanner - AKA MAQUINA DE LER - no ficheiro que quero copiar:
        Scanner maquinaLer = new Scanner(ficheiro1);

        //Vou criar o ficheiro onde quero guardar as linnhas que contem a palavra Vitor:
        File ficheiro2 = new File("FILES/exercicio_08_vitor.txt") ;

        // Vou instanciar a maquina de escrever - vou escrever no ficheiro que criei:
        PrintWriter maquinaEscrever = new PrintWriter(ficheiro2);

        //Vou instanciar e inicializar as variaveis
        String linha;

        while (maquinaLer.hasNextLine()) {

            linha = maquinaLer.nextLine();
            String[ ] itensLinha = linha.split(" ");
            for(int i=0; i < itensLinha.length; i++){
                if (itensLinha[i].equals("Vitor") || itensLinha[i].equals("Vitor,")){ //caso Vitor seja procedido de uma vírgula
                    maquinaEscrever.println(linha);
                    maquinaEscrever.println("");

                    System.out.println(linha);
                    System.out.println();
                }
            }
        }
        maquinaEscrever.close();

    }
}