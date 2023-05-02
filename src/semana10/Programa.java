package semana10;

import java.util.Scanner;

// Classe
class Retangulo {
    // Atributos
    double base;
    double altura;


    // Métodos

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base * altura);
    }
}

// Classe
class Quadrado {
    // Atributos
    double lado;


    // Métodos

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return lado * 4;
    }
}

// Classe
class Circulo {
    // Atributos
    double raio;


    // Métodos

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI  * raio;
    }
}



public class Programa {
    public static void main(String[] args) {
        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);

        System.out.println(areaRet1);
        System.out.println(perimetroRet1);


        // Objeto é uma instância de uma classe

        Retangulo ret1 = new Retangulo();        
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30;
        ret2.altura = 100;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        Circulo cir1 = new Circulo();
        cir1.raio = 30;
        System.out.println(cir1.calcularArea());
        System.out.println(cir1.calcularPerimetro());

        Quadrado quad1 = new Quadrado();
        quad1.lado = 30;
        System.out.println(quad1.calcularArea());
        System.out.println(quad1.calcularPerimetro());



    }


    //area = base * altura
    public static double calcularArea(double base, double altura){
        return base * altura;
    }
    
    //perimetro  = 2 *(lado + altura)
    public static double calcularPerimetro(double base, double altura){
        return 2 * (base + altura);
    }
}
