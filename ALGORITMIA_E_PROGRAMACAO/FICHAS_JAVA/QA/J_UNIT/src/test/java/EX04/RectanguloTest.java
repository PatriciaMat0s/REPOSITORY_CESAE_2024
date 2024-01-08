package EX04;

import EX01.Calculator;
import EX03.Alimento;
import EX03.Animal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

class RectanguloTest {

    Rectangulo rectangulo;

    @BeforeEach
    void setUp() {
        this.rectangulo = new Rectangulo();
        Rectangulo rectangulo = new Rectangulo(4,2);

    }

    @Test
    void testCalcularArea() {
//      assertEquals(rectangulo.getAltura() * rectangulo.getLargura(), rectangulo.calcularArea());

    }

    @Test
    void testCalcularPerimetro() {
//        assertEquals(2*rectangulo.getAltura() + 2*rectangulo.getLargura(), rectangulo.calcularPerimetro());
    }




}