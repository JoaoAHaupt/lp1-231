package semana12;


public class Porgrama {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        quadrado.lado = 5;


        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);

        Circulo c1 = new Circulo(10);



        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());


    }
    
}
