//2.      Escreva um programa onde cria uma classe chamada "Cao" com um nome (String), um atributo de raça
//        (String) e um atributo latido (String) que por defeito deve ser “Au au au”.
//        a. Deve conter um método de ladrar (imprime na consola um latido).
//        b. Crie três instâncias da classe "Cão", defina os seus atributos (nome e raça) usando o construtor.
//        c. Modifique o latido usando os métodos setter e invoque o método latir.
//
//        Lembrete: Por boa prática, todos os atributos devem estar incluídos no construtor de forma a serem
//        inicializados, mas nem todos os atributos precisam de ser recebidos como argumentos do método
//        construtor (Podem ser inicializados com valores padrão da nossa escolha).

package EX02;

public class Cao {

    //»»» CARACTERISTICAS/ATRIBUTOS DA CLASSE - construtor da classe:
    private String nome;
    private String raca;
    private String latido = "au au au";

    // Definir os atributos da Classe com o metodo de construtor da classe:
    /**
     * METODO CONSTRUTOR de cao
     * @param nome Nome da cao
     * @param raca Idade da cao
     * */
    public Cao(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }


    //»»» COMPORTAMENTOS/FUNÇOES/MÉTODOS DA CLASSE:
    public void setLadrar(String latido){
        this.latido = latido;
    }

    public void Ladrar(){
        System.out.println(this.latido = latido);
    }


} //fecho classe Cao
