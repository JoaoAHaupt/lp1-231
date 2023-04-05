package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex02Teste {
    
    @Test
    public void imcPostivo(){
        // AAA
        // Arrange
        double pesoKg = 10.0;
        double alturaM = 2.0;
    
        // Act
        double imc = pesoKg / (alturaM * alturaM);
    
        //Assert
        assertEquals(2.5 , imc);   
    }

    @Test
    public void imcPesoNegativo(){
        // AAA
        // Arrange
        double pesoKg = -10.0; //negativo
        double alturaM = 2.0;
    
        // Act
        double imc = pesoKg / (alturaM * alturaM);
    
        //Assert
        assertEquals(-2.5 , imc);   
    }

    @Test
    public void imcAlturaNegativo(){
        // AAA
        // Arrange
        double pesoKg = 10.0;
        double alturaM = -2.0; //negativo
    
        // Act
        double imc = pesoKg / (alturaM * alturaM);
    
        //Assert
        assertEquals(2.5 , imc);   
    }

    @Test
    public void imcNegativo(){
        // AAA
        // Arrange
        double pesoKg = -10.0; //negativo
        double alturaM = -2.0; //negativo
    
        // Act
        double imc = pesoKg / (alturaM * alturaM);
    
        //Assert
        assertEquals(-2.5 , imc);  
    }



    @Test
    public void pesoModPostivo(){
        // AAA
        // Arrange
        double pesoKg = 10.0;
        double pesoIdeal = 2.0;
    
        // Act
        double pesoMod = pesoKg - pesoIdeal;
    
        //Assert
        assertEquals(8 , pesoMod);   
    }

    @Test
    public void pesoModPesoNegativo(){
        // AAA
        // Arrange
        double pesoKg = -10.0; //negativo
        double pesoIdeal = 2.0;
    
        // Act
        double pesoMod = pesoKg - pesoIdeal;
    
        //Assert
        assertEquals(-12 , pesoMod);   
    }

    @Test
    public void pesoModPesoIdealNegativo(){
        // AAA
        // Arrange
        double pesoKg = 10.0;
        double pesoIdeal = -2.0;//negativo
    
        // Act
        double pesoMod = pesoKg - pesoIdeal;
    
        //Assert
        assertEquals(12 , pesoMod);   
    }

    @Test
    public void pesoModlNegativo(){
        // AAA
        // Arrange
        double pesoKg = -10.0; //negativo
        double pesoIdeal = -2.0;//negativo
    
        // Act
        double pesoMod = pesoKg - pesoIdeal;
    
        //Assert
        assertEquals(-8 , pesoMod);   
    }




}