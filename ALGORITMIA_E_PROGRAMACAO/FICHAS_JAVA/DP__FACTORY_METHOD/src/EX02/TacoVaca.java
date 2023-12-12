package EX02;

public class TacoVaca extends Taco{

      @Override
      public void Prepare() {
            System.out.println("A preparar taco de vaca");
      }

      @Override
      public void Bake() {
            System.out.println("A enfornar taco de vaca");
      }

      @Override
      public void Box() {
            System.out.println("A embalar taco de vaca");
      }

}
