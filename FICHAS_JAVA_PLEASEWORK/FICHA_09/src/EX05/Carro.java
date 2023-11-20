
//Crie uma classe chamada "Carro" com os seguintes atributos: marca, modelo e ano de fabrico.
//        a. Crie um método na classe "Carro" chamado "ligar" que imprime a mensagem "O carro está
//        ligado".
//        b. Crie um objeto da classe "Carro" e invoque o método "ligar".

package EX05;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;


    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("\n...vrumi vrumi, o carro está ligadumi!");
    }


}
