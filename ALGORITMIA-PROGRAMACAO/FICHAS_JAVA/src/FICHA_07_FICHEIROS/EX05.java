//  Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e calcule a soma desses números


package FICHA_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro = new File("FILES/exercicio_05_1999.txt");

        //Vou inicializar o scanner no ficheiro que quero ler:
        Scanner maquinaLer = new Scanner(ficheiro);

        //Vou instanciar e inicializar a variavel linha:
        String linha;
        linha = maquinaLer.nextLine();

        //Vou definir um array de strings feito a partir da string linha:
        String[ ] itensLinha = linha.split(" ");

        //Vou instanciar e inicializar variaveis auxiliares:
        double soma=0;
        //double[] itensLinhaNumeros = new double [itensLinha.length];
        //itensLinhaNumeros = Double.parseDouble(itensLinha); //NAO DÁ PARA APLICAR A ARRAYS DE STRINGS, SO A STRINGS


        for(int i=0; i < itensLinha.length; i++){
            soma = soma + Double.parseDouble(itensLinha[i]);
        }
        System.out.println(ficheiro);
        System.out.println("Soma os números no ficheiro de texto '"+ ficheiro + "' é: " + soma);

    }
}
