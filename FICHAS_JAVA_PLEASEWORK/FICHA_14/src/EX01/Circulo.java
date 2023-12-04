package EX01;

public class Circulo extends FiguraGeometrica{
    //private double pi = 3.1415;
    private double raio;


    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return this.raio*this.raio*3.1415;
    }

    @Override
    public double calcularPerimetro(){
        return 2*3.1415*this.raio;
    }




}
