package semana10;


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
