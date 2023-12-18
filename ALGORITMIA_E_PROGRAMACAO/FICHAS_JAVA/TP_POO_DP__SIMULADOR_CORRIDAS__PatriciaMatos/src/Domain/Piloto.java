package Domain;

public class Piloto {
    protected String nome;
    protected int fichasCorrida;
    protected Veiculo veiculoAtual;
    protected int vitorias;

    public Piloto(String nome, int fichasCorrida, Veiculo veiculoAtual, int vitorias) {
        this.nome = nome;
        this.fichasCorrida = fichasCorrida;
        this.veiculoAtual = veiculoAtual;
        this.vitorias = vitorias;
    }

    /**
     * Método que imprime o inventário de itens do VeiculoAtual e pergunta qual quer usar, sendo que seguidamente aplica os efeitos no Veiculo do Piloto.
     */
    public void usarItem(){}

    /**
     * Método que recebe como parâmetro uma pista e retorna o tempo total que o
     *     piloto demorou a percorrer a pista no seu Veiculo (cada volta), de acordo com as seguintes regras:
     *             distanciaVolta/((1.6*potencia))-(0.2*peso)-(0.5*desgaste))
     *             A este tempo, somar o tempo que os Momentos atrasaram. Sendo que a cada volta, todos os
     *     momentos são repetidos de novo. Para calcular o atraso usar:
     *             ((peso*atrasoPeso)+(potencia*atrasoPotencia))/100
     *     A cada volta, o desgaste do veículo aumenta em 20.
     * @param pista
     * @return tempoPista tempo
     */
    public double corrida(Pista pista){}

}
