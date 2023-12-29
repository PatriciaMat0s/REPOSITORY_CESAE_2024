package Inventario;

import Domain.Veiculo.Veiculo;
import Domain.Veiculo.Carro;
import Domain.Veiculo.Mota;
import Tools.CSVtoAL_Garagem;
import Tools.CSVtoAL_Stock;

import java.io.FileNotFoundException;
import java.util.ArrayList;


//O intuito desta classe é aceder e extrair os dados contidos no arraylist stock, correspondente ao ficheiro ItemsCorrida.csv

public class Veiculos_Inventario {
    private ArrayList<Veiculo> garagem;

    //Metodo construtor da classe:
    public Veiculos_Inventario(String path) throws FileNotFoundException {
        CSVtoAL_Garagem csv_2_garagem = new CSVtoAL_Garagem(path);
        this.garagem = csv_2_garagem.readCSVtoAL_Garagem();
    }

    //Método que retorna o arraylist Stock:
    public ArrayList<Veiculo> getGaragem() {
        return garagem;
    }
}
