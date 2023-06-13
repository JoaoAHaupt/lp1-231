package semana14.exsmoodle.ex03;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BancoTeste {
    @Test
    public void testeSacar(){
        // AAA
        // Arrange
        Banco user_teste  = new Banco(1,"Nastenka",10.0);
        user_teste.setCodigo(10);
        user_teste.setCorrentista("Raskolnikov");
        user_teste.setSaldo(10.0);

        double testeSacar = user_teste.sacar(1);

        assertEquals(9, testeSacar);
    }

        @Test
        public void testeSacarErro(){
        // AAA
        Banco user_teste  = new Banco(1,"Nastenka",10.0);
        assertThrows(RuntimeException.class, () -> {
            
            user_teste.setCodigo(10);
            user_teste.setCorrentista("Raskolnikov");
            user_teste.setSaldo(10.0);
            user_teste.sacar(11110);
        });
        }

        @Test
        public void testeTransferencia(){
        // AAA
        // Arrange
        Banco user_teste  = new Banco(1,"Nastenka",10.0);
        user_teste.setCodigo(10);
        user_teste.setCorrentista("Raskolnikov");
        user_teste.setSaldo(10.0);

        double testeTransferencia = user_teste.trasnferencia(1);

        assertEquals(9, testeTransferencia);
    }
        @Test
        public void testeTransferenciaErro(){
        // AAA
        Banco user_teste  = new Banco(1,"Nastenka",10.0);
        assertThrows(RuntimeException.class, () -> {
            
            user_teste.setCodigo(10);
            user_teste.setCorrentista("Raskolnikov");
            user_teste.setSaldo(10.0);
            user_teste.trasnferencia(11110);
        });
        }

        @Test
        public void testeDeoposito(){
        // AAA
        // Arrange
        Banco user_teste  = new Banco(1,"Nastenka",10.0);
        user_teste.setCodigo(10);
        user_teste.setCorrentista("Raskolnikov");
        user_teste.setSaldo(10.0);

        double testeDeoposito = user_teste.depositar(1);

        assertEquals(11, testeDeoposito);
        }
        
        @Test
        public void testeDeopositoErro(){
        // AAA
        Banco user_teste  = new Banco(1,"Nastenka",10.0);
        assertThrows(RuntimeException.class, () -> {
            
            user_teste.setCodigo(10);
            user_teste.setCorrentista("Raskolnikov");
            user_teste.setSaldo(10.0);
            user_teste.depositar(-11110);
        });
        }


    
}
