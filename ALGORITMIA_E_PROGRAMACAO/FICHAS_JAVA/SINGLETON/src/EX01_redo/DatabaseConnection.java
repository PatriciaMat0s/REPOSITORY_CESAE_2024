

package EX01_redo;
public class DatabaseConnection {
    private String endereco;
    private static DatabaseConnection instance;

    private DatabaseConnection(String endereco) {
        this.endereco = endereco;
    }

    public static DatabaseConnection getInstance(String endereco){
        if (instance == null){
            instance = new DatabaseConnection(endereco);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado à Base de Dados: " + this.endereco);
    }

    public void disconnect() {
        System.out.println("Desconectado da Base de Dados: " + this.endereco);
    }
}
