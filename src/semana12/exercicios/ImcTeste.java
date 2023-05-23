package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ImcTeste {

    @Test public void testIMC(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(70, 1.7);

        double imc = pessoateste.calcularImc();

        assertEquals(24.221453287197235, imc);
    }

    @Test public void testFaixa1(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(70, 1.7);

        String imc = pessoateste.getFaixa();

        assertEquals("Peso Normal ", imc);
    }

    @Test public void testFaixa2(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(80, 1.7);

        String imc = pessoateste.getFaixa();

        assertEquals("Excesso de peso", imc);
    }

    @Test public void testFaixa3(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(90, 1.7);

        String imc = pessoateste.getFaixa();

        assertEquals("Obsedidade 1 ", imc);
    }

    @Test public void testFaixa4(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(110, 1.7);

        String imc = pessoateste.getFaixa();

        assertEquals("Obsedidade 2 ", imc);
    }

    @Test public void testFaixa5(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(170, 1.7);

        String imc = pessoateste.getFaixa();

        assertEquals("Obsedidade 3", imc);
    }

    @Test public void testSituacao1(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(70, 1.7);

        String imc = pessoateste.getSituacao();

        assertEquals("NORMAL", imc);
    }

    @Test public void testSituacao2(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(80, 1.7);

        String imc = pessoateste.getSituacao();

        assertEquals("PERDER", imc);
    }

    @Test public void testSituacao3(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(40, 1.7);

        String imc = pessoateste.getSituacao();

        assertEquals("GANHAR", imc);
    }

    
}
