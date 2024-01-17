package EX09;

public class Main {

    public static void main(String[] args) {


        Produto mm = new Produto("m&m 300g", 4.7);
        //Produto cr = new Produto("crunch 100g", 1.8);


//        mm.comprar(5);
//        mm.vender(2);
//        mm.detalhes();

        mm.comprar(1);
        mm.vender(500);
        mm.detalhes();

    }
}
