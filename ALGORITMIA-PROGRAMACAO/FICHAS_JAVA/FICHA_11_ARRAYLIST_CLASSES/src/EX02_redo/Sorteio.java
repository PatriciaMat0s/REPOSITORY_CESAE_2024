package EX02_redo;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList<Pessoa> listaParticipantes = new ArrayList<>();

//    public Sorteio(double premio, ArrayList<Pessoa> listaParticipantes) {
//        this.premio = premio;
//        this.listaParticipantes = listaParticipantes;
   // }

    public Sorteio(double premio){
        this.premio = premio;
    }
    public void adicionarParticipante(Pessoa participante){
        if (participante.getIdade() >= 18){ //pois o atributo esta noutra classe e é private
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
        //return listaParticipantes.get(n); //Prof tinha ASSIM:
        return this.listaParticipantes.get(n);
    }

    //Participante 1: Vitor Santos | 24 | 911 111 111 | vmvs007@gmail.com
    //AL - arraylist
    //FOR-EACH : for (tipodadosdaAL nomevariavelcriadoagora : nomeAL) { ...

    public void exibirlistaParticipantes() {
        for (int i = 0; i < this.listaParticipantes.size(); i++) {
            Pessoa pessoaAtual = listaParticipantes.get(i);
            System.out.println("Participante " + (i + 1) + " : " + pessoaAtual.getNome()+" | "+pessoaAtual.getIdade()+" | "+pessoaAtual.getTelemovel()+" | "+pessoaAtual.getMail());
        }
    }

    //Funçao do Prof:
//    public void imprimirListaParticipantes() {
//        int contador = 1;
//
//        System.out.println("***** Lista de Participantes *****");
//        for (Pessoa pessoaAtual : this.listaParticipantes) {
//            System.out.print("Participante " + contador++ + ": ");
//            pessoaAtual.exibirDetalhes(); //sem
//        }
//
//    }

}
