package PROJETO__PROGRAMACAO_ESTRUTURADA;
import java.util.Scanner;


public class teste {


    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

    int opcaoMenuAdmin, menuCliente;
    String passAdmin;



        do {System.out.println("INTRODUZA A SUA PASSWORD: ");
            passAdmin = myScanner.next();

        } while(!passAdmin.equals("1")); //souADMINyay123

        System.out.println("INTRODUZA A SUA PASSWORD: ");
        passAdmin = myScanner.next();
        System.out.println("Bem-vindo, Sr. Administrador!");


    }
}
