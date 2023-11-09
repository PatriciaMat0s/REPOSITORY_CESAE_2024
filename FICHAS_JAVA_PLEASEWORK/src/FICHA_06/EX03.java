// todo: O exercício deve ser resolvido na mesma classe (por exemplo: Ex_03), deve acrescentar as funções conforme solicitado.
// No início não conseguirá testar se as funções funcionam ou não (uma vez que não é pedido para
//desenvolver nada no main), considere fazer o exercício 4 em concorrente para conseguir perceber se está tudo como esperado.


package FICHA_06;
import java.util.Scanner;
public class EX03 {

//      a) Implemente uma função que determina se um número (passado por argumento) é par ou ímpar, a função
//      deve retornar true se par ou false se ímpar.
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
    }

//        b) Implemente uma função que determina se um número (passado por argumento) é positivo ou negativo,
//        a função deve retornar true se zero ou positivo, ou false se negativo
    /**
     * Função que determina se um número (passado por argumento) é positivo ou negativo
     * @param numero - número introduzido pelo utilizador
     * @return - True se numero é Positivo || False se numero é negativo
     */
    public static boolean Positivo(int numero) {
        if (numero >= 0) {
            return true;
        } else {
            return false;
        }
    }

//        c) Implemente uma função que determina se um número (passado por argumento) é ou não primo, a função
//        deve retornar true se primo ou false se não primo.
        /**
         * Função que determina se um número (passado por argumento) é primo
         * @param numero - número introduzido pelo utilizador
         * @return - True se numero é Primo || False se numero nao primo
         */
        public static boolean Primo(int numero) {
            int soma = 0;
            for (int indice = 2; indice < numero; indice++) {
                if (numero % indice == 0) {
                    soma++;
                }
                if (soma == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
//        d) Implemente uma função que determina se um número (passado por argumento) é perfeito, a função deve
//        retornar true se perfeito ou false se não perfeito (Os números perfeitos são iguais à soma dos seus
//                divisores: 6 pode ser dividido por 1, 2 e 3 e, quando soma esses números, o resultado é 6).
        /**
         * Função que determina se um número (passado por argumento) é perfeito
         * @param numero - número introduzido pelo utilizador
         * @return - True se numero é Perfeito || False se numero nao perfeito
         */
                public static boolean Perfeito(int numero) {
                    int soma=0;
                    for (int indice = 1; indice < numero; indice++) {
                        if (numero%indice==0){
                            soma=soma+indice; //soma+=indice;
                            }
                        if (soma==numero){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }

//        e) Implemente uma função que determina se um número (passado por argumento) é triangular, a função
//        deve retornar true se triangular ou false se não triangular (Um número triangular é um número que pode
//                ser representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5)
        /**
         * Função que determina se um número (passado por argumento) é triangular
         * @param numero - número introduzido pelo utilizador
         * @return - True se numero é triangular || False se numero nao triangular
         */
        public static boolean Triangular(int numero) {
            int soma=0;
            for (int indice = 1; indice < numero; indice++) {
                    soma=soma+indice;
                }
                if (soma==numero){
                    return true;
                }else{
                    return false;
                }
            }


         }
