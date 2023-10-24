// Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
//(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o saldo final se
//mantém positivo depois da operação.

package FICHA__02;
import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        double saldo, movimento;

        // vou pedir e ler:
        System.out.print("INTRODUZA O SEU SALDO BANCÁRIO ACTUAL: ");
        saldo=input.nextDouble();

        System.out.print("INTRODUZA O MONTANTE QUE DESEJA MOVIMENTAR: ");
        movimento=input.nextDouble();


        if (movimento <= saldo) {
            System.out.println("OPERAÇÃO VÁLIDA: SALDO PÓS-MOVIMENTO = "+(saldo-movimento)+" EUR");;
        }
        else {
            System.out.println("OPERAÇÃO INVÁLIDA: SALDO ACTUAL "+ (movimento-saldo) +" EUR ABAIXO DO MONTANTE PRETENDIDO");;
        }

        }

}