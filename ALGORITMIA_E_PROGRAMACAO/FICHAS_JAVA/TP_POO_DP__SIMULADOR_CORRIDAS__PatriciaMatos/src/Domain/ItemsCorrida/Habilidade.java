package Domain.ItemsCorrida;

public class Habilidade extends ItemsCorrida {
    protected double aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, double aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }


    @Override
    public void exibirDetalhes() {
        super.mostrarDetalhes();
//        System.out.println("Especificações técnicas: ");
        System.out.println("HORSEPOWER AUGMENTATION: "+ this.aumentoPotencia);
    }

}
