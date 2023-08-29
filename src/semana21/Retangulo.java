package semana21;

public class Retangulo implements FiguraGeometrica{

    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return altura * base;
    }

    @Override
    public double calcularPerimetro() {
        return altura * 2 + base * 2;
    }
}
