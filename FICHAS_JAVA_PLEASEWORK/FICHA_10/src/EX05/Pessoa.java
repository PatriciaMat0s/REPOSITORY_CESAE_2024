
//5. Crie uma classe chamada "Pessoa" que armazena informações básicas sobre uma pessoa, como nome,
//        idade, email e telemóvel. De seguida, crie uma classe chamada "Agenda" que armazena um conjunto de
//        objetos Pessoa num array. A classe Agenda terá um método para adicionar novas pessoas e outro para
//        listar todas as pessoas registadas.

package EX05;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int idade, String email, String telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome + "\t| Idade: "+this.idade+"\t|Email: "+this.email+"\t|Telemovel: "+this.telemovel);