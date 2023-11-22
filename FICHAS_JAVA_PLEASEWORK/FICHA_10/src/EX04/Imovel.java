
//4. Crie uma classe Imóvel, que tenha como atributos: rua, número da porta, cidade, tipo (apartamento, casa, mansão), acabamento (para restauro, usada, nova, nova com alto acabamento), área, número de quartos, número de casas de banho e área da piscina.


//        b. Crie um método para mudar o estado de uma casa.
//        c. Crie um método chamado imprimirDescricao que imprima as especificações do imóvel.
//        d. Crie um método chamado compararImoveis, que receba outro imóvel como parâmetro e retorne qual o imóvel mais caro

package EX04;

public class Imovel {

    private String rua;
    private String numeroPorto;
    private String cidade;

    private Tipologia tipologia;

    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numWC;
    private double areaPiscina;


    public Imovel(String rua, String numeroPorto, String cidade, Tipologia tipologia, Acabamento acabamento, double area, int numQuartos, int númWC, double areaPiscina) {
        this.rua = rua;
        this.numeroPorto = numeroPorto;
        this.cidade = cidade;
        this.tipologia = tipologia;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numWC = numWC;
        this.areaPiscina = areaPiscina;
    }

    //        a. Crie um método para calcular o valor do imóvel com base nas seguintes regras:
//        i. Apartamento: cada m2 vale 1000€.
//        ii. Casa: cada m2 vale 3000€
//        iii. Mansão: cada m2 vale 5000€
//        iv. Para Restauro: preço total tem 50% de desconto
//        v. Usada: preço total tem 10% de desconto
//        vi. Nova: preço reflete sem desconto
//        vii. Nova com alto acabamento: preço total valoriza 25%
//        viii. Cada quarto incrementa 7500€ ao custo
//        ix. Cada casa de banho incrementa 10500€ ao custo
//        x. A piscina custa 1000/m2

public double calcularValorImovel(){

        double valorImovel=0;

        if (this.tipologia==Tipologia.apartamento){
            valorImovel = 1000*this.area;}





}

