package Domain;

public abstract class ItemCorrida {
    protected String nome;
    protected int precoFichasCorrida;

    public ItemCorrida(String nome, int precoFichasCorrida) {
        this.nome = nome;
        this.precoFichasCorrida = precoFichasCorrida;
    }

    public abstract void mostrarDetalhes();
}
