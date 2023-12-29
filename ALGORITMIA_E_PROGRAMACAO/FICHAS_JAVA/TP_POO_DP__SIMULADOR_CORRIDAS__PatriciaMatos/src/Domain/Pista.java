package Domain;

import java.util.ArrayList;

public class Pista {
  protected String nome;
  protected double tempo;
  protected double tempoRecordeSegundos;
  protected double distanciaVoltaMetros;
  protected int quantidadeVoltas;
  protected ArrayList<Atrasos> momentosPista;

    public Pista(String nome, double tempo, double tempoRecordeSegundos, double distanciaVoltaMetros, int quantidadeVoltas) {
        this.nome = nome;
        this.tempo = tempo;
        this.tempoRecordeSegundos = tempoRecordeSegundos;
        this.distanciaVoltaMetros = distanciaVoltaMetros;
        this.quantidadeVoltas = quantidadeVoltas;
        this.momentosPista = new ArrayList<>();
    }


}
