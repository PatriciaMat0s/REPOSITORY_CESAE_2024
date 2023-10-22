//Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
//        a. Salário até 15.000€ inclusive paga taxa de 20%
//        b. Salário de 15.000€ a 20.000€ inclusive paga taxa de 30%
//        c. Salário de 20.000€ a 25.000€ inclusive paga taxa de 35%
//        d. Salário superior a 25.000€ paga taxa de 40%

package FICHA__02;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        double salario;

        // vou pedir e guardar o salario:
        System.out.print("INTRODUZA O SALÁRIO (EM EUROS): ");
        salario=input.nextDouble();

        // condições:
        if (salario <= 15000) {
            System.out.println("IMPOSTOS A PAGAR (20%): " + salario*0.2);
        }

        if ( 15000 < salario && salario <= 20000) {
            System.out.println("IMPOSTOS A PAGAR (30%): " + salario*0.3);
        }

        if ( 20000 < salario && salario <= 25000) {
            System.out.println("IMPOSTOS A PAGAR (35%): " + salario*0.35);
        }

        if ( salario > 25000) {
            System.out.println("IMPOSTOS A PAGAR (40%): " + salario*0.4);
        }
    }
}