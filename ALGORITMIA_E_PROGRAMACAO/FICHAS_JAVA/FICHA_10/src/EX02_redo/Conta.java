package EX02_redo;

public class Conta {

    private String numConta;
    private String titularConta;
    private int anoAbertura=2023;
    private double margemEmprestimo=.9;

    private double saldoConta;
    private double valorDivida;

    public Conta(String numConta, String titularConta, double saldoConta, double valorDivida) {
        this.numConta = numConta;
        this.titularConta = titularConta;
        this.saldoConta = saldoConta;
        this.valorDivida = valorDivida;
    }

    public boolean pedirEmprestimo(double valorEmprestimoPedido){
        if (valorEmprestimoPedido < this.margemEmprestimo*this.saldoConta && this.valorDivida == 0){
            this.saldoConta += valorEmprestimoPedido;
            this.valorDivida = valorEmprestimoPedido;
            System.out.println(">>> Emprestimo concedido, yay u go");
            return true;
        }else{
            System.out.println(">>> Emprestimo nao concedido... fu uuhuhu");
            return false;
        }
    }


    public void exibirDetalhes(){
        System.out.println(this.numConta+" | "+this.titularConta);
        System.out.println("Saldo atual: "+this.saldoConta+ "Eur");
        System.out.println("Valor em dívida: "+ this.valorDivida+ "Eur");
    }
}
