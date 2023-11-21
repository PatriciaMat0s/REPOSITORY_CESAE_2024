
//11.     • Crie um programa para fazer a gestão de contas bancárias:
//        • Crie uma classe chamada "Conta" com os seguintes atributos: número da conta,               saldo e titular da conta.
//

package EX11;

public class Conta {
    private String numConta;

    private String titular;
    private double saldo=0;

    public Conta(String numConta, String titular) {
        this.numConta = numConta;
        this.titular = titular;
    }

    public Conta(String numConta, String joaquina_meirelles, int i) {
    }

////        • Crie um método “transferência” que tenha como parâmetros o valor a transferir              e a conta de destinatário.
////        • Crie os métodos depositar (aumentar saldo), levantar (diminuir saldo) e mostrarSaldo. (Exemplo de mostarSaldo: “Saldo da conta 12345: 950 EUR”)
////        • O método depositar deve receber um valor como parâmetro e atualizar o saldo.
////        • O método levantar deve receber um valor como parâmetro e verificar se é possível realizar a operação, considerando o saldo. De seguida, atualiza o saldo se a transação for possível.
////        • O método mostrarSaldo deve exibir na consola o saldo atual da conta.


    public void transferir(Conta contaDestino, double valorATransferir){
        ////////o método recebe um objecto da classe como argumento!
        if (this.saldo >= valorATransferir)  {
            this.saldo = this.saldo - valorATransferir;
            contaDestino.saldo = contaDestino.saldo + valorATransferir;}
        else{
            System.out.println("Saldo disponível "+this.saldo+" insuficiente para realizar a transferencia pretendida");
        }

    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void levantar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("O seu saldo nao lhe permite o levantamento");

        }
    }

    public void mostrarSaldo(){
        System.out.println("Numero Conta: "+this.numConta+"\t| Titular: "+this.titular+"\t| Saldo: "+this.saldo+"Euros");

    }

}
