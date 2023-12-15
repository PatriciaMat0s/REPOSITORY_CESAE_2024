
//10. Crie uma classe Funcionário que tenha os atributos nome, salário e departamento, e os métodos aumentarSalario e exibirDados.
//        a. O método aumentarSalario deve receber um valor percentual (número real) como parâmetro e atualizar o salário de acordo.
//        b. O método exibirDados deve exibir na consola o nome, salário e departamento do funcionário.
//        c. No método main, crie um objeto dessa classe e invoque os métodos para aumentar o salário em 10% e exibir os dados do funcionário

package EX10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void aumentarSalario(double percentagem) {
        //this.salario = this.salario + this.salario * (percentagem / 100);
        this.salario = this.salario*(1+(percentagem/100));
    }

//    public void setSalario(double salario) {
//        this.salario = salario;
//    }

    public void exibirDados() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Salario: "+this.salario);
        System.out.println("Departamento: "+this.departamento);
    }


}
