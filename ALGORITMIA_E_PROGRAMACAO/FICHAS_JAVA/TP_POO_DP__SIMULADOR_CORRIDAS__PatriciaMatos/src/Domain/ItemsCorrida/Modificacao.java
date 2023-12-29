package Domain.ItemsCorrida;

import Domain.Enums.TipoCarro;

import java.util.ArrayList;

public class Modificacao extends ItemsCorrida {
    protected double diminuicaoDesgaste;
    protected double diminuicaoPeso;
    ArrayList<TipoCarro> carrosPermitidos; //irá guardar o tipo de carros que podem/sabem usar dada reparacao. trata-se de um arraylist de enumeraçoes!

    // ArrayList<tipodadosAL> nomeAL = new ArrayList<>();
    // this.nomeAL = new ArrayList<>();

    public Modificacao(String nome, int precoFichasCorrida, double diminuicaoDesgaste, double diminuicaoPeso) {
        super(nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
        this.carrosPermitidos = new ArrayList<>();
    }

    /**
     * FUNÇÃO QUE imprime aleatoriamente 6 itens em stock, assim como as suas especificações. Mesmo que a oficina tenha um stock maior, apenas 6 devem ser mostrados de forma aleatória
     */
    public void addTipoCarroPermitido(TipoCarro tipoCarroNovo){
        this.carrosPermitidos.add(tipoCarroNovo);
    }
    public void mostrarDetalhes() {

    }


}
