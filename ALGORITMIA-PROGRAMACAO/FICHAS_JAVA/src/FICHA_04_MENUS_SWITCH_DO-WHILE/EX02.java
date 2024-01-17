//         Implemente um programa que leia a opção do menu desejada
//         (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
//Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida. Caso a escolha
//esteja fora das opções válidas, deverá informar o utilizador. De seguida, deverá apresentar novamente o menu
//para poder selecionar novas opções até que a opção 4 seja escolhida.


package FICHA_04;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        double num1, num2;
        String operacao;
        int menu, menu2;

        do {
            System.out.println("1 - CRIAR");
            System.out.println("2 - ATUALIZAR");
            System.out.println("3 - ELIMINAR");
            System.out.println("0 - SAIR");
            System.out.print("Insira o número da opção desejada: ");
            menu = input.nextInt();

            switch (menu) {
                case 1: System.out.println("Escolheu Criar");
                    break;
                case 2: System.out.println("Escolheu Atualizar");
                    break;
                case 3: System.out.println("Escolheu Eliminar");
                    break;
                case 0:
                    break; //nao faz nada mas tem de estar aqui para nao entrar no default
                default:
                    System.out.println("Opção inválida!");;
            }

            System.out.print("DESEJA CONTINUAR A EFECTUAR CÁLCULOS? S-1 / N-0 ");
            menu2 = input.nextInt();

        } while (menu2 != 0);
    }
}