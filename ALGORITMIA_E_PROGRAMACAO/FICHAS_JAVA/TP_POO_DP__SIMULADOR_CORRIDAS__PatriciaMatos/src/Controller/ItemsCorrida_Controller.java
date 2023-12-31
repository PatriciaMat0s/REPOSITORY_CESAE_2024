package Controller;

import Domain.ItemsCorrida.ItemsCorrida;
import Inventario.ItemsCorrida_Inventario;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ItemsCorrida_Controller {
        private ArrayList<ItemsCorrida> listaItems;

        //método construtor:
        public ItemsCorrida_Controller() throws FileNotFoundException {
            ItemsCorrida_Inventario inventarioItems = new ItemsCorrida_Inventario("Ficheiros/ItemsCorrida.csv");
            this.listaItems = inventarioItems.getStock();
        }



}
