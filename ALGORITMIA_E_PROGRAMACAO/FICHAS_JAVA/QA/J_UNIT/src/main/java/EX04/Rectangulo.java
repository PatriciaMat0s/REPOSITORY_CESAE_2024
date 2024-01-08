package EX04;

public class Rectangulo {

        private double largura;
        private double altura;


        public void Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }

        public double calcularArea() {
            return this.largura * this.altura;
        }

        public double calcularPerimetro() {
            return (this.largura * 2) + (this.altura * 2);
        }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

}

