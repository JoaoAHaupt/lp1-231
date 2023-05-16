package semana11;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AquarioTeste {
    @Test
    public void testCalcularVolume(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = 10;
        aquatest.largura = 10;
        aquatest.altura = 10;

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVolumeNegativo(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = -10;
        aquatest.largura = -10;
        aquatest.altura = -10;

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }
    
    @Test
    public void testCalcularVolumeComprNeg(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = -10;
        aquatest.largura = 10;
        aquatest.altura = 10;

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }

    @Test
    public void testCalcularVolumeNegLa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = 10;
        aquatest.largura = -10;
        aquatest.altura = 10;

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }

    @Test
    public void testCalcularVolumeNegAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = 10;
        aquatest.largura = 10;
        aquatest.altura = -10;

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }

    @Test
    public void testCalcularVdasolume2NegCompAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = -10;
        aquatest.largura = 10;
        aquatest.altura = -10;

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVdasolume2NegCompLa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = -10;
        aquatest.largura = -10;
        aquatest.altura = 10;

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVdasolume2NegLaAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = 10;
        aquatest.largura = -10;
        aquatest.altura = -10;

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularPortencia(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = 10;
        aquatest.largura = 10;
        aquatest.altura = 10;
        aquatest.tempDesejada = 100;
        aquatest.tempAmbiente = 30;

        double potencia = aquatest.calcularPotenciaDoTermostato();

        assertEquals(3.5, potencia);
    }

    @Test
    public void testCalcularPortenciaNegativa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = 10;
        aquatest.largura = 10;
        aquatest.altura = 10;
        aquatest.tempDesejada = -100;
        aquatest.tempAmbiente = -30;

        double potencia = aquatest.calcularPotenciaDoTermostato();

        assertEquals(-3.5, potencia);
    }

}

