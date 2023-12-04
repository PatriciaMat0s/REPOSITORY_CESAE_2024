package EX02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Mota extends Veiculo{

    public Mota(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipodeCombustivel tipodeCombustivel, double consumo) throws FileNotFoundException {
        super(marca, modelo, anoFabrico, potencia, cilindrada, TipodeCombustivel.DIESEL, consumo);
    }

    public static void imprimirMota(String caminho) throws FileNotFoundException {

        // Instanciar o Scanner para um ficheiro com o caminho recebido como parâmetro
        Scanner motaScanner = new Scanner(new File(caminho));

        String linha;

        while (motaScanner.hasNextLine()) {
            linha = motaScanner.nextLine();
            System.out.println(linha);
        }


    }
}
