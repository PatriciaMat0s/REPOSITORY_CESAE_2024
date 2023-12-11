////Crie uma classe chamada "UserSessionManager" para gerir as sessões de utilizadores num sistema.
////        A classe deve ter os atributos: sessionToken (int aleatório) e lastAccess (String).
////        Quando uma instância desta sessão de utilizador for criada, deve gerar automaticamente um sessionToken e
////        definir o lastAccess para a hora atual.
////        A classe também deve possuir métodos para obter o token de sessão (random), obter o horário do último
////        acesso e atualizar o horário do último acesso (usar System.currentTimeMillis()).
////        A classe UserSessionManager deve possuir um construtor privado e um método estático getInstance para
////        retornar a instância única da classe. (Implementar Singleton)
////        Exemplo de main com instância e invocação de métodos.
//
//package EX03;
//
//import java.util.Random;
//
//public class UserSessionManager {
//    private int sessionToken;
//    private String lastAccess;
//
//
//// Proxima linha é designada de "pedestal":
//    public static UserSessionManager getInstance(int sessionToken, String lastAccess) {
//        return null;
//    }
//
//    private UserSessionManager(int sessionToken, String lastAccess) {
//        this.sessionToken = sessionToken;
//        this.lastAccess = lastAccess;
//    }

//    public int sortear(){
//        Random rand = new Random();
//        int n = rand.nextInt(0, 100);
//        //return listaParticipantes.get(n); //Prof tinha ASSIM:
//      //  return this.listaParticipantes.get(n);
//    }
//
//}
package EX03;

import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {

    private int sessionToken;
    private String lastAccess;

    private static UserSessionManager instance;

    private UserSessionManager() {

        // Criar um objeto de Random
        Random rd = new Random();

        this.sessionToken = rd.nextInt();
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }

        return instance;
    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess() {
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }
}