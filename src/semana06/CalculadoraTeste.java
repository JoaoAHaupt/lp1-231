package semana06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculadoraTeste {
    
    @Test
    public void somaDoisNumerosPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double soma = Calculadora.somar(n1, n2);

        //Assert
        assertEquals(12.0 , soma);
    }

    @Test
    public void somaUmNumeroPositivoENegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double soma = Calculadora.somar(n1, n2);

        //Assert
        assertEquals(8.0 , soma);
    }

    @Test
    public void somaDoisNumerosNegativos(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = -2.0;

        // Act
        double soma = Calculadora.somar(n1, n2);

        //Assert
        assertEquals(-12.0 , soma);
    }

    @Test
    public void subtrairDoisNumerosPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(8.0 , subtracao);
    }

    @Test
    public void subtrairUmPositivoENegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(12.0 , subtracao);
    }

    @Test
    public void subtrairUmNegativoEPositivo(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = 2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(-12.0 , subtracao);
    }

    @Test
    public void subtrairDoisnegativos(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = -2.0;

        // Act
        double subtracao = Calculadora.subtrair(n1, n2);

        //Assert
        assertEquals(-8.0 , subtracao);
    }

    @Test
    public void multiplicarDoisPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double multiplicacao = Calculadora.multiplicar(n1, n2);

        //Assert
        assertEquals(20.0 , multiplicacao);
    }
    
    @Test
    public void multiplicarUmPositivoENegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double multiplicacao = Calculadora.multiplicar(n1, n2);

        //Assert
        assertEquals(-20.0 , multiplicacao);
    }

    @Test
    public void multiplicarDoisNegativos(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = -2.0;

        // Act
        double multiplicacao = Calculadora.multiplicar(n1, n2);

        //Assert
        assertEquals(20.0 , multiplicacao);
    }

    @Test
    public void dividirDoisPositivos(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        assertEquals(5.0 , divisao);
    }

    @Test
    public void dividirUmPositivoENegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = -2.0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        assertEquals(-5.0 , divisao);
    }

    @Test
    public void dividirUmPostivoENegativo(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        assertEquals(5.0 , divisao);
    }

    @Test
    public void dividirUmNegativoEPositivo(){
        // AAA
        // Arrange
        double n1 = -10.0;
        double n2 = 2.0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        assertEquals(-5.0 , divisao);
    }

    @Test
    public void dividirUmNumeroPorZero(){
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 0;

        // Act
        double divisao = Calculadora.dividir(n1, n2);

        //Assert
        double inf = Double.POSITIVE_INFINITY;
        assertEquals(inf , divisao);
    }
}