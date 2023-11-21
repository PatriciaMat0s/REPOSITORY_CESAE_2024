
////        • No método main, crie um objeto da classe Conta e invoque os métodos para depositar 1000€ e exibir o saldo.
////        • De seguida, invoque o método para levantar 120€ e exiba o saldo.
////        • De seguida, crie mais dois objetos da classe e atribua valores aos seus atributos. De seguida, transfira um valor de uma conta para a outra.
////        • No fim, deve exibir o saldo atual das três contas

package EX11;

public class Main {

    public static void main(String[] args) {

        Conta tuconta = new Conta("123456", "Joaquina Meirelles");

        tuconta.depositar(1000);
        tuconta.levantar(120);
        tuconta.mostrarSaldo();

        Conta miconta = new Conta("000000","Ana Coimbra");
        miconta.depositar(6000);
        miconta.mostrarSaldo();

        Conta miuconta = new Conta("111999", "Tito Zinho");
        miuconta.mostrarSaldo();
        System.out.println();

        miconta.transferir(miuconta, 5999);
        miconta.mostrarSaldo();
        miuconta.mostrarSaldo();
        tuconta.transferir(miuconta, 879);
        tuconta.mostrarSaldo();
        miuconta.mostrarSaldo();

        System.out.println("- Chegou a gato Tito e roubou tudo, só deixou 1Euro em cada conta! ");



    }


}
