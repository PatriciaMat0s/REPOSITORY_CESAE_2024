//        Teste as classes instanciando um veículo de cada tipo.
//        Faça uma corrida entre dois carros e imprima os dados do vencedor.
//        Faça uma corrida entre uma mota e um camião e imprima os dados do vencedor.
//        Calcule o custo de uma viagem do carro (por exemplo para 150Km.).
//        Efetue uma viagem válida e outra inválida (excesso peso) para o camião


package EX02_preFACTORY_METHOD;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
        int menuVeiculos, tipoVeiculo;
        int ano, potencia, cilindrada, consumo, numPassageiros;
        String marca, modelo;

        do {
            System.out.println("\n*** ESCOLHA UMA OPÇÃO         : ");

            System.out.println("1 - criar um veículo a partir da consola");
            System.out.println("2 - calcular consumo");
            System.out.println("3 - fazer corrida com outro carro");
            System.out.println("4 - fazer corrida com uma mota");
            System.out.println("5 - fazer corrida com um camiao");
            System.out.println("6 - para o camiao, calcular custos de transporte de carga");
            System.out.println("7 - para a mota, imprimir imagem");
            System.out.println("0 - Sair");

            System.out.print("--- Indique o número da operação pretendida - 0 a 7: ");
            menuVeiculos = input.nextInt();

            switch (menuVeiculos) {
                case 1:
                    System.out.println("\n*** Escolha o tipo de veículo que pretende instanciar : ");
                    System.out.println("10 - criar um carro");
                    System.out.println("11 - criar uma mota");
                    System.out.println("12 - criar um camiao");
                    System.out.print("--- Indique o número da operação pretendida: 10 | 11 | 12 ");
                    tipoVeiculo = input.nextInt();

                    if (tipoVeiculo == 10) { //caso veiculo seja um CARRO ///////
                        System.out.println("Introduza a marca: ");
                        marca = input.next();
                        System.out.println("Introduza modelo: ");
                        modelo = input.next();
                        System.out.println("Introduza o ano de fabrico: ");
                        ano = input.nextInt();
                        System.out.print("Introduza a potência:  ");
                        potencia = input.nextInt();
                        System.out.print("Introduza a cilindrada:  ");
                        cilindrada = input.nextInt();

                        System.out.print("Insira o Tipo de Combustivel (GASOLINA, DIESEL, GPL): ");
                        String escolhaCombustivel = input.next();

                        TipodeCombustivel tipodeCombustivel = null;
                        switch (escolhaCombustivel) {
                            case "GASOLINA":
                                tipodeCombustivel = TipodeCombustivel.GASOLINA;
                                break;
                            case "DIESEL":
                                tipodeCombustivel = TipodeCombustivel.DIESEL;
                                break;
                            case "GPL":
                                tipodeCombustivel = TipodeCombustivel.GPL;
                                break;
                        }

                        System.out.print("Introduza o consumo:  ");
                        consumo = input.nextInt();
                        System.out.print("Introduza o mumero de passageiros que o carro pode transportar:  ");
                        numPassageiros = input.nextInt();

                        //Carro patricia = new Carro("Peugeot", "206", 2022, 110, 1200, TipodeCombustivel.DIESEL, 5, 2);
                        Carro meuCarro = new Carro(marca, modelo, ano, potencia, cilindrada, tipodeCombustivel, consumo, numPassageiros);
                        meuCarro.exibirDetalhes();}
                        break;

                    if (tipoVeiculo == 11) { //caso veiculo seja uma MOTA ///////
                        System.out.println("Introduza a marca: ");
                        marca = input.next();
                        System.out.println("Introduza modelo: ");
                        modelo = input.next();
                        System.out.println("Introduza o ano de fabrico: ");
                        ano = input.nextInt();
                        System.out.print("Introduza a potência:  ");
                        potencia = input.nextInt();
                        System.out.print("Introduza a cilindrada:  ");
                        cilindrada = input.nextInt();

                        System.out.print("Insira o Tipo de Combustivel (GASOLINA, DIESEL, GPL): ");
                        String escolhaCombustivel = input.next();

                        TipodeCombustivel tipodeCombustivel = null;
                        switch (escolhaCombustivel) {
                            case "GASOLINA":
                                tipodeCombustivel = TipodeCombustivel.GASOLINA;
                                break;
                            case "DIESEL":
                                tipodeCombustivel = TipodeCombustivel.DIESEL;
                                break;
                            case "GPL":
                                tipodeCombustivel = TipodeCombustivel.GPL;
                                break;
                        }

                        System.out.print("Introduza o consumo:  ");
                        consumo = input.nextInt();

                        //Mota minhaMota = new Mota("zundapp", "M50", 1980,500, 555, TipodeCombustivel.GASOLINA, 10);
                        Mota minhaMota = new Mota(marca, modelo, ano, potencia, cilindrada, tipodeCombustivel, consumo);
                        minhaMota.exibirDetalhes();}
                        break;

                        if (tipoVeiculo == 12) { //caso veiculo seja um CAMIAO ///////
                            System.out.println("Introduza a marca: ");
                            marca = input.next();
                            System.out.println("Introduza modelo: ");
                            modelo = input.next();
                            System.out.println("Introduza o ano de fabrico: ");
                            ano = input.nextInt();
                            System.out.print("Introduza a potência:  ");
                            potencia = input.nextInt();
                            System.out.print("Introduza a cilindrada:  ");
                            cilindrada = input.nextInt();

                            // Assumir que o camiao funcuona a diesel:
//                            System.out.print("Insira o Tipo de Combustivel (GASOLINA, DIESEL, GPL): ");
//                            String escolhaCombustivel = input.next();
//
//                            TipodeCombustivel tipodeCombustivel= null;
//                            switch (escolhaCombustivel){
//                                case "GASOLINA":
//                                    tipodeCombustivel=TipodeCombustivel.GASOLINA;
//                                    break;
//                                case "DIESEL":
//                                    tipodeCombustivel=TipodeCombustivel.DIESEL;
//                                    break;
//                                case "GPL":
//                                    tipodeCombustivel=TipodeCombustivel.GPL;
//                                    break;
//                            }

                            System.out.print("Introduza o consumo:  ");
                            consumo = input.nextInt();

                            System.out.print("Introduza a capacidade de carga:  ");
                            double capacidaCarga = input.nextInt();

                            //Camiao scania = new Camiao("Scania", "Truck", 1980, 500, 555, 19, 2000);
                            Camiao meuCamiao = new Camiao(marca, modelo, ano, potencia, cilindrada, consumo, capacidaCarga);
                        }

                case 2:  //calcular consumo
                    System.out.println("Que distância pretende percorrer na sua viagem (Km)?");
                   double distancia = input.nextDouble();
                   if (tipoVeiculo == 10){
                       System.out.println("Combustivel consumido: "+meuCarro.combustivelConsumido(distancia));
                   }
                    if (tipoVeiculo == 11){
                        System.out.println("Combustivel consumido: "+minhaMota.combustivelConsumido(distancia));
                    }
                    if (tipoVeiculo == 12){
                        System.out.println("Combustivel consumido: "+meuCamiao.combustivelConsumido(distancia));
                    }

                    break;

                case 3:
                    break;

                case 4:

                    break;

                case 5:
                    break;

                case 6:
                    break;

                            if (tipoVeiculo == 10 || tipoVeiculo ==11) {

                            }
                            if (tipoVeiculo == 12) { //pois o camiao tem carga que vai influenciar o consumo

                            }


                case 0:
                    break;

                default: //Aplicar caso o utilizador não introduza nenhum dos inteiros do menu apresentado
                    System.out.println("Opção inválida; introduza o número de uma opção válida.");
            }


        } while (menuVeiculos != 0);









        Carro joana = new Carro("Dacia", "Sandero", 2022, 110, 1200, TipodeCombustivel.GPL, 8, 5);

        Carro patricia = new Carro("Peugeot", "206", 2022, 110, 1200, TipodeCombustivel.DIESEL, 5, 2);

        Veiculo vencedor = joana.corrida(patricia);
        System.out.println("Vencedor da corrida:");
        if (vencedor != null){
            vencedor.exibirDetalhes();
        }else{
            System.out.println("EMPATE!");
        }

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

        //imprimir o txt da mota:
        zepedro.imprimirMota("Mota.txt");
        System.out.println("Custo da viagem de "+joana.getMarca()+ "-"+joana.getModelo()+": " +joana.calcularCusto(150)+"Euros.");

        //viagem valida do camiao:
        scania.viagem(200, 1000);

        //viagem invalida do camiao:
        scania.viagem(200, 3000);

    }
}
