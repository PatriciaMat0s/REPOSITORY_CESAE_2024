package Domain;

import java.util.ArrayList;

public class Pista {
  protected String nome;
  protected double tempo;
  protected double tempoRecordeSegundos;
  protected double distanciaVoltaMetros;
  protected int quantidadeVoltas;
  protected ArrayList<Atrasos> atrasosPista;

  //método construtor:
    public Pista(String nome, double tempo, double tempoRecordeSegundos, double distanciaVoltaMetros, int quantidadeVoltas) {
        this.nome = nome;
        this.tempo = tempo;
        this.tempoRecordeSegundos = tempoRecordeSegundos;
        this.distanciaVoltaMetros = distanciaVoltaMetros;
        this.quantidadeVoltas = quantidadeVoltas;
        this.atrasosPista = new ArrayList<>();
    }

    //Getters para usar nos métodos da classe Piloto:


    public String getNome() {
        return nome;
    }

    public double getTempo() {
        return tempo;
    }

    public double getTempoRecordeSegundos() {
        return tempoRecordeSegundos;
    }

    public double getDistanciaVoltaMetros() {
        return distanciaVoltaMetros;
    }

    public int getQuantidadeVoltas() {
        return quantidadeVoltas;
    }

    public ArrayList<Atrasos> getAtrasosPista() {
        return atrasosPista;
    }
}
