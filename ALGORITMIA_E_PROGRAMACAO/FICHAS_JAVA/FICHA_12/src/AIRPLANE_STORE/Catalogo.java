package AIRPLANE_STORE;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogoAvioes;

    public Catalogo() {
        this.catalogoAvioes = new ArrayList<>();
    }

    public void adquirirAviao(Aviao aviaoNovo){
        this.catalogoAvioes.add(aviaoNovo);
    }

    public void venderAviao(int index){
        this.catalogoAvioes.remove(index);
    }

    public double calcularTotalCatalogo(){
        double valorCatalogo=0;

        for(Aviao aviaoAtual : this.catalogoAvioes){
            valorCatalogo+=aviaoAtual.getPreco();
        }

        return valorCatalogo;
    }

    public void imprimirCatalogo(){
        //instanceof --- checks whether an object is an instance of a specific class:
//                public class Main {
//                    public static void main(String[] args) {
//                        Main myObj = new Main();
//                        System.out.println(myObj instanceof Main); // returns true
//                    }
//                }

        System.out.println("************ Catálogo Aviões ************\n");
        for(Aviao aviaoAtual: this.catalogoAvioes){

            if(aviaoAtual instanceof JatoPrivado){ // Sei que aviaoAtual é Avião e JatoPrivado

                JatoPrivado jatoPrivadoAtual = (JatoPrivado) aviaoAtual;
                jatoPrivadoAtual.exibirDetalhesJatoPrivado();
            }

            if(aviaoAtual instanceof AviaoCombate){// Sei que aviaoAtual é Avião e AviaoCombate
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.exibirDetalhesAviaoCombate();
            }

        }
    }
}