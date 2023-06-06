package semana14.exemplo;

public class Retangulo {
    //Atributos
     public double base;
     public double altura;

    //Construtor
    public Retangulo(double base, double altura){
        this.setAltura(altura);
        this.setBase(base);
    }

    //Métodos
    public double calcularArea(){
        return base * altura; 
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }



    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        if(altura <= 0.0){
            throw new RuntimeException("lado inválido! NOOB");
        }
        this.altura = altura;
    }

    public void setBase(double base){
        if(base <= 0.0){
            throw new RuntimeException("lado inválido! NOOB");
        }
        this.base = base;
    }
}
