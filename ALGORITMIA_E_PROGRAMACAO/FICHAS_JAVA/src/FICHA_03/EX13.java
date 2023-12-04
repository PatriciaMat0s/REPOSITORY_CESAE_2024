//   13. Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência está em ordem crescente.

// import java.util.Scanner;

// public class EX13 {
//     public static void main(String[] args) {
// //
// //        //Inicializar o scanner:
//         Scanner input = new Scanner(System.in);
// ////
// //        // vou declarar e inicializar as variaveis e pedir o numero de ciclos:
//         int num, cont, limInf, limSup;
//         cont = 0; //cuidado
//         int numAntes;
//         int numsCresc;
//         numsCresc = 0;
// //
//         System.out.print("Quantos números deseja introduzir? ");
//         limSup = input.nextInt();
// //
//         System.out.print("Introduza um número inteiro: ");
//         numAntes= input.nextInt();
// //
//         while (cont < limSup-1) {
// //
//             System.out.print("Introduza um número inteiro: ");
//             num = input.nextInt();
// //
//             if (num > numAntes) { //nao if cont+1>cont é sempre verdade duuuh
//                 numsCresc = numsCresc + 1;}

//             numAntes = num;
//             cont++;
//         }
// //        System.out.println(limSup);
// //        System.out.println(numsCresc);


//   //VERIFICAR SE É SEMPRE CRESCENTE
//         // ATENCAO: NUMERO DE COMPARAÇOES (DOIS A DOIS NUMEROS) = NUMERO DE NUMEROS (IGUAL AO DE CICLOS) - 1;
//             //numsCresc == limSup-1:

//         if (numsCresc == limSup-1) {
//             System.out.print("Sequência está em ordem crescente!");
//         } else {
//             System.out.print("Sequência está em ordem NÃO crescente.");
//         }
//     }
// }