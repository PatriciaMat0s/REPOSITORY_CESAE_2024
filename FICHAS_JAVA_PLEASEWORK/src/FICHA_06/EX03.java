// todo: O exercício deve ser resolvido na mesma classe (por exemplo: Ex_03), deve acrescentar as funções conforme solicitado.
// No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para
//desenvolver nada no main), considere fazer o exercício 4 em concorrente para conseguir perceber se está tudo como esperado.



package FICHA_06;

import java.util.Scanner;

public class EX03 {

//a) Implemente uma função que determina se um número (passado por argumento) é par ou ímpar, a função
// deve retornar true se par ou false se ímpar.
    /**
     * FUNÇÃO QUE determina se um numero inteiro positivo é par ou impar:
     * @param numero - número que o utilizador introduz que é avaliado
     * @return - True se numero é PAR || False se numero ÍMPAR
     */

    public static boolean Par(int numero) {
        if (numero%2==0){
        return true;
    }else{
        return false;
        }


//        b) Implemente uma função que determina se um número (passado por argumento) é positivo ou negativo,
//        a função deve retornar true se zero ou positivo, ou false se negativo
    /**
     * Função que determina se um número (passado por argumento) é positivo ou negativo
     * @param numero - número introduzido pelo utilizador
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

            Scanner input = new Scanner(System.in);
            System.out.println("Introduza um número imteiro positivo: ");

            numero=input.nextInt();
            int num=LerInteiroPositivo();
            ImprimirNumAsteriscos(num);

        }
}
}
