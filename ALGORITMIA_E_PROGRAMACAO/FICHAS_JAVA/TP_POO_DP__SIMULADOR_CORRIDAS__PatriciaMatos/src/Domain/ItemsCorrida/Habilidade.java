package Domain.ItemsCorrida;

public class Habilidade extends ItemsCorrida {
    protected int aumentoPotencia;

    public Habilidade(String nome, int precoFichasCorrida, int aumentoPotencia) {
        super(nome, precoFichasCorrida);
        this.aumentoPotencia = aumentoPotencia;
    }

    public double getAumentoPotencia() {
        return aumentoPotencia;
    }

    @Override
    public void exibirDetalhes() {
        super.mostrarDetalhes();
//        System.out.println("Especificações técnicas: ");
        System.out.println("HORSEPOWER AUGMENTATION: "+ this.aumentoPotencia);
    }

}
