package EX07;


public class Main {

    public static void main(String[] args) {

        Livro livroWhatThey = new Livro("What they didnt teach u in high school", "Autorwtdtuhs", "educativo", 250, "14236_whatheydidmt_1233");

        Livro livroSaramago = new Livro("Jamgada de pedra", "José saramago", "emsaio", 200, "14236_jamgadapedra_1233");

        livroWhatThey.exibirDetalhes();
        System.out.println("");
        livroSaramago.exibirDetalhes();

    }

}
