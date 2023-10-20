package FICHA__01;
import java.util.Scanner;

public class EX04 {

    public static void main(String[] args) {

// vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);

// vou declarar variaveis:
        double raio;
        final double PI = 3.14;

// vou pedir o raio e lê-lo:
        System.out.print("INTRODUZA O RAIO DA CIRCUNFERÊNCIA (CM): ");
        raio=input.nextDouble();

// vou retornar as operaçoes pretendidas:
        System.out.println("A ÀREA DA CIRCUNFERÊNCIA É " + PI*raio*raio + "CM2, E O SEU PERIMETRO É " + 2*PI*raio + "CM.");

    }

}