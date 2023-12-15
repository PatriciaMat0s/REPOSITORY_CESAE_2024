package EX02_redo;

public class Pessoa {
    private String nome;
    private int idade;
    private String telemovel;
    private String mail;

    public Pessoa(String nome, int idade, String telemovel, String mail) {
        this.nome = nome;
        this.idade = idade;
        this.telemovel = telemovel;
        this.mail = mail;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public String getMail() {
        return mail;
    }

    public void exibirDetalhes(){
        System.out.println(this.nome+ " | "+this.idade+" anos | Telemovel: "+this.telemovel+" | Email: "+ this.mail);
    }}

