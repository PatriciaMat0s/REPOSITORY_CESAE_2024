//6. Crie uma classe sem atributos chamada "Calculadora".
//        a. Elabore métodos para adição, subtração, multiplicação e divisão (Estes métodos devem receber dois números reais como argumentos e, no final, apresentar na consola o resultado).
//        b. Crie um objeto dessa classe e use os métodos para realizar algumas operações matemáticas (deve realizar, pelo menos, uma de cada)

package EX06;

public class Calculadora {

    public Calculadora() {}

    public void adicao(double num1, double num2) {
        System.out.println(num1+num2);
    }

    public void subtracao(double num1, double num2) {
        System.out.println(num1-num2);
    }

    public void multiplicacao(double num1, double num2) {
        System.out.println(num1*num2);
    }

    public void divisao(double num1, double num2) {
        System.out.println(num1/num2);
    }

}
