package Viewer;

import Domain.Pista;

import java.io.IOException;

import static Viewer.Jogo_Viewer.prepararPiloto;
import static Viewer.Jogo_Viewer.readyRaceGo;
import Domain.Atrasos;
import Domain.Atrasos;
import Domain.Veiculo.Veiculo;
import Domain.Veiculo.Carro;
import Domain.Veiculo.Mota;
import Domain.Piloto;
import Domain.Pista;
import Domain.Enums.TipoCarro;
import Viewer.Main_Viewer;

public class Main_Viewer {
    public static void main(String[] args) throws IOException {

//            Pista volta1 = new Pista("pista001", 300, 285,1000, 1);
//            Pista volta2 = new Pista("pista001", 300, 285,2000, 2);
//            Pista volta3 = new Pista("pista001", 300, 285,3000, 3);
//            Pista volta4 = new Pista("pista001", 300, 285,4000, 4);
//            Pista volta5 = new Pista("pista001", 300, 285,5000, 5);
//
//        // FAZER INSTANCIAS DA CLASSE ATRASOS:
//         Atrasos curvaU = new Atrasos("curvaU", 5, 3);
//         Atrasos curvaS = new Atrasos("curvaS", 6, 4);
//         Atrasos gravilha = new Atrasos("gravilha", 4, 2);
//         Atrasos pedras = new Atrasos("pedras", 15, 5);


            readyRaceGo(prepararPiloto());


    }
}