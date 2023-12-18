package Domain;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int potenciaCV;
    protected double pesoKg;
    protected int desgaste;
    protected int preco;

    public Veiculo(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.pesoKg = pesoKg;
        this.desgaste = desgaste;
        this.preco = preco;
    }


    public void mostrarDetalhes(){
    System.out.println(this.marca + "\t| " +this.modelo);
    System.out.println("PotêncIa: "+this.potenciaCV+ " CVs" + "\t| " +"Peso: "+ this.pesoKg+ " Kg" + "\t| " +"Desgaste: "+this.desgaste);
    System.out.println("Preço: "+this.preco+" Euros");
    }
}
