package Domain.ItemsCorrida;

public abstract class ItemsCorrida {
    protected String nome;
    protected int preco; //Nao confundir o atributo "preço", o custo do item, com o atributo "fichas de corrida" da classe Piloto, que representa o crédito de que este dispõe

    public ItemsCorrida(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public void mostrarDetalhes(){
        System.out.println("ITEM DESIGNATION: "+this.nome + "\t| PRICE (RACE COINS): "+this.preco);
    }

    public abstract void exibirDetalhes();
}