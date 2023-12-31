package Controller;

import Domain.ItemsCorrida.ItemsCorrida;
import Domain.Piloto;
import Domain.Veiculo.Veiculo;
import Inventario.ItemsCorrida_Inventario;
import Inventario.Veiculos_Inventario;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.io.IOException;
import java.util.Random;


public class Veiculos_Controller {
        private ArrayList<Veiculo> listaVeiculos;

        //Método construtor:
        public Veiculos_Controller() throws FileNotFoundException {
            Veiculos_Inventario inventarioVeiculos = new Veiculos_Inventario("Ficheiros/VeiculosCorridas.csv");
            this.listaVeiculos = inventarioVeiculos.getGaragem();
        }

// MÉTODOS QUE TRABALHAM COM VEICULOS, VAO SER REUNIDOS NESTA CLASSE:

    /**
     * FUNÇÃO QUE imprime aleatoriamente 12 veiculos em stock, assim como as suas especificações. Mesmo que a oficina tenha uma garagem maior, apenas 12 devem ser mostrados de forma aleatória.
     */
    public void imprimirGaragem() {

        Random rand = new Random();

        ArrayList<Integer> arrayIndexAleatorio = new ArrayList<>();

        while (arrayIndexAleatorio.size() < 12) {
            int indexAleatorio = rand.nextInt(0, listaVeiculos.size());

            if (!arrayIndexAleatorio.contains(indexAleatorio)) {
                arrayIndexAleatorio.add(indexAleatorio);
            }
        }

        Veiculo veiculoAtual;
        int contador = 1;
        System.out.println("**-**-* LIST OF VEHICLES CURRENTLY AVAILABLE: *-**-**");
        for (int i = 0; i < arrayIndexAleatorio.size(); i++) {
            veiculoAtual = listaVeiculos.get(arrayIndexAleatorio.get(i));
            System.out.print("VEHICLE #" + contador++ + ": ");
            //Simplifiquei, nao apresentando a especificade referente às subclasses (habilidade e modificaçao):
            veiculoAtual.mostrarDetalhes();
        }

    } //fecho metodo imprimirgaragem()



    /**
     * Método que recebe o piloto como parâmetro, e faz a verificação de a compra poder ser efetuada. Caso afirmativo, deve alterar o Veiculo do Piloto, bem como decrementar as suas fichas de corrida.
     * @param piloto
     */
    public void comprarVeiculo(Piloto piloto, int numVeiculoEscolhido){

        Veiculo veiculoAtual = piloto.getVeiculoAtual();
        Veiculo veiculoDesejado;

        //Obter o objecto veiculo escolhido do array dos Veiculos (obtido por leitura do ficheiro, ver nas TOOLS)
        //O índice que corresponde ao veiculo escolhido será o número com que foi listado na funçao imprimirGaragem menos um pois ao numero#1 da lista impressa corresponde o índice 0 do array:
        veiculoDesejado= listaVeiculos.get(numVeiculoEscolhido-1);

        //Vamos comparar o crédito do Piloto com o preço do item que quer adquirir

        //Caso o piloto possa comprar o item:
        if ( piloto.getFichasCorrida() >= veiculoDesejado.getPreco() ){
            System.out.println("PROCEEDING TO ITEM ACQUISITION:");

            //Descontar o preço do item ao crédito do jogador (guardado na variável fichasCorrida):
            piloto.setFichasCorrida( piloto.getFichasCorrida() - veiculoDesejado.getPreco() );

            //Vamos actualizar o veiculoAtual do Piloto:
            veiculoAtual = veiculoDesejado;


        }else{   //Caso o piloto nao possa comprar o item:
            System.out.println("BOOHOO, YOU DON'T HAVE ENOUGH COINS TO ACQUIRE THE ITEM!");
            System.out.println("TT__TT");
        }

    }



}
