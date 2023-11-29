package PIZZARIA;

import PIZZARIA.Enums.Tamanho;
import java.util.ArrayList;

public class Pizza {

    private String codigo;
    private String nome;
    private String descricao;
    private Tamanho tamanho;
    private ArrayList<Ingrediente> composicao;

    public Pizza(String codigo, String nome, String descricao, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.composicao = new ArrayList<>(); //O arraylist tira-se dos parametros do metodo construtor e inicializa-se
    }

    

}
