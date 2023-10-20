package FICHA__01;

import java.util.Scanner;

public class EX08 {

    public static void main(String[] args) {

// vou instanciar o Scanner (obrigatório):
        Scanner input = new Scanner(System.in);

// vou declarar variaveis:
        int horas, mins, segs;


// vou pedir os numeros e lê-los:

        System.out.print("INTRODUZA OS MINUTOS DE DURAÇÃO DA 1ª MUSICA DO ÁLBUM: ");
        mins=input.nextInt();
        System.out.print("INTRODUZA OS SEGUNDOS DE DURAÇÃO DA 1ª MUSICA DO ÁLBUM: ");
        segs=input.nextInt();

        System.out.print("INTRODUZA OS MINUTOS DE DURAÇÃO DA 2ª MUSICA DO ÁLBUM: ");
        mins=mins+input.nextInt();
        System.out.print("INTRODUZA OS SEGUNDOS DE DURAÇÃO DA 2ª MUSICA DO ÁLBUM: ");
        segs=segs+input.nextInt();

        System.out.print("INTRODUZA OS MINUTOS DE DURAÇÃO DA 3ª MUSICA DO ÁLBUM: ");
        mins=mins+input.nextInt();
        System.out.print("INTRODUZA OS SEGUNDOS DE DURAÇÃO DA 3ª MUSICA DO ÁLBUM: ");
        segs=segs+input.nextInt();

        System.out.print("INTRODUZA OS MINUTOS DE DURAÇÃO DA 4ª MUSICA DO ÁLBUM: ");
        mins=mins+input.nextInt();
        System.out.print("INTRODUZA OS SEGUNDOS DE DURAÇÃO DA 4ª MUSICA DO ÁLBUM: ");
        segs=segs+input.nextInt();

        System.out.print("INTRODUZA OS MINUTOS DE DURAÇÃO DA 5ª MUSICA DO ÁLBUM: ");
        mins=mins+input.nextInt();
        System.out.print("INTRODUZA OS SEGUNDOS DE DURAÇÃO DA 5ª MUSICA DO ÁLBUM: ");
        segs=segs+input.nextInt();

//        horas = mins / 60;
//        mins = mins % 60;
//
//        mins = mins + segs / 60;
//        segs = segs % 60;

        segs = mins*60 + segs; //calcula o total de segs
        horas = segs/3600; //dividendo, visto que é um int

        mins = (segs % 3600) / 60;
        segs = (segs % 3600) % 60;


// vou retornar as operaçoes pretendidas:
        System.out.println(" O ÁLBUM TEM A DURAÇÃO TOTAL DE " +horas+  "HORAS, " +mins+ "MINUTOS e " +segs+ "SEGUNDOS.");

    }

}
