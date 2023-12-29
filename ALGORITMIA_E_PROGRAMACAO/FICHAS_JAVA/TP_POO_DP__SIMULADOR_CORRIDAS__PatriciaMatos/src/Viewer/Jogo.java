package Viewer;
import Carro;
import Mota;
import Domain.Piloto;
import Domain.Veiculo.Veiculo;
import Domain.Enums.TipoCarro;

import java.util.Scanner;

public static class Jogo {

    public Jogo() {} //método construtor vazio

    /**
     * Método que permite criar um piloto através de feedback da consola (pode criar métodos auxiliares nas respetivas classes).
     */
    public static Piloto prepararPiloto() { //VITORIAS COMEÇAM A ZERO

        Scanner input = new Scanner(System.in);

        System.out.print("\nHEY, WHAT'S YOUR NAME? ");
        String nomePiloto = input.next();

        System.out.print("\nHOW HARD YOU WANT TO RACE?  [ B : BEGINNER  ||  P : PRO ]");
        String grauDificuldade = input.next();

        Veiculo veiculoAtual; //Declaro esta variavel objecto pois vai ser usada adiante, independentemente de o jogador escolher carro ou mota:

        int fichasCorrida;
        if (grauDificuldade.equals("B") || grauDificuldade.equals("b")) { //Despistar o "case sensitive" do input do utilizador
            fichasCorrida = 400000;
            System.out.println("YOU CURRENTLY HAVE " + fichasCorrida + " COINS!");
        }
        if (grauDificuldade.equalsIgnoreCase("P") || grauDificuldade.equalsIgnoreCase("p")) { //Despistar o "case sensitive" com uma função das Bibliotecas
            fichasCorrida = 50000;
            System.out.println("YOU CURRENTLY HAVE " + fichasCorrida + " COINS!");
        }


        System.out.print("\nWHAT'S YOUR KIND OF MACHINE?  [ C : CAR  ||  M : MOTORBIKE ]");
        String tipoVeiculo = input.next();


//        if (tipoVeiculo.equalsIgnoreCase("C") && grauDificuldade.equalsIgnoreCase("B")){
//            System.out.print("\nWHAT'S YOUR TYPE OF CAR?  [ F : F1 || R : RALLY || G : GT]");
//            String inputTipoCarro = input.next();
//            TipoCarro tipoCarro;
//            if (inputTipoCarro.equalsIgnoreCase("F")){tipoCarro = TipoCarro.F1;}
//            else if (inputTipoCarro.equalsIgnoreCase("R")){tipoCarro = TipoCarro.RALLY;}
//            else if (inputTipoCarro.equalsIgnoreCase("G")){tipoCarro = TipoCarro.GT;}
//            else if (inputTipoCarro.equalsIgnoreCase("C")){tipoCarro = TipoCarro.CARROCA;}
//        }

        Piloto piloto;
        if (tipoVeiculo.equalsIgnoreCase("C")) {
            // Criar uma instância da classe Carro de acordo com a escolha do jogador:

            Carro carroInicial1 = new Carro("Renault", "Megáne Totil", 200, 1300, 40, 50000, TipoCarro.GT);
            Carro carroInicial2 = new Carro("Nissan", "Qashqai Quase Lá", 300, 1500, 60, 60000, TipoCarro.GT);
            Carro carroInicial3 = new Carro("Cadillac", "LYRIQ LALALA", 500, 1000, 80, 180000, TipoCarro.GT);
            Carro carroInicial4 = new Carro("Ferrari", "269 GT Z DB", 800, 900, 100, 300000, TipoCarro.GT);

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
                        break;
                    case 2:
                        veiculoAtual = carroInicial2;
                        break;
                    case 3:
                        veiculoAtual = carroInicial3;
                        break;
                    case 4:
                        veiculoAtual = carroInicial4;
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("SELECT A VALID OPTION: [1] [2] [3] [4]");
                }
            } while (carroEscolhido != 0);


