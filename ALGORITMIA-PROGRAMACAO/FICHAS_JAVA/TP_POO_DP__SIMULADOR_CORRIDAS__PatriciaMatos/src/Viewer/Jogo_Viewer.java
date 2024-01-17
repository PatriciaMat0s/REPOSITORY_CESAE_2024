package Viewer;
import Controller.ItemsCorrida_Controller;
import Controller.Veiculos_Controller;
import Domain.Atrasos;
import Domain.ItemsCorrida.ItemsCorrida;
import Domain.Veiculo.Veiculo;
import Domain.Veiculo.Carro;
import Domain.Veiculo.Mota;
import Domain.Piloto;
import Domain.Pista;
import Domain.Enums.TipoCarro;
import Viewer.Main_Viewer;
import Domain.Oficina;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogo_Viewer {
    Scanner input = new Scanner(System.in);

    public Jogo_Viewer() {
    } //método construtor vazio


    /**
     * Método que permite criar um piloto através de feedback da consola (pode criar métodos auxiliares nas respetivas classes).
     */
    public static Piloto prepararPiloto() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nHEY, WHAT'S YOUR NAME? ");
        String nomePiloto = input.next();

        System.out.print("\nHOW HARD YOU WANT TO RACE?  [ B : BEGINNER  ||  P : PRO ] ");
        String grauDificuldade = input.next();

        Veiculo veiculoAtual = null; //Declaro esta variavel objecto pois vai ser usada adiante, independentemente de o jogador escolher carro ou mota

        int fichasCorrida = 0;
        if (grauDificuldade.equals("B") || grauDificuldade.equals("b")) { //Despistar o "case sensitive" do input do utilizador
            fichasCorrida = 400000;
            System.out.println("BEGINNER: YOU CURRENTLY HAVE " + fichasCorrida + " COINS!");
        }

        if (grauDificuldade.equalsIgnoreCase("P") || grauDificuldade.equalsIgnoreCase("p")) { //Despistar o "case sensitive" com uma função das Bibliotecas
            fichasCorrida = 150000;
            System.out.println("PRO: YOU CURRENTLY HAVE " + fichasCorrida + " COINS!");
        }

        System.out.print("\nWHAT'S YOUR KIND OF MACHINE?  [ C : CAR  ||  M : MOTORBIKE ] ");
        String tipoVeiculo = input.next();

        Piloto piloto;

        //CASO SEJA ESCOLHIDO O CARRO:
        if (tipoVeiculo.equalsIgnoreCase("C")) {
            // Criar 4 instâncias da classe Carro de acordo com a escolha do jogador:

            Carro carroInicial1 = new Carro("Renault", "Megáne Totil", 200, 1300, 40, 50000, TipoCarro.GT);
            Carro carroInicial2 = new Carro("Nissan", "Qashqai Quase Lá", 300, 1500, 60, 60000, TipoCarro.GT);
            Carro carroInicial3 = new Carro("Cadillac", "LYRIQ LALALA", 500, 1000, 80, 100000, TipoCarro.GT);
            Carro carroInicial4 = new Carro("Ferrari", "269 GT Z DB", 800, 900, 100, 150000, TipoCarro.GT);

            int carroEscolhido;
            do {
                System.out.println("CAR #1:");
                carroInicial1.mostrarDetalhes();
                System.out.println("*****");

                System.out.println("CAR #2:");
                carroInicial2.mostrarDetalhes();
                System.out.println("*****");

                System.out.println("CAR #3:");
                carroInicial3.mostrarDetalhes();
                System.out.println("*****");

                System.out.println("CAR #4:");
                carroInicial4.mostrarDetalhes();
                System.out.println("*****");

                System.out.println("0 - Sair");
                System.out.println("");
                System.out.println("WHICH CAR IS YOURS? [1] [2] [3] [4]");
                carroEscolhido = input.nextInt();

                switch (carroEscolhido) {
                    case 1:
                        veiculoAtual = carroInicial1;
                        fichasCorrida = fichasCorrida - 50000;
                        break;
                    case 2:
                        veiculoAtual = carroInicial2;
                        fichasCorrida = fichasCorrida - 60000;
                        break;
                    case 3:
                        veiculoAtual = carroInicial3;
                        fichasCorrida = fichasCorrida - 100000;
                        break;
                    case 4:
                        veiculoAtual = carroInicial4;
                        fichasCorrida = fichasCorrida - 150000;
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("SELECT A VALID OPTION: [1] [2] [3] [4] [0]");
                }
            } while (carroEscolhido != 0);
        }//FECHO IF CARRO

        // CASO SEJA ESCOLHIDA A MOTA:
        if (tipoVeiculo.equalsIgnoreCase("M")) {
                // Criar 4 instâncias da classe Mota de acordo com a escolha do jogador:
                //Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco);
                Mota motaInicial1 = new Mota("Zundapp", "Veneza Ruivo XP", 300, 350, 40, 20000);
                Mota motaInicial2 = new Mota("Honda", "PC MAC LOL", 400, 400, 60, 35000);
                Mota motaInicial3 = new Mota("BMW", "R GS GPT", 900, 500, 80, 90000);
                Mota motaInicial4 = new Mota("Ducatti", "Super Reloaded CO-PILOT", 1200, 600, 100, 140000);

                int motaEscolhida;
                do {
                    System.out.println("MOTORBIKE #1:");
                    motaInicial1.mostrarDetalhes();
                    System.out.println("*****");

                    System.out.println("MOTORBIKE #2:");
                    motaInicial2.mostrarDetalhes();
                    System.out.println("*****");

                    System.out.println("MOTORBIKE #3:");
                    motaInicial3.mostrarDetalhes();
                    System.out.println("*****");

                    System.out.println("MOTORBIKE #4:");
                    motaInicial4.mostrarDetalhes();
                    System.out.println("*****");

                    System.out.println("0 - Sair");
                    System.out.println("");
                    System.out.println("WHICH MOTORBIKE IS YOURS? [1] [2] [3] [4]");
                    motaEscolhida = input.nextInt();

                    switch (motaEscolhida) {
                        case 1:
                            veiculoAtual = motaInicial1;
                            fichasCorrida = fichasCorrida - 20000;
                            break;
                        case 2:
                            veiculoAtual = motaInicial2;
                            fichasCorrida = fichasCorrida - 35000;
                            break;
                        case 3:
                            veiculoAtual = motaInicial3;
                            fichasCorrida = fichasCorrida - 90000;
                            break;
                        case 4:
                            veiculoAtual = motaInicial4;
                            fichasCorrida = fichasCorrida - 140000;
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SELECT A VALID OPTION: [1] [2] [3] [4] [0]");
                    }
                } while (motaEscolhida != 0);
        } //FECHO IF MOTA

                // Agora que temos um objecto veiculo instanciado, seja carro ou mota, estamos em condições de criar um objecto Piloto:

                int numVitorias = 0;  // Como estamos prestes a jogar, o atributo número de vitórias foi inicializado a 0.

                piloto = new Piloto(nomePiloto, fichasCorrida, veiculoAtual, numVitorias);
                return piloto;

    } //chaveta de fecho do método prepararPiloto




    /**
     * Método de “jogo”, ou seja, o percurso a percorrer pelo piloto.
     * @param piloto criado através de feedback da consola
     */
    public static void readyRaceGo(Piloto piloto) throws FileNotFoundException {

        ItemsCorrida_Controller itenscontrollerObj = new ItemsCorrida_Controller();
        //ArrayList<ItemsCorrida> arrayItems = itenscontrollerObj.getListaItems();
        //Tenho o array de items (lidos do ficheiro)

        Veiculos_Controller veiculoscontrollerObj = new Veiculos_Controller();
        //ArrayList<Veiculo> arrayVeiculos = veiculoscontrollerObj.getListaVeiculos();
        //Tenho o array de veiculos (lidos do ficheiro)

        // Declarar e inicializar o veiculo actual do piloto!
        Veiculo veiculoAtual = piloto.getVeiculoAtual();
        Scanner input = new Scanner(System.in);


        //Instanciar os 12 veiculos adversarios:

        Carro adversaryCar1 = new Carro("Renaulto", "Mago,ne Vais Perder", 200, 1300, 40, 50000, TipoCarro.GT);
        Carro adversaryCar2 = new Carro("Citronello", "Vais Pó-C", 100, 1900, 40, 50000, TipoCarro.GT);
        Carro adversaryCar3 = new Carro("BMW", "XYZ", 170, 1900, 140, 50000, TipoCarro.GT);
        Carro adversaryCar4 = new Carro("Jeep", "Tirenme Daki", 170, 1900, 140, 50000, TipoCarro.GT);
        Carro adversaryCar5 = new Carro("Chevrolet", "ilikeChevre 250", 250, 1900, 20, 80000, TipoCarro.GT);
        Carro adversaryCar6 = new Carro("Peugeot", "Super Comercial", 270, 1900, 50, 80000, TipoCarro.GT);

        Mota adversaryMoto1 = new Mota("Zundappum", "Vaiste-F", 300, 350, 40, 20000);
        Mota adversaryMoto2 = new Mota("Yamaha", "hahahah", 300, 150, 40, 28000);
        Mota adversaryMoto3 = new Mota("MotaPT", "Feita em Portugal", 200, 350, 40, 70000);
        Mota adversaryMoto4 = new Mota("MotaPT-CH", "Fabricada na China", 300, 350, 40, 40000);
        Mota adversaryMoto5 = new Mota("Hyundai", "Ganhessamerd*", 300, 500, 40, 90000);
        Mota adversaryMoto6 = new Mota("Fastrax", "Carbono Red", 420, 390, 40, 200000);

        //Adicionar os veiculos a uma instancia da classe Oficina:
        Oficina oficinax = new Oficina();
        oficinax.getGaragem().add(adversaryCar1);
        oficinax.getGaragem().add(adversaryCar2);
        oficinax.getGaragem().add(adversaryCar3);
        oficinax.getGaragem().add(adversaryCar4);
        oficinax.getGaragem().add(adversaryCar5);
        oficinax.getGaragem().add(adversaryCar6);
        oficinax.getGaragem().add(adversaryMoto1);
        oficinax.getGaragem().add(adversaryMoto2);
        oficinax.getGaragem().add(adversaryMoto3);
        oficinax.getGaragem().add(adversaryMoto4);
        oficinax.getGaragem().add(adversaryMoto5);
        oficinax.getGaragem().add(adversaryMoto6);

        //Falta fazer o mesmo para os items


        //INSTANCIAR AS PISTAS:
        Pista pista1 = new Pista("pista001", 300, 285,1000, 1);
        Pista pista2 = new Pista("pista002", 300, 285,2000, 2);
        Pista pista3 = new Pista("pista003", 300, 285,3000, 3);
        Pista pista4 = new Pista("pista004", 300, 285,4000, 4);
        Pista pista5 = new Pista("pista005", 300, 285,5000, 5);

        //INSTANCIAR OS MOMENTOS (OU ATRASOS, MUDEI PARA UM NOME MAIS AUTO-EXPLICATIVO):
        Atrasos curvaU = new Atrasos("curvaU", 5, 3);
        Atrasos curvaS = new Atrasos("curvaS", 6, 4);
        Atrasos gravilha = new Atrasos("gravilha", 4, 2);
        Atrasos pedras = new Atrasos("pedras", 15, 5);

        //ADICIONAR OS ATRASOS AO ARRAY DE ATRASOS NA CLASSE PISTA, a atrasos a cada pista:
        (pista1.getAtrasosPista()).add(curvaU);
        (pista1.getAtrasosPista()).add(curvaS);
        (pista2.getAtrasosPista()).add(gravilha);
        (pista2.getAtrasosPista()).add(pedras);
        (pista3.getAtrasosPista()).add(curvaS);
        (pista3.getAtrasosPista()).add(gravilha);
        (pista4.getAtrasosPista()).add(curvaU);
        (pista4.getAtrasosPista()).add(gravilha);
        (pista5.getAtrasosPista()).add(curvaS);
        (pista5.getAtrasosPista()).add(pedras);

        // Número total de vezes que a pista vai ser percorrida com a volta seguinte
        // É inicializada a 1 pois o piloto vai percorrer a pista uma primeira vez:
        int numPista = 1;
        int opcaoEscolhida;
        do {
            // Infelizmente deu erro, os dots não são reconhecidos...
//            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣤⣄⣄⣀⣀⣀");⠀⠀⠀⠀⠀⠀⠀⠀
//            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⠊⠉⠉⠉⠉⠉⣩⡷⠋⠉⠹⡛⢽⠢⣀⣀⡀");⠀⠀
//            System.out.println("⢀⣀⣤⣴⠶⣾⣿⡿⠯⠯⣍⣙⣒⣲⠶⠶⠶⡿⢴⠧⠷⠒⣿⣏⠡⡤⠤⠯⡆");⠀
//            System.out.println("⣿⣶⣒⡒⠛⠽⢯⣥⣶⣯⠭⡵⢊⣩⣭⣲⡂⡗⠈⠉⠉⠉⠉⡇⣼⣷⣿⣧⡇");⠀
//            System.out.println("⣮⣍⣛⡛⠛⠛⠛⠛⠛⠘⡾⣴⣿⣿⣿⣿⣧⡇⠀⠀⠀⢀⣰⣠⡽⣿⣿⠟");⠀⠀
//            System.out.println("⠾⠿⣶⣦⣭⣍⣹⣷⡄⡸⣹⣿⡿⣿⣻⣿⡿⠷⠶⠟⠛⠛⠉⠉⠓⠻⠟");⠀⠀⠀
//            System.out.println("⠀⠀⠀⠉⠉⠁⠉⠛⠛⠛⠳⠿⢿⡿⠟");⠀

            // Lá ficou um carrinho mais rudimentar:
            System.out.println("                    -|--[-----]--|-");
            System.out.println("                <|   O0O_______O0O   |>");
            System.out.println("              *|______|__|RRG|__|______|*");
            System.out.println("               |{____}|         |{____}|");
            System.out.println("--- ******  * -------------*------------- *  ****** ---");
            System.out.println("************ --  * READY? RACE: GO!!! *  -- ************");
            System.out.println("--- ******  * -------------*------------- *  ****** ---");
            System.out.println("(And code it as if ur life depended on it... because it does!)");
            System.out.println("");
            System.out.println("**-*-**");
            System.out.print("\nWHAT DO YOU WANT TO DO NOW? ");
            System.out.println("-----");
            System.out.println("1 > GO TO THE NEXT RACE!");
            System.out.println("2 > GO SHOPPING: VEHICLES!");
            System.out.println("3 > GO SHOPPING: RACE ITEMS!");
            System.out.println("4 > SELECT ITEM FROM MY INVENTORY!");
            System.out.println("SELECT A VALID OPTION: [1] [2] [3] [4] [0]");
            System.out.println("**-*-**");

            System.out.println("SELECT AN OPTION: [1] [2] [3] [0]");
            opcaoEscolhida = input.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("GET READY TO RACE!");
                    do {
                        switch (numPista) {
                            case 1: //Primeira volta
                                piloto.corrida(pista1);
                                double tempoP1 = piloto.corrida(pista1);
                                numPista++;
                                System.out.println("*/5 STARTING RIDE #" + numPista);

                                //Atribuir fichas ao piloto no final de cada pista
                                double tempoRecorde = 180; //na 1a volta vamos supor que o tempo recorde é 180segundos
                                if (tempoP1 > tempoRecorde){
                                    piloto.setFichasCorrida(2000); //mini bonus de 1a volta
                                } else{
                                    piloto.setFichasCorrida(1000); //mini meio bonus
                                }

                                break;


                            case 2: //Segunda volta
                                piloto.corrida(pista2);
                                double tempoP2 = piloto.corrida(pista2);
                                double tempoP1x = piloto.corrida(pista2);
                                numPista++;
                                System.out.println("**/5 STARTING RIDE #" + numPista);

                                if (tempoP2 < tempoP1x){ //Ou seja, o piloto bateu o recorde pessoal
                                    piloto.setFichasCorrida(20000);
                                } else{
                                    piloto.setFichasCorrida(10000);
                                }

                                break;

                            case 3:
                                piloto.corrida(pista3);
                                double tempoP3 = piloto.corrida(pista3);
                                double tempoP2z = piloto.corrida(pista2);
                                double tempoP1z = piloto.corrida(pista1);
                                numPista++;
                                System.out.println("***/5 STARTING RIDE #" + numPista);

                                if ((tempoP3 < tempoP2z) && (tempoP3 < tempoP1z)){ //Ou seja, o piloto bateu o recorde pessoal
                                    piloto.setFichasCorrida(30000);
                                } else{
                                    piloto.setFichasCorrida(15000);
                                }

                                break;

                            case 4:
                                piloto.corrida(pista4);
                                double tempoP4 = piloto.corrida(pista4);
                                double tempoP3a = piloto.corrida(pista3);
                                double tempoP2a = piloto.corrida(pista2);
                                double tempoP1a = piloto.corrida(pista1);

                                numPista++;
                                System.out.println("****/5 STARTING RIDE #" + numPista);

                                if ((tempoP4 < tempoP3a) && (tempoP4 < tempoP2a) && (tempoP4 < tempoP1a)){ //Ou seja, o piloto bateu o recorde pessoal
                                    piloto.setFichasCorrida(30000);
                                } else{
                                    piloto.setFichasCorrida(15000);
                                }
                                break;

                            case 5:
                                piloto.corrida(pista5);
                                double tempoP5 = piloto.corrida(pista5);
                                double tempoP4b = piloto.corrida(pista4);
                                double tempoP3b = piloto.corrida(pista3);
                                double tempoP2b = piloto.corrida(pista2);
                                double tempoP1b = piloto.corrida(pista1);

                                numPista++;
                                System.out.println("*****/5 STARTING RIDE #" + numPista + " : THE BOSS RIDE YAAAY!");

                                if ((tempoP5 < tempoP4b) && (tempoP5 < tempoP3b) && (tempoP5 > tempoP2b) && (tempoP5 < tempoP1b)){
                                    //Ou seja, o piloto bateu o recorde pessoal derradeiro, logo, ganhou o jogo!
                                System.out.println("!!!RECORD BEATEN!!! ***** !!!YOU WON!!! ***** !!!CONGRATULATIONS!!!");
                                piloto.setFichasCorrida(60000); //bõnus de vencedor!
                            } else{
                                piloto.setFichasCorrida(15000);
                            }

                                //NOTA!!!!!!
                                // Para determinar o vencedor teria de ter calculado os tempos de corrida (com a funçao corrida) para cada um dos veiculos adversarios ao longo das pistas e da eventual applicaçao de items de corrida a estes. Seriam estes tempos que compararia com o do piloto/jogador
                                //Por motivos de simplificaçao, baseei a métrica para apurar um vencedor no bater do recorde pessoal na última pista
                                break;


                            default:
                                break;
                        }
                        // O enunciado diz-nos que o jogo fica completo ao fim de 5 voltas na pista, logo este switch vai ser executado até o jpgador as 5 voltas:
                    } while (numPista <= 5); //fecho do switch aninhado

                    break; // do case 1 do switch exterior


                case 2: //Acquire new vehicle
                    int numVeiculoEscolhido;
                    veiculoscontrollerObj.imprimirGaragem();
                    System.out.println("SELECT NUMBER OF DESIRED VEHICLE:");
                    numVeiculoEscolhido = input.nextInt();

                    veiculoscontrollerObj.comprarVeiculo(piloto, numVeiculoEscolhido);
                    System.out.println("NICE, THIS ONE IS NOW YOURS:");
                    veiculoAtual.mostrarDetalhes();
                    break;

                case 3: //Comprar Item
                    int numItemEscolhido;
                    itenscontrollerObj.imprimirStockItems();
                    System.out.println("SELECT NUMBER OF DESIRED ITEM:");
                    numItemEscolhido = input.nextInt();

                    itenscontrollerObj.comprarItemCorrida(piloto,numItemEscolhido);
                    break;

                case 4: //Print inventory Items e aplicar os items ao veiculo
                    itenscontrollerObj.usarItemCorrida(piloto);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("SELECT A VALID OPTION: [1] [2] [3] [4] [0]");
                    System.out.println("1 > GO TO THE NEXT RACE");
                    System.out.println("2 > GO SHOPPING VEHICLES!");
                    System.out.println("3 > GO SHOPPING RACE ITEMS!");
                    System.out.println("4 > SELECT FROM MY RACE ITEMS INVENTORY");
                    System.out.println("0 > EXIT, BYE");
                    break;
            } //fecho switch de fora

        } while (opcaoEscolhida != 0); //fecho DO (while) de fora
    } //fecho funcao readyracego


} //fecho classe JOGO



