//        Teste as classes instanciando um veículo de cada tipo.
//        Faça uma corrida entre dois carros e imprima os dados do vencedor.
//        Faça uma corrida entre uma mota e um camião e imprima os dados do vencedor.
//        Calcule o custo de uma viagem do carro (por exemplo para 150Km.).
//        Efetue uma viagem válida e outra inválida (excesso peso) para o camião


package EX02;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Carro joana = new Carro("Dacia", "sandero", 2022, 110, 1200, TipodeCombustivel.GPL, 8, 5);

        Carro patricia = new Carro("Peugeot", "206", 2014, 150, 900, TipodeCombustivel.DIESEL, 5, 2);

        Veiculo vencedor = joana.corrida(patricia);
        System.out.println("Vencdedor da corrida:");
        vencedor.exibirDetalhes();


        Mota zepedro = new Mota("zundapp", "M50", 1980,500, 555, TipodeCombustivel.GASOLINA, 10);

        Camiao scania = new Camiao("Scania", "Truck", 1980, 500, 555, 19, 2000);


        System.out.println("");
        Veiculo vencedor2 = zepedro.corrida(scania);
        System.out.println("Vencedor da corrida:");

        if (vencedor2 != null){
            vencedor2.exibirDetalhes();
        }else{
            System.out.println("EMPATE!");
        }

    }
}
