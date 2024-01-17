package Inventario;

import Domain.ItemsCorrida.ItemsCorrida;
import Domain.ItemsCorrida.Modificacao;
import Domain.ItemsCorrida.Habilidade;
import Tools.CSVtoAL_Stock;

import java.io.FileNotFoundException;
import java.util.ArrayList;


//O intuito desta classe é aceder e extrair os dados contidos no arraylist stock, correspondente ao ficheiro ItemsCorrida.csv

public class ItemsCorrida_Inventario {
        private ArrayList<ItemsCorrida> stock;

        //Metodo construtor da classe:
        public ItemsCorrida_Inventario(String path) throws FileNotFoundException {
            CSVtoAL_Stock csv_2_stock = new CSVtoAL_Stock(path);
            this.stock = csv_2_stock.readCSVtoAL_Stock();
        }

        //Método que retorna o arraylist Stock:
        public ArrayList<ItemsCorrida> getStock() {
            return stock;
        }

    }
