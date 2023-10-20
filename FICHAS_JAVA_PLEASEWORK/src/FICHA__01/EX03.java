package FICHA__01;
import java.util.Scanner;
public class EX03 {

    public static void main(String[] args) {


// vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);


// vou declarar variaveis:
        double cp;
        double lg;


// vou pedir o cpto e largura:

        System.out.print("INTRODUZA O COMPRIMENTO DO RETÂNGULO (CM): ");
        cp=input.nextDouble();

        System.out.print("INTRODUZA A LARGURA DO RETÂNGULO (CM): ");
        lg=input.nextDouble();


// vou retornar as operaçoes pretendidas:
        System.out.println("A ÀREA DO RETÂNGULO É " + cp*lg + " CM2, E O SEU PERIMETRO É " + (cp+cp+lg+lg) + " CM.");

    }

}