package EX02_redo;

public class Main {

    public static void main(String[] args) {

        Conta myconta = new Conta("666-555-858", "Anna Mattos",200, 0);

        myconta.pedirEmprestimo(100);
        myconta.exibirDetalhes();
        System.out.println("");
        myconta.pedirEmprestimo(700);
        myconta.exibirDetalhes();
    }
}
