package EX02;

public class Camiao extends Veiculo{
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, double consumo, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, TipodeCombustivel.DIESEL, consumo);
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean viagem(double distancia, double cargaAtual){
        if (cargaAtual > this.capacidadeCarga){
            System.out.println("A carga excede a capacidade de carga do camiao");
            return false;

        }else{
            //passo 1 - calcular consumo total:
            double diesel = 1.95;
            double consumoTotal=0; double litrosConsumidos; double custoViagem;
            consumoTotal += this.getConsumo()+cargaAtual * .1 / 100;

            //passo 2 - calcular quantos litros foram consumidos:
            litrosConsumidos = distancia * this.getConsumo() / 100;

            //passo 3 - calcular o dinheiro gasto
            custoViagem = litrosConsumidos * diesel;

            System.out.println("Foram consumidos "+litrosConsumidos+" litros de diesel pelo camiao, e a viagem teve um custo de "+custoViagem+" Euros.");
            return true;


        }
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Nº Passageiros: " + this.capacidadeCarga);
    }
}
