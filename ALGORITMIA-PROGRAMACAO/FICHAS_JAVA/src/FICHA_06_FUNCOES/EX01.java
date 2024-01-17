// Implemente uma função void fazerBarulho( ) que receba um animal (String) como argumento.
// De seguida, de acordo com o animal deve fazer o barulho característico
// (Ex.: Cão – “Au au au” | Gato – “Miau” | Peixe - “Glub Glub” | Vaca – “Muuuu” | Porco – “Oinc oinc”).


package FICHA_06;

import java.util.Scanner;

public class EX01 {
    public static void fazerBarulho(String animal) {
// void porque a funcao nao retorna nada - é m PROCEDIMENTO
        switch (animal) {
            case "cao":
                System.out.println("AW AW AW!");
                break;
            case "gato":
                System.out.println("MEOW MEOW MEOW!");
                break;
            case "pato":
                System.out.println("QUACK QUACK QUACK!!!");
                break;
            default:
                System.out.println("animal extraterrestre!");
        }
    }


    //Vou usar  a funçao:

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        String animalEscolhido;
        System.out.println("Insira um animal: ");
        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

    }
}
