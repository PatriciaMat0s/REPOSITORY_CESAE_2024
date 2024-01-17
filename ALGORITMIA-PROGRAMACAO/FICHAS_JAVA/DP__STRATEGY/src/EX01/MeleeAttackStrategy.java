package EX01;

// Implementações concretas de Strategy
public class MeleeAttackStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Realizar ataque corpo a corpo!");
        // Lógica específica para ataque corpo a corpo
    }
}