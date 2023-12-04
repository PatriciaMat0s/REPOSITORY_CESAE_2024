package PIZZARIA;

import PIZZARIA.Enums.Tamanho;
import java.util.ArrayList;

public class Pizza {

    private String codigo;
    private String nome;
    private String descricao;
    private Tamanho tamanho;
    private ArrayList<Ingrediente> ingredientes;

    public Pizza(String codigo, String nome, String descricao, Tamanho tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.ingredientes = new ArrayList<>(); //O arraylist tira-se dos parametros do metodo construtor e inicializa-se
    }

    //Adicionar novos ingredientes a uma Pizza até um máximo de 5:
    // public vois nomeFuncao(***tipo de variaveis que compoem a ArrayList***, ***nome da ArrayList***)
    public void addIngreds(Ingrediente novoIngrediente) {
        if (this.ingredientes.size() < 5) {
            this.ingredientes.add(novoIngrediente);
        } else {
            System.out.println("Não é possível adicionar o ingrediente, a sua pizza aingiu o maximo permitido (5).");
        }
    }

    //Editar a quantidade de um ingrediente que pertença à coleção de uma pizza
    public void alterarQuantidadeIngrediente(Pizza_Ingrediente ingredienteObj, double newQuantidade){
        //for (tipodadosdaAL  nome_variavel_criado_agora : nome_AL) { ...
          for (Ingrediente ingredienteAtual : this.ingredientes){
              if (ingredienteObj.getIngrediente().equals(ingredienteAtual)){
                  ingredienteObj.setQuantidadeIngrediente(newQuantidade);
//              }
//          }
    //PROF TEM ASSIM:
//    public void alterarQuantidadeIngrediente(Ingrediente ingredienteObj, double newQuantidade){
//    for (Ingrediente ingredienteAtual : this.ingredientes){
//        if (ingredienteAtual.getIngrediente()==ingredienteObj){
//            ingredienteAtual.setQuantidade(newQuantidade);
//        }
//    }


}
}
