package EX01;

public class DatabaseConnection {
        private String connectionString;
        private static DatabaseConnection instance;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DatabaseConnection getInstance(String connectionString){
            if(instance == null){
                instance = new DatabaseConnection(connectionString);
            }
            return instance;
        }

        public void connect() {
            System.out.println("Conectado à Base de Dados: " + this.connectionString);
        }

        public void disconnect() {
            System.out.println("Desconectado da Base de Dados: " + this.connectionString);
        }
    }
