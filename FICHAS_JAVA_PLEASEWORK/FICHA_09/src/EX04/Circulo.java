
//4. Escreva um programa onde cria uma classe chamada "Circulo" com um atributo raio.
//        a. Instancie um círculo.
//        b. Crie métodos para calcular a área e a circunferência do círculo

package EX04;

public class Circulo {

    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double calcularArea(){
        return (this.raio)*(this.raio)*3.1415;

    }

    public Double calcularPerimetro(){
        return 2*this.raio*3.1415;

    }

}



