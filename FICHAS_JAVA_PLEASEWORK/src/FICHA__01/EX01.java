//SCRIPT PARA SOMAR DOIS MUMEROS
package FichaPratica01;
import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        int num1, num2, soma;

        // vou pedir os dois numeros e ler ambos:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num1=input.nextInt();
        System.out.print("INTRODUZA OUTRO NÚMERO: ");
        num2=input.nextInt();

        // vou calcular a soma:
        soma=num1+num2;

        // vou apresentar a soma:
        System.out.println("A soma dos números é: " + soma + "!");
    }
}