package semana12.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AquarioTeste {
    @Test
    public void testCalcularVolume(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(12, 14 ,12);
        double volume = aquatest.calcularVolume();

        assertEquals(2.016, volume);
    }

    @Test
    public void testCalcularVolumeNegativo(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(-10, -10 ,-10);
        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }
    
     @Test
    public void testCalcularVolumeComprNeg22(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(-10, -10 ,10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVolumeComprNeg(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(-10, 10 ,-10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVolumeComprNeg2(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(-10, 10 ,-10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

}






