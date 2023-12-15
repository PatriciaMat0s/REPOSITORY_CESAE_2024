package EX01_redo;

public class Main {

    public static void main(String[] args) {

        //DatabaseConnection conexao1 = new DatabaseConnection("htttp://teyetdgsfahsdchehcenckejnkjnyay");
        //Nem sequer deixa usar o metodo construtor normalemtne, com o operador de alocaçao NEW, visto que está definido como privado!
        DatabaseConnection conexao1 = DatabaseConnection.getInstance("htttp://teyetdgsfa__w__ehcenckejnkjn__yay");
        DatabaseConnection conexao2 = DatabaseConnection.getInstance("htttp://teyetdgsfahsdchehcenckejuyuyuyay");
        DatabaseConnection conexao3 = DatabaseConnection.getInstance("htttp://teyetdgsfahs---kjnyay");

        conexao1.connect();
        conexao1.disconnect();

        conexao2.connect();
        conexao2.disconnect();

        conexao3.connect();
        conexao3.disconnect();

    }
}
