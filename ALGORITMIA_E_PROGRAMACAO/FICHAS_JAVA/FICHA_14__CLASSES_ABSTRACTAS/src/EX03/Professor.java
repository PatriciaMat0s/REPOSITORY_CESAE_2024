package EX03;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<AreaFormacao> areaFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String numTelemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, numTelemovel);
        this.areaFormacao = areaFormacao;
        this.nivelAcademico = nivelAcademico;
        this.areaFormacao= new ArrayList<>();
    }

    public Professor(String nome, int anoNascimento, String email, String numTelemovel) {
        super(nome, anoNascimento, email, numTelemovel);
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
    }
}
