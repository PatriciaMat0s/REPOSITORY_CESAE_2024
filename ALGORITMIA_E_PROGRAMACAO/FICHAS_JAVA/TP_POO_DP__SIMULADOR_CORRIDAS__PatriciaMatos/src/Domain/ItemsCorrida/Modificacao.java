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
     * FUNÇÃO AUXILIAR QUE VAI SER USADA NA CLASSE CSVtoAL_Stock, fazendo um CAST
     */
    public void addTipoCarroPermitido(TipoCarro tipoCarroNovo){
        this.carrosPermitidos.add(tipoCarroNovo);
    }
    @Override
    public void exibirDetalhes() {
        super.mostrarDetalhes();
//        System.out.println("Especificações técnicas: ");
            System.out.println("WEAR REDUCTION: " + this.diminuicaoDesgaste + "\t| "+"WEIGHT REDUCTION: "+this.diminuicaoPeso+"Kg"+ "\t| "+"ELECTIBLE TYPES OF CAR: "+this.carrosPermitidos);
    }


}
