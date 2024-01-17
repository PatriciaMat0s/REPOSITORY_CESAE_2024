
//9. Crie uma classe Produto que tenha os atributos nome, preço e quantidade em stock (deve ser inicializada a
//        0), e os métodos comprar e vender, que recebam a quantidade desejada como parâmetro e atualizem o stock.
//        a. Para vender um produto, deve analisar se existe stock suficiente. Caso exista stock suficiente deve
//        atualizar o stock. Caso não exista stock suficiente deve informar o utilizador que tal transação não
//        é possível por quebra de stock do produto.
//        b. No método main, crie um objeto dessa classe Produto e chame o método para comprar 5 unidades.
//        c. Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
//        d. Invoque o método para comprar 10 unidades.
//        e. Invoque o método para vender 35 unidades

package EX09;


public class Produto {

    private String descricao;
    private double preco;
    private int quantidadeStock=0;


    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public void vender(int quantidadeDesejada){
        if (quantidadeDesejada <= this.quantidadeStock){
            this.quantidadeStock = this.quantidadeStock-quantidadeDesejada;
        }else{
            System.out.println("\nRuptura de stock, nao é possivel vender a quantidade solicitada!");
        }
    }

    public void comprar(int quantidadeDesejada){
            this.quantidadeStock=this.quantidadeStock+quantidadeDesejada;
        }

    public void detalhes(){
        System.out.println("\nDescrição: "+this.descricao);
            System.out.println("Preço unitario: "+this.preco+" Euros");
            System.out.println("Quantidade em Stock: "+this.quantidadeStock);
        System.out.println();
    }

}
