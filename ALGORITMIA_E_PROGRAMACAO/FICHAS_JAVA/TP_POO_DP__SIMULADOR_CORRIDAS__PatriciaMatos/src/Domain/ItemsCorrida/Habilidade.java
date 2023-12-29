package Domain.ItemsCorrida;

import Domain.ItemsCorrida.ItemsCorrida;

public class Habilidade extends ItemsCorrida {
    protected double aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, double aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }


    public void mostrarDetalhes() {

    }

}
