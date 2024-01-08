package EX03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


class AnimalTest {
//    Animal tobias = new Animal("Tobias", Alimento.FRUTAS);
//    Animal trex = new Animal("T-Rex", Alimento.CARNE);

    Animal tobias;
    Animal trex;

    @BeforeEach
    void setUp() {
        tobias = new Animal("Tobias", Alimento.FRUTAS);
        trex = new Animal("T-rex", Alimento.CARNE);
    }

    @Test
    void testNome() {
        assertEquals("Tobias", tobias.getNome());
        assertEquals("T-Rex", trex.getNome());
    }

    @Test
    void testGetTipoAlimentacao() {
        assertEquals("FRUTAS", tobias.getTipoAlimentacao());
        assertEquals("CARNE", trex.getTipoAlimentacao());
    }

    @Test
    void testEstaComFome() {
        assertTrue(tobias.estaComFome());
        assertTrue(trex.estaComFome());
    }

    @Test
    void testComer() {
        assertTrue(tobias.estaComFome());
        assertTrue(trex.estaComFome());


            // Tobias come o que quer
            tobias.comer(Alimento.FRUTAS);

            // Fido não come (não gosta)
            trex.comer(Alimento.PEIXE);

            // Tobias deixa de ter fome
            assertFalse(tobias.estaComFome());

            // Fido continua com fome
            assertTrue(trex.estaComFome());

            // Fico come o que quer
            trex.comer(Alimento.CARNE);

            // Fido deixa de ter fome
            assertFalse(trex.estaComFome());
        }


    }
