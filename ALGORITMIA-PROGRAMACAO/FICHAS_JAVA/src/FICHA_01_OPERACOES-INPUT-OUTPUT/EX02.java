package FICHA_01;
import java.util.Scanner;
public class EX02 {

    public static void main(String[] args) {

        // vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);

        // vou declarar variaveis:
        double num1, num2, resultado;

        // vou pedir os dois numeros e ler ambos:
        System.out.print("INTRODUZA UM NÚMERO: ");
        num1=input.nextDouble();
        System.out.print("INTRODUZA OUTRO NÚMERO: ");
        num2=input.nextDouble();

        // vou calcular as operaçoes:
        resultado=num1+num2;
        System.out.println("A SOMA É: " + resultado);

        resultado=num1-num2;
        System.out.println("A DIFERENÇA É: " + resultado);

        resultado=num1*num2;
        System.out.println("O PRODUTO É: " + resultado);

        resultado=num1/num2;
        System.out.println("A DIVISÃO É: " + resultado);

    }
}

