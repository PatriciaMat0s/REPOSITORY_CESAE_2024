//Determine e escreva o montante de impostos a pagar sobre um salário anual lido, tendo em conta o seguinte:
//a. Salário até 15.000€ inclusive paga taxa de 20%
//b. Salário superior a 15.000€ paga taxa de 30%

package FICHA__02;
import java.util.Scanner;

public class EX02 {
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

        else { System.out.println("IMPOSTOS A PAGAR (30%): " + salario*0.3); }



    }
}