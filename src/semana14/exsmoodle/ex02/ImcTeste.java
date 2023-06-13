package semana14.exsmoodle.ex02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import semana11.Pessoa;

public class ImcTeste {

    @Test public void testIMC(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(70, 1.7);
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(70);
        double imc = pessoateste.calcularImc();

        assertEquals(24.221453287197235, imc);
    }
    @Test public void testIMCErrorAltura(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(70, 1.7);

        assertThrows(RuntimeException.class, () -> {
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(-70);
        pessoateste.calcularImc();
    });
    }
    @Test public void testIMCErrorPeso(){
        // AAA
        // Arrange
       Imc pessoateste = new Imc(70, 1.7);

        assertThrows(RuntimeException.class, () -> {
        pessoateste.setAltura(-1.7);
        pessoateste.setPeso(70);
        pessoateste.calcularImc();
    });
    }

    @Test public void testFaixa1(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(70);
        String imc = pessoateste.getFaixa();

        assertEquals("Peso Normal ", imc);
    }

    @Test public void testFaixa2(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(80);
        String imc = pessoateste.getFaixa();

        assertEquals("Excesso de peso", imc);
    }

    @Test public void testFaixa3(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(90);
        String imc = pessoateste.getFaixa();

        assertEquals("Obsedidade 1 ", imc);
    }

    @Test public void testFaixa4(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(110);
        String imc = pessoateste.getFaixa();

        assertEquals("Obsedidade 2 ", imc);
    }

    @Test public void testFaixa5(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(170);
        String imc = pessoateste.getFaixa();

        assertEquals("Obsedidade 3", imc);
    }

    
    @Test public void testFaixaErroPeso(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        assertThrows(RuntimeException.class, () -> {
        pessoateste.setAltura(1.7);
        pessoateste.setPeso(-70);
        pessoateste.getFaixa();
    });
    }

        @Test public void testFaixaErroAltura(){
        // AAA
        // Arrange
        Imc pessoateste = new Imc(70, 1.7);
        assertThrows(RuntimeException.class, () -> {
        pessoateste.setAltura(-1.7);
        pessoateste.setPeso(70);
        pessoateste.getFaixa();
    });
    }

    @Test
    public void testaGetFaixa2() {

        Imc pessoateste = new Imc(10, 1.7);

        String faixa = pessoateste.getSituacao();

        assertEquals("NORMAL", faixa);
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