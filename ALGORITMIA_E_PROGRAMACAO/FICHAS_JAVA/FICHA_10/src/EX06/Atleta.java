
//6. Crie uma classe chamada "Atleta" que armazena informações sobre um atleta, incluindo nome, modalidade
//        desportiva, altura, peso e país de origem. Cada atleta pode participar numa ou mais competições.
//        a. De seguida, crie a classe Competicao, que armazena informações sobre uma competição, incluindo
//        o nome da competição, país, e a lista de atletas participantes.
//        b. Crie métodos para adicionar atletas.
//        c. No Main crie, pelo menos, 6 atletas.
//        d. No Main crie, pelo menos, 2 competições (onde são adicionados os participantes).
//        e. Crie um método para imprimir as informações de uma competição, inclusive a lista de atletas

package EX06;

public class Atleta {
    private String nome;
    private String modalidade;
    private double altura;
    private double peso;
    private String paisOrigem;

    public Atleta(String nome, String modalidade, double altura, double peso, String paisOrigem) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.altura = altura;
        this.peso = peso;
        this.paisOrigem = paisOrigem;
    }
}
