//  Implemente um programa de menu (opções do menu: 1. Criar 2. Atualizar 3. Eliminar 4. Sair). Se uma das opções
//1, 2 ou 3 for escolhida, imprima na tela a opção selecionada, se for a 4 não deve fazer nada. Caso a opção for
//inválida, deve informar o utilizador.

package FICHA_02;
import java.util.Scanner;

public class EX12 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int menu;

        // vou pedir e ler:
        System.out.print("Escolha uma das opções do menu (1. Criar 2. Atualizar 3. Eliminar 4. Sair): ");
        menu=input.nextInt();


        switch (menu) {
            case 1: System.out.println("Criar");
                break;
            case 2: System.out.println("Atualizar");
                break;
            case 3: System.out.println("Eliminar");
                break;
            case 4:
                break; //nao faz nada mas tem de estar aqui para naoo entrar no default
            default:
                    System.out.println("Erro! Escolha uma das opções do menu (1. Criar 2. Atualizar 3. Eliminar 4. Sair):");;
        }

    }
}