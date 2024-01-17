package EX02;

public class Carro extends Veiculo {

    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipodeCombustivel tipodeCombustivel, double consumo, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipodeCombustivel, consumo);
        this.quantidadePassageiros = quantidadePassageiros;
    }

public double calcularCusto(double distancia) {
        double gasolina = 2.1, diesel = 1.95, gpl = 1.15, eletrico = 0.12; //melhor que

        double valorViagem = 0;
        double litrosConsumidos = this.combustivelConsumido(distancia);

        switch (this.tipodeCombustivel) {
            case GASOLINA:
                valorViagem = litrosConsumidos * gasolina;
                break;

            case DIESEL:
                valorViagem = litrosConsumidos * diesel;
                break;

            case GPL:
                valorViagem = litrosConsumidos * gpl;
                break;

            case ELECTRICO:
                valorViagem = litrosConsumidos * eletrico;
                break;
        }

        return valorViagem;
    }

    //Quando o metodo que herdamos nao é = ao original e precisamos de acrescentar linhas
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Nº Passageiros: " + this.quantidadePassageiros);
    }


}

