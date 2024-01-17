//No main deve ser possível instanciar, de acordo com uma escolha do utilizador um taco de determinado tipo e
//        invocar os seus métodos (prepare, bake e box).

package EX02;

import EX01.Product;
import EX01.ProductFactory;

public class Main {

    public static void main(String[] args) {

        Taco meutacofrango = TacoFactory.createTaco("taco frango");
        Taco meutacovaca = TacoFactory.createTaco("taco vaca");
        Taco meutacoveg = TacoFactory.createTaco("taco vegetariano");

        meutacofrango.Prepare();
        meutacofrango.Bake();
        meutacofrango.Box();

        meutacovaca.Prepare();
        meutacofrango.Bake();
        meutacofrango.Box();

        meutacoveg.Prepare();
        meutacoveg.Bake();
        meutacoveg.Box();



    }
}
