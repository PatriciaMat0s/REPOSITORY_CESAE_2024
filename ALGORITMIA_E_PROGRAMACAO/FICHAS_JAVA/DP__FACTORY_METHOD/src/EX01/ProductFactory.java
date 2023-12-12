package EX01;

public class ProductFactory {


    //o FACTORY METHOD É STATIC!!!!!!!!!!!!
    public static Product createProduct(String type) {
        switch (type) {
            case "book":
                return new Book();
            case "electronics":
                return new Electronics();
            case "clothing":
                return new Clothing();
            default:
                throw new IllegalArgumentException("Tipo de produto inválido: " + type);
        }
    }
}