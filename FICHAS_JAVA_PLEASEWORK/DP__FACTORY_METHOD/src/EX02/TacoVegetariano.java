package EX02;

public class TacoVegetariano extends Taco {

    @Override
    public void Prepare() {
        System.out.println("A preparar taco vegetariano");
    }

    @Override
    public void Bake() {
        System.out.println("A enfornar taco vegetariano");
    }

    @Override
    public void Box() {
        System.out.println("A embalar taco vegetariano");
    }
}
