package PIZZARIA;

import PIZZARIA.Enums.Tamanho;
import  PIZZARIA.Enums.UnidadeMedida;

import java.util.ArrayList;

public class Ingrediente {

        private String codigo;
        private String nome;
        private UnidadeMedida unidadeMedida;
        private double CalsPorUnidadeMedida;


    public Ingrediente(String codigo, String nome, UnidadeMedida unidadeMedida, double calsPorUnidadeMedida) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedida = unidadeMedida;
        CalsPorUnidadeMedida = calsPorUnidadeMedida;
    }



}
