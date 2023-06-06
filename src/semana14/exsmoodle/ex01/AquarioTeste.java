package semana14.exsmoodle.ex01;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AquarioTeste {
    @Test
    public void testCalcularVolume(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
        aquatest.setComprimento(10);
        aquatest.setLargura(10);
        aquatest.setAltura(10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVolumeNegativo(){
        // AAA
        assertThrows(RuntimeException.class, () -> {
            Aquario aquatest = new Aquario(10,10,10,36,35);
            aquatest.setComprimento(-10);
            aquatest.setLargura(-10);
        });

    }
    
    @Test
    public void testCalcularVolumeComprNeg(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
        aquatest.setComprimento(-10);
        aquatest.setLargura(10);
        aquatest.setAltura(10);

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }

    @Test
    public void testCalcularVolumeNegLa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
       aquatest.setComprimento(10);
       aquatest.setLargura(-10);
       aquatest.setAltura(10);

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }

    @Test
    public void testCalcularVolumeNegAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
        aquatest.setAltura(10);
        aquatest.setLargura(10);
        aquatest.setAltura(-10);

        double volume = aquatest.calcularVolume();

        assertEquals(-1, volume);
    }

    @Test
    public void testCalcularVdasolume2NegCompAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
        aquatest.setAltura(-10);
        aquatest.setLargura(10);
        aquatest.setAltura(-10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVdasolume2NegCompLa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
        aquatest.setComprimento(-10);
        aquatest.setLargura(-10);
       aquatest.setAltura(10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVdasolume2NegLaAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
       aquatest.setComprimento(10);
        aquatest.setLargura(-10);
        aquatest.setAltura(-10);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularPortencia(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
       aquatest.setComprimento(10);
        aquatest.setLargura(10);
       aquatest.setAltura(10);
        aquatest.setTempAmbiente(100);
       aquatest.setTempDesejada(30);

        double potencia = aquatest.calcularPotenciaDoTermostato();

        assertEquals(-3.5, potencia);
    }

    @Test
    public void testCalcularPortenciaNegativa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10,10,10,36,35);
       aquatest.setComprimento(10);
        aquatest.setLargura(10);
       aquatest.setAltura(10);
       aquatest.setTempAmbiente(-100);
       aquatest.setTempDesejada(30);

        double potencia = aquatest.calcularPotenciaDoTermostato();

        assertEquals(-3.5, potencia);
    }

}

