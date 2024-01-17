//        Instancie 5 pessoas (uma delas com menos de 18 anos).
//        De seguida tente adicionar todas as 5 ao array de participantes.
//        Imprima a lista de participantes e seguidamente imprima qual o vencedor.

package EX02_redo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Patos", 38, "92654784", "apatcm@gama.com");
        Pessoa tu = new Pessoa("Joaquimzinho", 8, "98654784", "joajoa@gama.com");
        Pessoa ele = new Pessoa("Augusto", 35, "93654784", "auauau@gama.com");
        Pessoa ela = new Pessoa("Dona Alexandrina", 88, "90654784", "alexis@gama.com");
        Pessoa elea = new Pessoa("Maria Joao", 28, "96654784", "mjo@gama.com");

        Sorteio festadeagosto = new Sorteio(14);

        festadeagosto.adicionarParticipante(eu);
        festadeagosto.adicionarParticipante(tu);
        festadeagosto.adicionarParticipante(ele);
        festadeagosto.adicionarParticipante(ela);
        festadeagosto.adicionarParticipante(elea);

        festadeagosto.exibirlistaParticipantes();





    }



}
