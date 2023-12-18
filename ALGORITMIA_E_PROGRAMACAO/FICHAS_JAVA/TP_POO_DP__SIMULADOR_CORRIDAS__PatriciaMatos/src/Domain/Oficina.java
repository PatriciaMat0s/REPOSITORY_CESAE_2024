package Domain;

import java.util.ArrayList;

public class Oficina {

    protected ArrayList<Veiculo> garagem; //representa os veículos que o Piloto poderá comprar durante o seu jogo. Sejam carros ou motas.
    protected ArrayList<ItemCorrida> stock; //representa os itens que o Piloto poderá comprar durante o seu jogo. Sejam Modificações ou Habilidades

    public Oficina() {
        this.garagem = new ArrayList<>();
        this.stock = new ArrayList<>();
    }

    /**
     * FUNÇÃO QUE imprime aleatoriamente 6 itens em stock, assim como as suas especificações. Mesmo que a oficina tenha um stock maior, apenas 6 devem ser mostrados de forma aleatória
     */
    public void imprimirStock(){}


    /**
     * FUNÇÃO QUE imprime aleatoriamente 12 veiculos em stock, assim como as suas especificações. Mesmo que a oficina tenha uma garagem maior, apenas 12 devem ser mostrados de forma aleatória.
     */
    public void imprimirGaragem(){}

    /**
     * Deve conter o método venderItem( ) que recebe o Piloto como parâmetro, e faz uma verificação de a compra poder ser efetuada. Caso afirmativo, acrescenta o item ao inventário do VeiculoAtual do Piloto, além de decrementar as fichas de corrida deste.
     * @param piloto - número que o utilizador introduz
     */
    public boolean venderItem(Piloto piloto){}

    /**
     * Deve conter o método venderVeiculo( ) que recebe o Piloto como parâmetro, faz a verificação de a compra
     * poder ser efetuada. Caso afirmativo, deve alterar o Veiculo do Piloto, bem como decrementar as suas
     * fichas de corrida.
     * @param piloto
     */
    public boolean venderVeiculo(Piloto piloto){
        return true;
        return false;
    }

}
