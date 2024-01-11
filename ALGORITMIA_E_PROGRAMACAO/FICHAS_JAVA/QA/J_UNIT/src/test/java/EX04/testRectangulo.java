package EX04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class testRectangulo{

        Rectangulo retangulo1;
        Rectangulo retangulo2;

        @BeforeEach
        void setUp() {
            retangulo1 = new Rectangulo(10, 10);
            retangulo2 = new Rectangulo(5, 20);
        }

    @Test
    void testCalcularPerimetro() {
        assertEquals(40, retangulo1.calcularPerimetro());
        assertEquals(50, retangulo2.calcularPerimetro());
    }

    @Test
    void testCalcularArea() {
        assertEquals(100, retangulo1.calcularArea());
        assertEquals(100, retangulo2.calcularArea());
    }

//        @Test
//        void getLargura() {
//            assertEquals(10, retangulo1.getLargura());
//            assertEquals(5, retangulo2.getLargura());}

//        @Test
//        void getAltura() {
//            assertEquals(10, retangulo1.getAltura());
//            assertEquals(20, retangulo2.getAltura());}




    }

