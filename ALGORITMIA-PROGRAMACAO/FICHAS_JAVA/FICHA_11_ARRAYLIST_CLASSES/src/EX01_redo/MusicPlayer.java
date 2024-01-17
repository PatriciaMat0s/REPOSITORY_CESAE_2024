package EX01_redo;

import EX01.Musica;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao;

    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }

    public void addMusic(Musica musica){
        this.programacao.add(musica);
    }


}
