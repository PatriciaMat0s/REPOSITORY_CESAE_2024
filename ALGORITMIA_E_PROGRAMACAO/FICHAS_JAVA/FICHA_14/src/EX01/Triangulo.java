package EX01;

public class Triangulo extends FiguraGeometrica{

    private double comprimento;
    private double largura;

    public Triangulo(String cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }
    @Override
    public double calcularArea(){
        return this.comprimento*this.largura/2;
    }

    @Override
    public double calcularPerimetro(){
        return this.comprimento*3; //sei que a formula esta mal
    }

}
