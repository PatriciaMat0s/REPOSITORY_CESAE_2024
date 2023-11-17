//        1. Escreva um programa onde cria uma classe chamada
//        "Pessoa" com um atributo de nome, idade e altura.
//        Crie duas instâncias da classe "Pessoa", defina os seus atributos               usando o construtor e imprima seu nome, idade e altura

package EX01;

public class Pessoa {

    //»»» CARACTERISTICAS/ATRIBUTOS DA CLASSE:
    private String nome;
    private int idade;
    private double altura;


    // Definir os atributos da Classe com o construtor:
    /**
     * METODO CONSTRUTOR de Pessoa
     * @param nome Nome da Pessoa
     * @param idade Idade da Pessoa
     * @param altura Altura da Pessoa (metros)
     */
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }



    //»»» COMPORTAMENTOS/FUNÇOES/MÉTODOS DA CLASSE:
    public String getNome(){
        return this.nome = nome;
    }

    public int getIdade(){
        return this.idade =this.idade;
    }

    public double getAltura(){
        return this.altura =this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}
