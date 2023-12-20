package Domain;

import java.util.ArrayList;

public class Modificacao extends ItemCorrida {
    protected int diminuicaoDesgaste;
    protected double diminuicaoPeso;
    ArrayList<Carro> carrosPermitidos; //irá guardar o tipo de carros que podem/sabem usar dada reparacao

    // ArrayList<tipodadosAL> nomeAL = new ArrayList<>();
    // this.nomeAL = new ArrayList<>();

    public Modificacao(String nome, int precoFichasCorrida, int diminuicaoDesgaste, double diminuicaoPeso) {
        super(nome, precoFichasCorrida);
        this.diminuicaoDesgaste = diminuicaoDesgaste;
        this.diminuicaoPeso = diminuicaoPeso;
        this.carrosPermitidos = new ArrayList<>();
    }


    public void mostrarDetalhes() {

    }


}
