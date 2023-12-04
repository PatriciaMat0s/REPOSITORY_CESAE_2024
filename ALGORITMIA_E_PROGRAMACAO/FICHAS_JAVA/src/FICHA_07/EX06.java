//  Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e imprima o nome da pessoa mais velha na consola


package FICHA_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EX06 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro = new File("FILES/exercicio_06.txt") ;

        //Vou inicializar o scanner - AKA MAQUINA DE LER - no ficheiro que quero copiar:
        Scanner maquinaLer = new Scanner(ficheiro);

        //Vou instanciar e inicializar as variaveis
        String linha;
        int idadeMaisVelha=0;
        int idade;
        String pessoa="";

        while (maquinaLer.hasNextLine()){  //Usei ciclo while (e nao o for) porque nao sei o numero de linhas que existem no ficheiro
            //linha = maquinaLer.nextLine();
            String[ ] itensLinha = maquinaLer.nextLine().split(",");

            idade = Integer.parseInt(itensLinha[1]);

            //verificar se a pessoa de cada linha é a mais velha até à corrente linha:
            if (idade > idadeMaisVelha){
                idadeMaisVelha = idade;
                pessoa = itensLinha[0];
            }

        }

        System.out.println("A pessoa mais velha no ficheiro de texto '"+ ficheiro + "' é " +pessoa+ " e tem " +idadeMaisVelha+ " anos. Parabéns!");

    }

}
