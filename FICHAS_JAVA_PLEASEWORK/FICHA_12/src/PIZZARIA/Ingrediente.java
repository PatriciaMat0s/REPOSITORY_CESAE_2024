package PIZZARIA;

import PIZZARIA.Enums.Tamanho;
import  PIZZARIA.Enums.UnidadeMedida;

import java.util.ArrayList;

public class Ingrediente extends Pizza{

        private String codigo;
        private String nome;
        private UnidadeMedida unidadeMedida;
        private double CalsPorUnidadeMedida;


    public Ingrediente(String codigo, String nome, String descricao, Tamanho tamanho, ArrayList<Ingrediente> composicao, String codigo1, String nome1, UnidadeMedida unidadeMedida, double calsPorUnidadeMedida) {
        super(codigo, nome, descricao, tamanho, composicao);
        this.codigo = codigo1;
        this.nome = nome1;
        this.unidadeMedida = unidadeMedida;
        CalsPorUnidadeMedida = calsPorUnidadeMedida;
    }



}
