
//b. No método main, crie um objeto dessa classe Produto e chame o método para comprar 5
////        unidades.
////        c. Invoque o método para vender 2 unidades, e imprima a quantidade de stock.
////        d. Invoque o método para comprar 10 unidades.
////        e. Invoque o método para vender 35 unidades

package EX09_redo;

public class Main {

    public static void main(String[] args) {

        Produto champo = new Produto("champo", 10);

        champo.comprar(5);
        champo.vender(2);
        champo.comprar(10);
        champo.vender(35);
    }
}
