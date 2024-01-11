package Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.*;

class test_AdministradorController {

    AdministradorController administradorController;

    @BeforeEach
    void SetUp() throws FileNotFoundException {
        administradorController = new AdministradorController("src/test/resources/test__minimercado.csv");
    }


    @Test
    void testProdutoMaisVendido(){
        assertEquals("Alimentacao", administradorController.produtoMaisVendido().getTipoProduto());
        assertEquals("Cerveja Super Bock", administradorController.produtoMaisVendido().getProduto());
    }

}