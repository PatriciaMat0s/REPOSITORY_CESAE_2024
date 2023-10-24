// Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
//se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3: 40%

package FICHA__02;
import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {

        // vou instanciar o Scanner - sempre mandatório:
        Scanner input = new Scanner(System.in);

        // vou declarar as variaveis:
        double nota1, nota2, nota3, medfinal;

        // vou pedir e ler:
        System.out.print("INTRODUZA A NOTA DA DISCIPLINA 1: ");
        nota1=input.nextDouble();

        System.out.print("INTRODUZA A NOTA DA DISCIPLINA 2: ");
        nota2=input.nextDouble();

        System.out.print("INTRODUZA A NOTA DA DISCIPLINA 3: ");
        nota3=input.nextDouble();

        medfinal = nota1*0.25 +nota2*0.35 +nota3*.4;

        if (medfinal > 9.50) {
            System.out.print( "O aluno teve média final de " + medfinal + ": está APROVADO!" );
        }

        else {
            System.out.print( "O aluno teve média final de " + medfinal + ": está REPROVADO. Boo hoo..." );
        }
    }
}