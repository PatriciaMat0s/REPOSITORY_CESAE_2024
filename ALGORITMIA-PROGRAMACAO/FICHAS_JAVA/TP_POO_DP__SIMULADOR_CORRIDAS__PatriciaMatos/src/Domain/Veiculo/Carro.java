package Domain.Veiculo;

import Domain.Enums.TipoCarro;
import Domain.ItemsCorrida.Modificacao;

import java.util.ArrayList;

public class Carro extends Veiculo {

    protected TipoCarro tipoCarro;
    protected ArrayList<Modificacao> modificacoesCarro; //"kitCorrida" no enunciado;
    // ArrayList<tipodadosAL> nomeAL = new ArrayList<>();
    // this.nomeAL = new ArrayList<>();


    public Carro(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco, TipoCarro tipoCarro) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.tipoCarro = tipoCarro;
        this.modificacoesCarro = new ArrayList<>();
    }

    public TipoCarro getTipoCarro() {
        return tipoCarro;
    }

    public ArrayList<Modificacao> getModificacoesCarro() {
        return modificacoesCarro;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tipo de Carro: " + this.tipoCarro);
    }
}
