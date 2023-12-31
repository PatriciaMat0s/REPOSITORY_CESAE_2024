package Domain;

public class Atrasos { //Momento no enunciado

    protected String nome;
   protected double atrasoPeso; //atraso devido ao efeito do peso do veiculo perante um obstaculo
   protected double atrasoPotencia; //atraso devido ao efeito do obstaculo na potencia do veiculo

    public Atrasos(String nome, double atrasoPeso, double atrasoPotencia) {
        this.nome = nome;
        this.atrasoPeso = atrasoPeso;
        this.atrasoPotencia = atrasoPotencia;
    }


    //    Estes atributos de atraso vão representar um atraso que o Veiculo irá sofrer no determinado momento da pista,
//    por exemplo, Curva em U, Curva em S, gravilha na pista, borracha na pista…
//    Alguns momentos vão favorecer Veículos mais leves, outros momentos vão favorecer veículos mais potentes.

    // FAZER INSTANCIAS DA CLASSE ATRASOS:
    // Atrasos curvaU = new Atrasos("curvaU", 5, 3);
    // Atrasos curvaS = new Atrasos("curvaS", 6, 4);
    // Atrasos gravilha = new Atrasos("gravilha", 4, 2);
    // Atrasos pedras = new Atrasos("pedras", 15, 5);

}
