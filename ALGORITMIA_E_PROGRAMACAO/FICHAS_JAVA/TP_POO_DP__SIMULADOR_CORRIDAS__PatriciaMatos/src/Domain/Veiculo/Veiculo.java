package Domain.Veiculo;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int potenciaCV;
    protected double pesoKg;
    protected int desgaste;
    protected int preco; ////Nao confundir o atributo "preço", o custo do veiculo, com o atributo "fichas de corrida" da classe Piloto, que representa o crédito de que este dispõe

    public Veiculo(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.pesoKg = pesoKg;
        this.desgaste = desgaste;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public int getDesgaste() {
        return desgaste;
    }

    public int getPreco() {
        return preco;
    }

    public void mostrarDetalhes(){
    System.out.println(this.marca + "\t| " +this.modelo);
    System.out.println("HORSEPOWER: "+this.potenciaCV+ " CVs" + "\t| " +"WEIGHT: "+ this.pesoKg+ " Kg" + "\t| WEAR: "+this.desgaste);
    System.out.println("PRICE (RACE COINS): "+this.preco);
    }
}
