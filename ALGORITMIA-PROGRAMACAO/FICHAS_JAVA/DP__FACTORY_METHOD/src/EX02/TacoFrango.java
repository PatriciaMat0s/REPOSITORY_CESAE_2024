package EX02;

public class TacoFrango extends Taco{

    @Override
    public void Prepare() {
        System.out.println("A preparar taco de frango");
    }

    @Override
    public void Bake() {
        System.out.println("A enfornar taco de frango");
    }

    @Override
    public void Box() {
        System.out.println("A embalar taco de frango");
    }

}
