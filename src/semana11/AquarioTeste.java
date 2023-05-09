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
    public void testCalcularVolume2NegLaAl(){
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
    public void testCalcularVolume2NegLaAl(){
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
    public void testCalcularVdasolume2Neg(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario();
        aquatest.comprimento = -10;
        aquatest.largura = 10;
        aquatest.altura = -10;

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }





}

