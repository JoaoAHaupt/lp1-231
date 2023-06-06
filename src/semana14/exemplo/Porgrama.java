package semana14.exemplo;

public class Porgrama {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        Retangulo retangulo = new Retangulo(10, 10);
        Circulo circulo = new Circulo(10.0);
        //quadrado.lado() = 5.0; nao consigo usar pq é private
        quadrado.setLado(100);

        System.out.println(quadrado.getLado());
        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());

        System.out.println("");

        retangulo.setAltura(100);
        retangulo.setBase(100);



        System.out.println(retangulo.getBase());
        System.out.println(retangulo.getAltura());
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());

        System.out.println("");
        
        circulo.setRaio(3.14);

        System.out.println(circulo.getRaio());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        System.out.println("");




    }
    
}
