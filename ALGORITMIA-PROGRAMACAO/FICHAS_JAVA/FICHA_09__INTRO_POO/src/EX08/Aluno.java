
//8. Crie uma classe Aluno que tenha os atributos nome, idade, curso e média.
//        a. Crie um construtor que receba os quatro atributos como parâmetros.
//        b. Crie um método chamado situacao que retorne "Aprovado" se a média for maior ou igual a 9.5,"Reprovado" caso contrário.
//        c. No método main, crie um objeto dessa classe e apresente a situação do aluno

package EX08;

public class Aluno {

    private String nome;
    private int idade;
    private String curso;
    private double media;

    public Aluno(String nome, int idade, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.media = media;
    }

    public String situacao(){
        if (this.media >= 9.5){
                return "APROVADO";
        }else{
            return "ESTUDASSES UÉUÉUÉ";
        }
    }


}



