package EX02;

public class TacoFactory {

        public static Taco createTaco(String type) throws IllegalArgumentException {
            switch (type) {
                case "taco vaca":
                    return new TacoVaca();
                case "taco frango":
                    return new TacoFrango();
                case "taco vegetariano":
                    return new TacoVegetariano();

//                case "feijao":
//                    return TacoFeijao(); //CRIAR OBJECTOS SEM

                default:
                    throw new IllegalArgumentException("Não temos esse taco: " + type);
            }
        }

    }

