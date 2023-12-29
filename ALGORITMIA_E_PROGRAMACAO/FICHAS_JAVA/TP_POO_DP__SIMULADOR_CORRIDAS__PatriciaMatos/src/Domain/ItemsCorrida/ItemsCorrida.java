package Domain.ItemsCorrida;

public abstract class ItemsCorrida {
    protected String nome;
    protected int preco_emFichasCorrida;

    public ItemsCorrida(String nome, int precoFichasCorrida) {
        this.nome = nome;
        this.preco_emFichasCorrida = precoFichasCorrida;
    }



}