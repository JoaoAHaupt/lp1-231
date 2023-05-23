package semana12.exercicios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BancoTeste {

    @Test
    public void testBanco1(){
        // AAA
        // Arrange
        Banco usuarioteste  = new Banco(12, "Testador" ,0);
        double testedeposito= usuarioteste.depositar(100);
        String testesaque = usuarioteste.sacar(1000);
        String testetrasnferencia = usuarioteste.sacar(1000);


        assertEquals(100, testedeposito);
        assertEquals("Saldo invalido",testesaque);
        assertEquals("Saldo invalido", testetrasnferencia);
    }

    @Test
    public void testBanco2(){
        // AAA
        // Arrange
        Banco usuarioteste  = new Banco(12, "Testador" ,100000);
        double testedeposito= usuarioteste.depositar(100);
        String testesaque = usuarioteste.sacar(1000);
        String testetrasnferencia = usuarioteste.sacar(1000);


        assertEquals(100100, testedeposito);
        assertEquals("99100.0",testesaque);
        assertEquals("98100.0", testetrasnferencia);
    }
    
}
