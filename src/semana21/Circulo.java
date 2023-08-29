package semana21;

public class Circulo implements FiguraGeometrica{
    private double raio;

    public  Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI*raio;
    }


}
