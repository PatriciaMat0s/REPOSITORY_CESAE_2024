//e. Teste a classe instanciando dois carros ao seu gosto e faça uma corrida entre os dois, imprima o
//        vencedor. Seguidamente, calcule quanto é que os dois carros iam gastar numa viagem de 97km. E
//        imprima na consola quanto gastaria cada um, e qual dos dois é que ia gastar mais
//

package EX01_redo;

import EX01.TipoCombustivel;

public class Main {

    public static void main(String[] args) {


    Carro patricia = new Carro("Peugeot", "206", 2014, 170, 2400, TipoCombustivel.DIESEL, 5);

    Carro joana = new Carro("Dacia", "Sundero", 2022, 110, 1800, TipoCombustivel.GPL, 8);

    Carro vitors = new Carro("Datsun", "1200", 1970, 50, 1200, TipoCombustivel.GASOLINA, 25);


        patricia.ligar();
        patricia.exibirDetalhes();
        System.out.println("");
        joana.ligar();
        joana.exibirDetalhes();
        System.out.println("");
        vitors.ligar();
        vitors.exibirDetalhes();

        System.out.println("");

//        Carro vencedor1;
//        Carro vencedorFinal;
          Carro vencedor1=patricia.corrida(joana);
          Carro vencedorFinal=vencedor1.corrida(vitors);

        System.out.println("\nVENCEDOR:");
        vencedorFinal.exibirDetalhes();

        System.out.println("\nVIAGEM:");
        double litros = joana.combustivelConsumido(97);
        System.out.println("Combustivel gasto por "+joana.getMarca()+"-"+joana.getModelo()+": "+litros+" litros.");
        double litros2 = patricia.combustivelConsumido(97);
        System.out.println("Combustivel gasto por "+patricia.getMarca()+"-"+patricia.getModelo()+": "+litros2+" litros.");

        if (litros > litros2){
            System.out.println("\n» O veículo "+joana.getMarca()+"-"+joana.getModelo()+" gastou mais "+(litros-litros2)+" litros que "+patricia.getMarca()+"-"+patricia.getModelo()+".");}
        if (litros2 > litros){
            System.out.println("\n» O veículo "+patricia.getMarca()+"-"+patricia.getModelo()+" gastou mais "+(litros2-litros)+" litros que "+joana.getMarca()+"-"+joana.getModelo()+".");}

    }
}