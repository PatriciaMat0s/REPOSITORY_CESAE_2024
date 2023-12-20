package Domain;

public abstract class ItemCorrida {
    protected String nome;
    protected int preco_emFichasCorrida;

    public ItemCorrida(String nome, int precoFichasCorrida) {
        this.nome = nome;
        this.preco_emFichasCorrida = precoFichasCorrida;
    }



}