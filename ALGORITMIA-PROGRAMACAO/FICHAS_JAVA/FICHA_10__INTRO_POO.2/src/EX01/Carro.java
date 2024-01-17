//        1. Atualize a classe Carro, para além de marca, modelo e ano, deve ter os seguintes parâmetros: potência,
//        cilindrada, tipoCombustivel, litros100Km.
//        a. Tipo Combustível deve ser uma enumeração: GASOLINA, DIESEL, GPL.
//        b. Altere o método ligar para que imprima uma mensagem de acordo com as seguintes
//        especificações
//        c. Crie um método chamado corrida que receba um adversário como parâmetro e retorne o carro
//        vendedor. O vencedor é o carro com mais potência (caso seja a mesma o fator de desempate é a
//        cilindrada (o maior ganha), caso contrário o fator de desempate é a idade (o mais recente ganha),
//        caso contrário temos empate).
//        d. Crie um método que receba como parâmetro uma distância (em km), e que calcule o valor
//        consumido em litros do combustível.
//        e. Teste a classe instanciando dois carros ao seu gosto e faça uma corrida entre os dois, imprima o
//        vencedor. Seguidamente, calcule quanto é que os dois carros iam gastar numa viagem de 97km. E
//        imprima na consola quanto gastaria cada um, e qual dos dois é que ia gastar mais


package EX01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private TipoCombustivel tipoCombustivel;
    private double consumo;


    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, TipoCombustivel tipoCombustivel, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumo = consumo;
    }



    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }


    public Carro corrida(Carro adversario){
        if(this.potencia>adversario.potencia){
            // Ganha o meu carro por potencia
            return this; // Devolve o meu carro (objeto que invocou o método)
        }else{

            if(this.potencia<adversario.potencia){
                // Ganha o adversario por potencia
                return adversario;
            }else{
                // Empate de potencia
                if(this.cilindrada>adversario.cilindrada){
                    // Ganha o meu carro por cilindrada
                    return this;
                }else{

                    if(this.cilindrada<adversario.cilindrada){
                        // Ganha o adversario por cilindrada
                        return adversario;
                    }else{
                        // Empate de cilindrada

                        if(this.anoFabrico>adversario.anoFabrico){
                            // Ganha o meu carro por idade
                            return this;
                        }else{

                            if(this.anoFabrico<adversario.anoFabrico){
                                // Ganha o adversario por idade
                                return adversario;
                            }

                        }
                    }

                }
            }

        }

        return null;
    }

    public void exibirDetalhes(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println("Ano: "+this.anoFabrico);
        System.out.println("Potencia: "+ this.potencia+ " cv.");
        System.out.println("Cilindrada: "+this.cilindrada+" cc.");
    }


    public void ligar() {
        int idadeAtual = 2023 - this.anoFabrico;

        if (idadeAtual > 30) { // Mais de 30 anos

            if (this.tipoCombustivel.equals(TipoCombustivel.DIESEL)) { // Carro a diesel
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else { // Carro não diesel
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }

        } else { // 30 anos ou mais recente

            if (this.potencia < 250) { // Menos de 250 cavalos
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmmmmmmmmmm");
            } else { // 250 ou mais cavalos
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMMMMMMMMMMMMMM");
            }

        }
    }





    // Temperatura é um modificador externo (não faz parte das caracteristicas do carro)
    // Não faz parte da ficha
    public void ligarComTemperatura(double temperatura){

        if(temperatura>10){ // Liga com calor

            if(this.potencia>250){
                System.out.println("VRUMVRUMVRUM... VRUMMMMMMM!!");
            }else{
                System.out.println("vrumvrumvrum... vrummmmm...");
            }

        }else{ // Liga com frio

            if(this.potencia>250){
                System.out.println("Custa um pouco... VRUMVRUMVRUMVRUMVRUMVRUM... VRUMMMMMMM!!");
            }else{
                System.out.println("Custa um pouco... vrumvrumvrumvrumvrum... vrummmmm...");
            }

        }
    }
}