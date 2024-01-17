//Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o número de palavras presentes nesse ficheiro.


package FICHA_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX07 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro = new File("FILES/exercicio_07.txt");

        //Vou inicializar o scanner - AKA MAQUINA DE LER - no ficheiro que quero copiar:
        Scanner maquinaLer = new Scanner(ficheiro);

        //Vou instanciar e inicializar as variaveis
        String linha;
        int numLinhas = 0;
        int numPalavras = 0;

        while (maquinaLer.hasNextLine()) {  //Usei ciclo while (e nao o for) porque nao sei o numero de linhas que existem no ficheiro
            numLinhas= numLinhas+1;
            linha = maquinaLer.nextLine();
            String[ ] itensLinha = linha.split(" ");
            numPalavras = numPalavras + itensLinha.length;

            System.out.println(linha);
            System.out.println(numLinhas);
            System.out.println(numPalavras);

        }

        System.out.println("O ficheiro de texto '" + ficheiro + " tem " + numLinhas + " linhas e " + numPalavras + " palavras.");


    }
}