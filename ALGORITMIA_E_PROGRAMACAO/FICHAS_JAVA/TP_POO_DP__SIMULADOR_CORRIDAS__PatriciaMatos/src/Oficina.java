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
     * Deve conter o método venderItem( ) que recebe o Piloto como parâmetro, e verifica se a compra pode ser efetuada, caso tal compra seja possível, deve acrescentar ao inventário do VeiculoAtual do Piloto o item, e decrementar as suas fichas de corrida.
     * @param Piloto - número que o utilizador introduz
     */
    public boolean venderItem(Piloto){}

    /**
     * Deve conter o método venderVeiculo( ) que recebe o Piloto como parâmetro, e verifica se a compra
     * pode ser efetuada, caso tal compra seja possível, deve alterar o Veiculo do Piloto, e decrementar as suas
     * fichas de corrida.
     * @param num - número que o utilizador introduz
     */
    public boolean venderVeiculo(Piloto){}

}
