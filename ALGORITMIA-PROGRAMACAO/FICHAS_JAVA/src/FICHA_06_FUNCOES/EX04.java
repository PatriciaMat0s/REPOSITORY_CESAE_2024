//Implemente o programa “Análise de um Número” que pergunte um número ao utilizador e, de seguida,
//apresente um menu de opções ao utilizador, que permitem analisar o número inserido. Esse menu de opções
//deve ter o seguinte aspeto:
//1. Par ou Ímpar
//2. Positivo ou Negativo
//3. Primo ou Não Primo
//4. Perfeito ou Não Perfeito
//5. Triangular ou Não Triangular
//6. Trocar de Número

package FICHA_06;
import java.util.Scanner;
import static FICHA_06.EX03a.*;
public class EX04 {
    public static void main(String[] args) {

        // Inicializar o scanner:
        Scanner input = new Scanner(System.in);
//
        int num;
        int analise;

        do {
            System.out.println("INTRODUZA UM NÚMERO: ");
            num = input.nextInt();

            System.out.println("SELECCIONE O NÚMERO DA OPÇAO DE ANÁLISE DESEJADA:");
            System.out.println("1. Par ou Ímpar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangular");
            System.out.println("6. Introduzir outro número)");
            System.out.println("0. Sair)");
            analise = input.nextInt();

            switch (analise) {
                case 1:
                    if (par(num)){
                    System.out.print("Par");
                }else{
                    System.out.print("Impar");
                }
                break;

                case 2:
                    if (positivo(num)){
                        System.out.print("Positivo");
                    }else{
                        System.out.print("Negativo");
                    }
                    break;

                case 3:
                    if (primo(num)){
                        System.out.print("Primo");
                    }else{
                        System.out.print("Não primo");
                    }
                    break;

                case 4:
                    if (perfeito(num)){
                        System.out.print("Perfeito");
                    }else{
                        System.out.print("Não perfeito");
                    }
                    break;

                case 5:
                    if (triangular(num)){
                        System.out.print("Triangular");
                    }else{
                        System.out.print("Não triangular");
                    }
                    break;

                case 6:
                    System.out.println("Introduza um novo numero: ");
                    num = input.nextInt();
                    break;

                case 0: //
                    System.out.print("Sair!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }


        } while (analise!=0);
    }
}