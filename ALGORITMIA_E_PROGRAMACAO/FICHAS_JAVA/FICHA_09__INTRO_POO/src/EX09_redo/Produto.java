//9. Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock (deve ser inicializada a
//0), e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o stock.

package EX09_redo;
public class Produto {
    private String nome;
    private double preco;
    private double quantidadeStock=0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

//        a. Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
//        atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
//        é possível por quebra de stock do produto.

    public void comprar(double quantidade){
        this.quantidadeStock += quantidade;
        System.out.println("Aquisiçao de "+quantidade+" unidades | stock actual: "+this.quantidadeStock+" unidades");
    }

    public void vender(double quantidade){
        if (this.quantidadeStock >= quantidade){
            this.quantidadeStock-= quantidade;
            System.out.println("Venda de "+quantidade+" unidades | stock actual: "+this.quantidadeStock+" unidades");

        }else {
            System.out.println("Venda inválida por ruptura de stock:");
            System.out.println("    Para vender "+quantidade+" unidades > stock em falta: "+(quantidade-this.quantidadeStock+" unidades"));
        }
    }

}
