
package EX01_redo;

import EX01.TipoCombustivel;

public class Carro {

    //atributos da classe:
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumo;

    //  metodo construtor:
    public Carro(String marca, String modelo, int ano, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void ligar() {
        if (2023-this.ano > 30){
            if (this.tipoCombustivel == TipoCombustivel.DIESEL) {
                System.out.println("“Deita um pouco de fumo… Custa a pegar… O carro está ligado!”\nVrum-vrum-vrum");
            }else{
                System.out.println("“Custa a pegar… O carro está ligado!”\nVrum-vrum-vrum”");
            }
        }

        if (2023-this.ano <= 30){
            if (this.potencia < 250) {
                System.out.println("“O carro está ligado!”\nVruummmmmmm”");
            }else{
                System.out.println("“O carro está ligado!VRUUMMMMMM");
            }
        }
    }

    public Carro corrida(Carro carroAdversario) {
        if (this.potencia > carroAdversario.potencia) {
            return this;}
        if (this.potencia < carroAdversario.potencia) {
            return carroAdversario;
        }else{
            if (this.cilindrada > carroAdversario.cilindrada){
                return this;}
            if (this.cilindrada < carroAdversario.cilindrada){
                return carroAdversario;
            }else{
                if (this.ano > carroAdversario.ano){
                    return this;}
                if (this.ano < carroAdversario.ano){
                    return carroAdversario;}
                else{
                    return null;
                }
            }
        }
    }

    public double combustivelConsumido(double distancia){

        //100km ----- this.litros
        //distancia (parametro)------ return x litros
        //x = (453x6) / 100 litros

        double litrosConsumidos;
        litrosConsumidos = (distancia*this.consumo)/100;
        return litrosConsumidos;
    }

    public void exibirDetalhes(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.println("Potencia: "+ this.potencia+ " cv.");
        System.out.println("Cilindrada: "+this.cilindrada+" cc.");
    }




} //fecho classe EX01


