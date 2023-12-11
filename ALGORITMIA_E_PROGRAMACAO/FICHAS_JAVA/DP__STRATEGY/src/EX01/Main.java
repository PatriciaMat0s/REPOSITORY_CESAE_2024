
//No método main, criamos instâncias de Unit para cada tipo de unidade desejado, passando a estratégia de
//        ataque apropriada, e chamamos o método performAttack para realizar o ataque. A mensagem indicando o tipo
//        de ataque é impressa no console.
//        Com essa implementação, podemos adicionar novas estratégias de ataque facilmente, basta criar uma classe
//        que implemente AttackStrategy e fornecer a implementação apropriada para o comportamento de ataque

package EX01;

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Unit meleeUnit = new Unit(new MeleeAttackStrategy());
        meleeUnit.performAttack();

        Unit rangedUnit = new Unit(new RangedAttackStrategy());
        rangedUnit.performAttack();

        Unit magicUnit = new Unit(new MagicAttackStrategy());
        magicUnit.performAttack();
    }
}
