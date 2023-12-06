package EX03;

public abstract class Pessoa {
    private String nome;
    private int anoNascimento;
    private String email;
    private String numTelemovel;

    public Pessoa(String nome, int anoNascimento, String email, String numTelemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.numTelemovel = numTelemovel;
    }
    public abstract void obterFuncao();

    public abstract void imprimirHorario();

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome+" | "+this.anoNascimento+" | "+this.email+" | "+this.numTelemovel);
    }

}
