package semana14.exemplo;

public class Circulo {
    //Atributos
     double raio;

    //Construtor
    public Circulo(double raio){
        this.setRaio(raio);
    }

    //Métodos
    public double calcularArea(){
        return Math.PI * (raio*raio); 
    } 

    public double calcularPerimetro(){
        return  2 * Math.PI * raio; 
    } 

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        if(raio <= 0.0){
            throw new RuntimeException("lado inválido! NOOB");
        }
        this.raio = raio;
    }
}
