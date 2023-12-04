// Escreva uma função que leia um valor inteiro positivo (deve solicitar números até que seja inteiro e positivo) e
//crie uma função que imprima numa linha um número de asteriscos igual ao valor inserido pelo utilizador.
//Exemplos de execução:


package FICHA_06;

import java.util.Scanner;

public class EX02 {

    /**
     * FUNÇÃO QUE PEDE E LÊ UM VALOR INTEIRO POSITIVO:
     * @param num - número que o utilizador introduz
     */
    public static int LerInteiroPositivo() {
        Scanner input = new Scanner(System.in);
        int num; //defino o argumento
        do {
            System.out.println("Introduza um número imteiro positivo: ");
            num=input.nextInt();
        } while(num<=0);

        return num;
        }

    /**
     * Função que imprime numa linha um número de asteriscos igual ao valor inserido pelo utilizador
     * @param numAsteriscos - número introduzido pelo utilizador
     */
    public static void ImprimirNumAsteriscos(int numAsteriscos) {
        Scanner input = new Scanner(System.in);

        for (int ind=1 ; ind<=numAsteriscos ; ind++) {
            System.out.print("*");
        }
        System.out.println();
        }

    //Vou usar a funçao:
        public static void main(String[] Args){

            int num=LerInteiroPositivo();
            ImprimirNumAsteriscos(num);

        }

}