            if (tipoVeiculo.equalsIgnoreCase("M")) {
                // Criar uma instância da classe Mota de acordo com a escolha do jogador:
                //Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco);
                Mota motaInicial1 = new Mota("Zundapp", "Veneza Ruivo XP", 300, 350, 40, 20000);
                Mota motaInicial2 = new Mota("Honda", "PC MAC LOL", 400, 400, 60, 35000);
                Mota motaInicial3 = new Mota("BMW", "R GS GPT", 900, 500, 80, 60000);
                Mota motaInicial4 = new Mota("Ducatti", "Superlegerra V8 CO-PYLOT", 1200, 600, 100, 100000);

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
                            break;
                        case 2:
                            veiculoAtual = motaInicial2;
                            break;
                        case 3:
                            veiculoAtual = motaInicial3;
                            break;
                        case 4:
                            veiculoAtual = motaInicial4;
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("SELECT A VALID OPTION: [1] [2] [3] [4]");
                    }
                } while (motaEscolhida != 0);


                // Agora que temos um objecto veiculo instanciado, seja carro ou mota, estamos em condições de criar um objecto Piloto:

                int numVitorias = 0;  // Como estamos prestes a jogar, o atributo número de vitórias foi inicializado a 0.

                piloto = new Piloto(nomePiloto, fichasCorrida, veiculoAtual, numVitorias);
                return piloto;
            }
        }
    } //chaveta de fecho do método prepararPiloto


        /**
         * Método de “jogo”, ou seja, o percurso a percorrer pelo piloto.
         * @param piloto criado através de feedback da consola
         */
        public static void readyRaceGo (Piloto piloto){
            Scanner input = new Scanner(System.in);}


    //Vou abrir o método main, no qual vou invocar e executar as funções desenvolvidas na classe Jogo na consola:
//    public static void main (String[]Args){
            Scanner input = new Scanner(System.in);

            // Número total de vezes que a pista vai ser percorrida com a volta seguinte
            // É inicializada a 1 pois ao iniciar o jogo o piloto vai percorrer a pista uma primeira vez:
            int numPista = 1;
            int opcaoEscolhida;
            do {
                System.out.println("*****");
                System.out.print("\nWHAT DO YOU WANT TO DO? ");
                System.out.println("-----");
                System.out.println("1 > GO RACING!");
                System.out.println("2 > AQCUIRE A NEW VEHICLE");
                System.out.println("3 > SEE MY INVENTORY");
                System.out.println("0 > EXIT, CIAO");
                System.out.println("*****");

                System.out.println("SELECT AN OPTION: [1] [2] [3] [0]");
                opcaoEscolhida = input.nextInt();

                switch (opcaoEscolhida) {
                    case 1:
                        do {
                            switch (numPista) {
                                case 1:
                                    piloto.readyRaceGo();
                                    numPista++;
                                    break;

                                case 2:
                                    piloto.readyRaceGo();
                                    numPista++;
                                    break;

                                case 3:
                                    piloto.readyRaceGo();
                                    numPista++;
                                    break;

                                case 4:
                                    piloto.readyRaceGo();
                                    numPista++;
                                    break;

                                default:
                                    break;
                            }
                        } while (numPista<=4); //fecho do switch aninhado

                        break; // do case 1 do switch exterior


                    case 2: //Aquire new vehicle
                        break;

                    case 3: //Print inventory
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("SELECT A VALID OPTION: [1] [2] [3] [0]");
                        System.out.println("1 > GO TO THE NEXT RACE");
                        System.out.println("2 > AQCUIRE A NEW VEHICLE");
                        System.out.println("3 > PRINT YOUR INVENTARY");
                        System.out.println("0 > EXIT");

                } while (opcaoEscolhida != 0);

            }}

//    //Vou abrir o método main, no qual vou invocar e executar as funções desenvolvidas na classe Jogo na consola:
//                public static void main (String[]Args){

