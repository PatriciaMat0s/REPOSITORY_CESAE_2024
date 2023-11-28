package EX02_redo;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> listaParticipantes = new ArrayList<>();

    public Sorteio(double premio) {
        this.premio = premio;
    }
    public void adicionarParticipante(Pessoa participante){
        if (participante.getIdade() >= 18){
            //tem o this:
            this.listaParticipantes.add(participante);
            System.out.println("Participante "+participante.getNome()+" admitido a sorteio!");
        }else{
            System.out.println("Participante "+participante.getNome()+" tem que ser maior que 18 para poder participar no sorteio!");
        }
    }

    public Pessoa sortear(ArrayList<Pessoa> listaParticipantes){
        Random rand = new Random();
        int n = rand.nextInt(0, this.listaParticipantes.size());
        //return listaParticipantes.get(n); NOPE, É ASSIM:
        return this.listaParticipantes.get(n);
    }

    //Participante 1: Vitor Santos | 24 | 911 111 111 | vmvs007@gmail.com
    //AL - arraylist
    //FOR-EACH : for (tipodadosdaAL elementosdaAL : nomeAL) { ...
    //for (EX02_redo.Pessoa participante : this.listaParticipantes){
    public void exibirlistaParticipantes() {
        for (int i = 0; i < this.listaParticipantes.size(); i++) {
            System.out.println("Participante " + (i + 1) + ":" + EX02_redo.Pessoa.nome()+" | "+Pessoa.getIdade()+" | "+Pessoa.getTelemovel()+" | "+Pessoa.getMail());
        }
    }

//    public void imprimirListaParticipantes() {
//        int contador = 1;
//
//        System.out.println("***** Lista de Participantes *****");
//        for (EX02.Pessoa pessoaAtual : this.participantes) {
//            System.out.print("Participante " + contador++ + ": ");
//            pessoaAtual.exibirDetalhes();
//        }
//    }

}
