package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ImcTeste {

    @Test public void testIMC(){
        // AAA
        // Arrange
        Pessoa pessoatest  = new Pessoa();

        pessoatest.altura = 1.7;
        pessoatest.peso = 70;
        double imc = pessoatest.calcularImc();

        assertEquals(24.221453287197235, imc);
    }

    @Test public void testIMCNegativo(){
        // AAA
        // Arrange
        Pessoa pessoatest  = new Pessoa();

        pessoatest.altura = 1.7;
        pessoatest.peso = -70;
        double imc = pessoatest.calcularImc();

        assertEquals(-24.221453287197235, imc);
    }
    
}
