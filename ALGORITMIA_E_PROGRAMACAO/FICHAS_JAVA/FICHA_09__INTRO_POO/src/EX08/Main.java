package EX08;

public class Main {
    public static void main(String[] args) {

        Aluno alunoD = new Aluno("Daniel", 43,  "Desenho Expressivo", 9.4);
        Aluno alunoI = new Aluno("Irina", 30,  "Desenho Realista", 18);

        System.out.println("Aluno Daniel: "+ alunoD.situacao());

        System.out.println("Aluno Irina: "+alunoI.situacao());





    }
}
