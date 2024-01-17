//        Escreva um programa onde cria uma classe chamada "Cao" com um nome (String), um atributo de raça
//(String) e um atributo latido (String) que por defeito deve ser “Au au au”.
//a. Deve conter um método de ladrar (imprime na consola um latido).
//b. Crie três instâncias da classe "Cão", defina os seus atributos (nome e raça) usando o construtor.
//c. Modifique o latido usando os métodos setter e invoque o método latir.

//Lembrete: Por boa prática, todos os atributos devem estar incluídos no construtor de forma a serem
//        inicializados, mas nem todos os atributos precisam de ser recebidos como argumentos do método
//        construtor (Podem ser inicializados com valores padrão da nossa escolha).

package EX02;

public class Main {

        public static void main(String[] args) {

            //Vou instanciar dois caes e definir os seus atributos usando o construtor
            Cao luna = new Cao("Luna", "canishe");
            Cao pluto = new Cao("Mauzao", "doberman");
            Cao pantufa = new Cao("Zigzag", "rafeiro");


            luna.Ladrar();
            pluto.Ladrar();
            pantufa.Ladrar();


            // Mudar o conteudo dos atributos das instâncias da classe:

            luna.setLadrar("BHEU BHEU BHEU");
            pluto.setLadrar("plu plu plu");
            pantufa.setLadrar("pant pant pant");

            luna.Ladrar();
            pluto.Ladrar();
            pantufa.Ladrar();


        }
}
