//        1. Escreva um programa onde cria uma classe chamada
//        "Pessoa" com um atributo de nome, idade e altura.
//        Crie duas instâncias da classe "Pessoa", defina os seus atributos               usando o construtor e imprima seu nome, idade e altura

package EX01;

public class Main {

        public static void main(String[] args) {

            //Vou instanciar duas pessoas:
            Pessoa pato = new Pessoa("Patrick", 48, 1.8);
            Pessoa pata = new Pessoa("Patrícia", 38, 1.6);
            // pato, pata são instâncias OU objectos
            // começam sempre com letra minuscula

            // Imprimir dados da Pessoa (classe) pato;
            System.out.println("Pato: "+pato.getNome()); //nao é pato.idade  !!!
            System.out.println("Pato: "+pato.getIdade());
            System.out.println("Pato: "+pato.getAltura());

            // Imprimir dados da Pessoa (classe) pata;
            System.out.println("Pato: "+pata.getNome());
            System.out.println("Pato - idade: "+pata.getIdade());
            System.out.println("Pato - altura: "+pata.getAltura());

            // Mudar o conteudo dos atributos das instâncias da classe:
            //Primeiro fazer o set do novo atributo
            pata.setIdade(300);
            System.out.println("Pato nova idade: "+pata.getIdade());



        }
}
