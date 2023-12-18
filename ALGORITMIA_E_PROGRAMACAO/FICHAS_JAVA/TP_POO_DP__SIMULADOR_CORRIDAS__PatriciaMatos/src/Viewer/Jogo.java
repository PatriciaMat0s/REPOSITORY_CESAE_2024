package Viewer;
import Domain.Carro;
import Domain.Piloto;
import Domain.Veiculo;
import Domain.Enums.TipoCarro;

import java.sql.SQLOutput;
import java.util.Scanner;

public static class Jogo {

    public Jogo() {} //construtor vazio

    /**
     * Método que permite criar um piloto através de feedback da consola (pode criar métodos auxiliares nas respetivas classes).
     * @param nome, fichasCorrida, veiculoAtual, vitorias - atributos da Classe Piloto
     */
    public static Piloto prepararPiloto(){ //VITORIAS COMEÇAM A ZERO

        Scanner input = new Scanner(System.in);

        System.out.print("\nHEY, WHAT'S YOUR NAME? ");
        String nome = input.next();

        System.out.print("\nHOW HARD YOU WANT TO RACE?  [ B : BEGINNER  ||  P : PRO ]");
        String grauDificuldade = input.next();

        int fichasCorrida;
        if (grauDificuldade.equals("B") || grauDificuldade.equals("b")) { //Despistar o "case sensitive" do input do utilizador
            fichasCorrida = 10000;
            System.out.println("YOU CURRENTLY HAVE "+fichasCorrida+" COINS!");}
        if (grauDificuldade.equalsIgnoreCase("P") || grauDificuldade.equalsIgnoreCase("p")) { //Despistar o "case sensitive" com uma função das Bibliotecas
            fichasCorrida = 5000;
            System.out.println("YOU CURRENTLY HAVE "+fichasCorrida+" COINS!");
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

        if (tipoVeiculo.equalsIgnoreCase("C")){
            // Instanciar carros para apresentar ao jogador:
            // Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
            Carro carroInicial1 = new Carro("Renault", "Megáne",  200, 1300, 30,50000, TipoCarro.GT);
            Carro carroInicial2 = new Carro("Nissan", "Qashqai",  300, 1500, 60, 60000, TipoCarro.GT);
            Carro carroInicial3 = new Carro("Cadillac", "LYRIQ",  500, 1000, 80, 180000, TipoCarro.GT);
            Carro carroInicial4 = new Carro("Ferrari", "296 GTB",  800, 900, 100, 300000, TipoCarro.GT);

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
            System.out.println("");
            System.out.println("WHICH ONE IS YOURS? [1] [2] [3] [4]");
            

        }





//        Piloto piloto = new Piloto(nome, fichasCorrida, veiculoAtual, 0); // Como estamos prestes a jogar, o atributo número de vitórias foi inicializado a 0.
    Piloto piloto = new Piloto(nome, fichasCorrida, veiculoAtual, 0); // Como estamos prestes a jogar, o atributo número de vitórias foi inicializado a 0.



        String userType;
        System.out.print("\nYOUR VEHICLE OF CHOICE? ( C - CAR || M - MOTORBIKE ): ");
        String tipoVeiculo = input.next();
        System.out.print("\nPICK YOUR VEHICLE! ( C - CAR || M - MOTORBIKE ): ");
        userType = input.next();
    }

//    o seguir é também atribuído fichas de corrida à personagem, se a dificuldade for fácil tem direito a 2000
//    moedas de ouro, se for difícil apenas a 1500 moedas de ouro. (exemplo demonstrativo, pode alterar os
//    valores e ainda acrescentar outros graus de dificuldade).

    /**
     * Método que permite método de “jogo”, ou seja, o percurso a percorrer pelo piloto.
     * @param piloto criado através de feedback da consola
     */
    public static void rottenEgg(Piloto piloto){


}
}
