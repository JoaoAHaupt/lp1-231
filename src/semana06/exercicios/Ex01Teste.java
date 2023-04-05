package semana06.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Ex01Teste {
    

    @Test
    public void volumePostivo(){
        // AAA
        // Arrange
        double altura = 10.0;
        double comprimento = 1;
        double largura = 2.0;

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(0.02 , vol);
    }

    @Test
    public void volumeLarguraNegativa(){
        // AAA
        // Arrange
        double altura = 10.0;
        double comprimento = 1;
        double largura = -2.0; //Negativa

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(-0.02 , vol);
    }
    
    @Test
    public void volumeComprimentoNegativa(){
        // AAA
        // Arrange
        double altura = 10.0;
        double comprimento = -1; //Negativa
        double largura = 2.0; 

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(-0.02 , vol);
    }

    @Test
    public void volumeAlturaNegativa(){
        // AAA
        // Arrange
        double altura = -10.0;//Negativa
        double comprimento = 1; 
        double largura = 2.0; 

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(-0.02 , vol);
    }

    @Test
    public void volumeLarguraEAlturaNegativa(){
        // AAA
        // Arrange
        double altura = -10.0;// negativa
        double comprimento = 1;
        double largura = -2.0; //Negativa

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(0.02 , vol);
    }

    @Test
    public void volumeComprimentoEAlturaNegativa(){
        // AAA
        // Arrange
        double altura = -10.0;// negativa
        double comprimento = -1; //Negativa
        double largura = 2.0; 

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(0.02 , vol);
    }


    
    @Test
    public void volumeLarguraEComprimentoNegativa(){
        // AAA
        // Arrange
        double altura = 10.0;
        double comprimento = -1; //Negativa
        double largura = -2.0; //Negativa

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(0.02 , vol);
    }

    @Test
    public void volumeNegativo(){
        // AAA
        // Arrange
        double altura = -10.0;//Negativa
        double comprimento = -1; //Negativa
        double largura = -2.0; //Negativa

        // Act
        double vol = (comprimento * altura * largura) / 1000;

        //Assert
        assertEquals(-0.02 , vol);
    }






    @Test
    public void potenciaPositivo(){
        // AAA
        // Arrange
        double volume = 10.0;
        double tempDesejada = 2; 
        double tempAmbiente = 1.0; 

        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(0.5 , pont);
    }

    @Test
    public void potenciaVolNegativo(){
        // AAA
        // Arrange
        double volume = -10.0; //Negativa
        double tempDesejada = 2; 
        double tempAmbiente = 1.0; 

        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(-0.5 , pont);
    }

    @Test
    public void potenciaTempdesejadaNegativa(){
        // AAA
        // Arrange
        double volume = 10.0;
        double tempDesejada = -2;  //Negativa
        double tempAmbiente = 1.0; 

        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(-1.5 , pont);
    }

    @Test
    public void potenciaTempambienteNegativa(){
        // AAA
        // Arrange
        double volume = 10.0;
        double tempDesejada = 2; 
        double tempAmbiente = -1.0; //Negativa

        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(1.5 , pont);
    }

    @Test
    public void potenciaVolETempdesejadaNegativa(){
        // AAA
        // Arrange
        double volume = -10.0; //Negativa
        double tempDesejada = -2; //Negativa
        double tempAmbiente = 1.0; 
        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(1.5 , pont);
    }

    @Test
    public void potenciaVolETempambienteNegativa(){
        // AAA
        // Arrange
        double volume = -10.0; //Negativa
        double tempDesejada = 2; 
        double tempAmbiente = -1.0; //Negativa
        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(-1.5 , pont);
    }

    @Test
    public void potenciaTempsNegativas(){
        // AAA
        // Arrange
        double volume = 10.0; 
        double tempDesejada = -2; //Negativa
        double tempAmbiente = -1.0; //Negativa
        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(-0.5 , pont);
    }

    @Test
    public void potenciaNegativa(){
        // AAA
        // Arrange
        double volume = -10.0; //Negativa
        double tempDesejada = -2; //Negativa
        double tempAmbiente = -1.0; //Negativa
        // Act
        double pont = volume * 0.05 * (tempDesejada - tempAmbiente);

        //Assert
        assertEquals(0.5 , pont);
    }



}

