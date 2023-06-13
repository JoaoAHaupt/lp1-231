package semana14.exsmoodle.ex01;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AquarioTeste {
    @Test
    public void testCalcularVolume(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        aquatest.setComprimento(10.0);
        aquatest.setLargura(10.0);
        aquatest.setAltura(10.0);

        double volume = aquatest.calcularVolume();

        assertEquals(1, volume);
    }

    @Test
    public void testCalcularVolumeNegativo(){
        // AAA
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
            aquatest.setComprimento(-10.0);
            aquatest.setLargura(-10.0);
        });

    }
    
    @Test
    public void testCalcularVolumeComprNeg(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
        aquatest.setComprimento(-10.0);
        aquatest.setLargura(10.0);
        aquatest.setAltura(10.0);
    });
    }

    @Test
    public void testCalcularVolumeNegLa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
        aquatest.setComprimento(10.0);
        aquatest.setLargura(-10.0);
        aquatest.setAltura(10.0);
    });

    }

    @Test
    public void testCalcularVolumeNegAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
        aquatest.setAltura(10.0);
        aquatest.setLargura(10.0);
        aquatest.setAltura(-10.0);

    });
    }

    @Test
    public void testCalcularVdasolume2NegCompAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
        aquatest.setAltura(-10.0);
        aquatest.setLargura(10.0);
        aquatest.setAltura(-10.0);
            
    });
    }

    @Test
    public void testCalcularVdasolume2NegCompLa(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
        aquatest.setComprimento(-10.0);
        aquatest.setLargura(-10.0);
        aquatest.setAltura(10.0);
    });
    }

    @Test
    public void testCalcularVdasolume2NegLaAl(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10);
        assertThrows(RuntimeException.class, () -> {
        aquatest.setComprimento(10.0);
        aquatest.setLargura(-10.0);
        aquatest.setAltura(-10.0);

        
    });
    }

    @Test
    public void testCalcularPortencia(){
        // AAA
        // Arrange
        Aquario aquatest  = new Aquario(10.0,10.0,10.0, 10.0, 10.0);

        double potencia = aquatest.calcularPotenciaDoTermostato();
        assertThrows(RuntimeException.class, () -> {
        aquatest.setComprimento(10.0);
        aquatest.setLargura(-10.0);
        aquatest.setAltura(-10.0);

        
    });
    }

}

