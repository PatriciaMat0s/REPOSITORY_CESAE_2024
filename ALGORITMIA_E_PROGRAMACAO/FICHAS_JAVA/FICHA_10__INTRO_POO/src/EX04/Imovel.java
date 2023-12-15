//      4. Crie uma classe Imóvel, que tenha como atributos: rua, número da porta, cidade, tipo (apartamento, casa,
//        mansão), acabamento (para restauro, usada, nova, nova com alto acabamento), área, número de quartos,
//        número de casas de banho e área da piscina.

package EX04;

public class Imovel {
    private String rua;
    private String numPorta;
    private String cidade;
    private TipoImovel tipoImovel;
    private Acabamento acabamento;
    private double area;
    private int numQuartos;
    private int numWCs;
    private double areaPiscina;

    public Imovel(String rua, String numPorta, String cidade, TipoImovel tipoImovel, Acabamento acabamento, double area, int numQuartos, int numWCs, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numWCs = numWCs;
        this.areaPiscina = areaPiscina;
    }
    //    a. Crie um método para calcular o valor do imóvel com base nas seguintes regras:
//        i. Apartamento: cada m2 vale 1000€.
//        ii. Casa: cada m2 vale 3000€
//        iii. Mansão: cada m2 vale 5000€
//        iv. Para Restauro: preço total tem 50% de desconto
//        v. Usada: preço total tem 10% de desconto
//        vi. Nova: preço reflete sem desconto
//        vii. Nova com alto acabamento: preço total valoriza 25%


    public double calcularValorImovel() {

        // Calculo custo em funçao do tipo Imovel:
        double custo_i = 0, custo_ii=0, custo_iii, custoTotal;
        if (this.tipoImovel == TipoImovel.APARTAMENTO) {
            custo_i += this.area * 1000;
        }
        if (this.tipoImovel == TipoImovel.CASA) {
            custo_i += this.area * 3000;
        }
        if (this.tipoImovel == TipoImovel.MANSAO) {
            custo_i += this.area * 5000;
        }

        // Calculo custo em funçao do acabamento:
        if (this.acabamento.equals(Acabamento.PARA_RESTAURO)) {
            custo_ii = custo_i * .5;
        }
        if (this.acabamento.equals(Acabamento.USADA)) {
            custo_ii = custo_i * .9;
        }
        if (this.acabamento.equals(Acabamento.NOVA)) {
            custo_ii = custo_i;
        }
        if (this.acabamento.equals(Acabamento.NOVA_COM_ALTO_ACABAMENTO)) {
            custo_ii = custo_i * 1.25;
        }

        //viii. Cada quarto incrementa 7500€ ao custo
        // ix. Cada casa de banho incrementa 10500€ ao custo
        //x. A piscina custa 1000/m2
        custo_iii = this.numQuartos * 7500 + this.numWCs * 10500 + this.areaPiscina * 1000;

        custoTotal = custo_i + custo_ii + custo_iii;
        return custoTotal;
    }

    //b. Crie um método para mudar o estado de uma casa.
        public void mudarAcabamento(Acabamento novoAcabamento){
            System.out.println("Estado anterior do imovel: "+this.acabamento);
        this.acabamento=novoAcabamento;
            System.out.println("Estado actual do imovel: "+this.acabamento);
    }

//    public void mudarAcabamento(Acabamento acabamento){
//        this.acabamento=acabamento;
//        System.out.println(this.acabamento);
//        System.out.println("Obras efetuadas com sucesso!");
//    }

    //c. Crie um método chamado imprimirDescricao que imprima as especificações do imóvel.
    public void imprimirDescricao() {
        System.out.println("IMOVEL | Rua: " + this.rua + " | Porta: " + this.numPorta + " | Cidade: " + this.cidade);
        System.out.println("         Tipo: " + this.tipoImovel + " | Acabamento: " + this.acabamento + " | Área " + this.area);
        System.out.println("         Quartos: " + this.numQuartos + " | WCs: " + this.numWCs + " | Piscina " + this.areaPiscina);
    }

//        d. Crie um método chamado compararImoveis, que receba outro imóvel como parâmetro e retorne
//        qual o imóvel mais caro.}
    public Imovel compararImoveis(Imovel outroImovel) {
            if(this.calcularValorImovel() > outroImovel.calcularValorImovel()){
                System.out.println("O meu imovel é o mais caro");
                return this;
            }
            if(this.calcularValorImovel() < outroImovel.calcularValorImovel()){
                System.out.println("O meu imovel é o mais barato");
                return outroImovel;
            }else{
                System.out.println("Os dois imoveis têm o mesmo custo");
                return null;
            }
}



}