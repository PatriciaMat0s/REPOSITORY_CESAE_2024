// Escreva um programa que leia um ficheiro CSV contendo informações de vendas
// (tipo de produto, produto, quantidade vendida, valor unitario) e calcule o valor total das vendas

// tipo_produto,produto,quantidade_vendida,preco_unitario
// Alimentacao,Bacalhau,20,15.99

package FICHA_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero copiar:
        File ficheiro = new File("FILES/exercicio_10.csv");

        //Vou inicializar o scanner - AKA MAQUINA DE LER - no ficheiro que quero copiar:
        Scanner maquinaLer = new Scanner(ficheiro);

        //Vou instanciar e inicializar as variaveis
        String linha;
        double precoTotal=0;
        linha = maquinaLer.nextLine(); //para saltar o cabeçalho, vistoq ue me interessa fazer cãlculos e letras nao podem ser convertidas a numeros

        while (maquinaLer.hasNextLine()) {  //Usei ciclo while (e nao o for) porque nao sei o numero de linhas que existem no ficheiro
            linha = maquinaLer.nextLine();
            String[ ] itensLinha = linha.split(",");
//            if (itensLinha[0]=="tipo_produto") {
//                precoTotal=0;} // visto que a condiçao sera sempre V, nao estorva
            precoTotal = precoTotal + Double.parseDouble(itensLinha[2])*Double.parseDouble(itensLinha[3]);
        }

        System.out.println("O total de compras no ficheiro de texto '" + ficheiro + " soma " + precoTotal + " Euros.");

    }
}