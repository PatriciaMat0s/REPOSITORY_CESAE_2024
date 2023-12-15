import java.util.ArrayList;

public class Mota extends Veiculo {

     protected ArrayList<Habilidade> habilidadesMota;
        // ArrayList<tipodadosAL> nomeAL = new ArrayList<>();
        // this.nomeAL = new ArrayList<>();


    public Mota(String marca, String modelo, int potenciaCV, double pesoKg, int desgaste, int preco) {
        super(marca, modelo, potenciaCV, pesoKg, desgaste, preco);
        this.habilidadesMota = new ArrayList<>();
    }

    @Override
    public void mostrarDetalhes() {

    }
}

