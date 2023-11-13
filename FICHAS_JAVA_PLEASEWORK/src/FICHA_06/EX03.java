//// // todo: O exercício deve ser resolvido na mesma classe (por exemplo: Ex_03), deve acrescentar as funções conforme solicitado.
//
//
//
// package FICHA_06;
// import java.util.Scanner;
// public class EX03 {
//
//     /**
//      * FUNÇÃO QUE determina se um numero inteiro positivo é par ou impar:
//      *
//      * @param numero - número que o utilizador introduz que é avaliado
//      * @return - True se numero é PAR || False se numero ÍMPAR
//      */
//     public static boolean Par(int numero) {
//         if (numero % 2 == 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//
//     /**
//      * Função que determina se um número (passado por argumento) é positivo ou negativo
//      *
//      * @param numero - número introduzido pelo utilizador
//      * @return - True se numero é Positivo || False se numero é negativo
//      */
//     public static boolean Positivo(int numero) {
//         if (numero >= 0) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//
//     /**
//      * Função que determina se um número (passado por argumento) é primo
//      *
//      * @param numero - número introduzido pelo utilizador
//      * @return - True se numero é Primo || False se numero nao primo
//      */
//     public static boolean Primo(int numero) {
//         int soma = 0;
//         for (int indice = 2; indice < numero; indice++) {
//             if (numero % indice == 0) {
//                 soma++;
//             }
//             if (soma == 0) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//
//          /** Função que determina se um número (passado por argumento) é perfeito (Os números perfeitos são iguais à soma dos seus
//          divisores: 6 pode ser dividido por 1, 2 e 3 e, quando soma desses números, o resultado é 6).
//          * @param num - número introduzido pelo utilizador
//          * @return - True se numero é Perfeito || False se numero nao perfeito
//          */
//         public static boolean Perfeito(int numero){
//             int soma = 0;
//             for (int indice = 1; indice < numero; indice++) {
//                 if (numero % indice == 0){
//                     soma = soma + indice; //soma+=indice;
//                 }
//             }
//                 if (soma == numero){
//                     return true;
//                 }else {
//                     return false;
//                 }
//             }
//
//         //        e) Implemente uma função que determina se um número (passado por argumento) é triangular, a função
//         //        deve retornar true se triangular ou false se não triangular (Um número triangular é um número que pode
//         //                ser representado pela soma de números inteiros consecutivos. Exemplo: 6 = 1+2+3 ou 15=1+2+3+4+5)
//         /**
//          * Função que determina se um número (passado por argumento) é triangular
//          * @param numero - número introduzido pelo utilizador
//          * @return - True se numero é triangular || False se numero nao triangular
//          */
//         public static boolean Triangular(int numero){
//             int soma = 0;
//             for (int index = 0; soma < numero; index++) {
//                 soma = soma + index;
//             }
//             if (soma == numero) {
//                 return true;
//             } else {
//                 return false;
//             }
//         }
//     }
// }
