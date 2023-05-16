package semana12;

public class Circulo {
    //Atributos
     double raio;

    //Construtor
    public Circulo(double raio){
        this.raio = raio;
    }

    //Métodos
    public double calcularArea(){
        return Math.PI * (raio*raio); 
    } 

    public double calcularPerimetro(){
        return  2 * Math.PI * raio; 
    } 
}
