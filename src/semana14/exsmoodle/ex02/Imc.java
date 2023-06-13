package semana14.exsmoodle.ex02;

public class Imc {

    public double peso;
    public double altura;
    
    public double imc = peso / (altura * altura);

    public Imc(double peso, double altura){
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public void setAltura(double altura){
        if(altura <= 0.0){
            throw new RuntimeException("altura inválida! NOOB");
        }
        this.altura = altura;
    }

    public void setPeso(double peso){
        if(peso <= 0.0){
            throw new RuntimeException("Peso inválido! NOOB");
        }
        this.peso = peso;
    }

    public double getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    public double calcularImc(){
        return peso / (altura * altura);
    }

    public String getFaixa(){
        double imc = calcularImc();

        if( imc >= 18.5 && imc <= 24.9){
            return "Peso Normal ";
        }
        else if( imc >= 25 && imc <= 29.9){
            return "Excesso de peso";
        }
        else if( imc >= 30 && imc <= 34.9){
            return "Obsedidade 1 ";
        }
        else if(imc >= 35 &&imc <= 39.9){
            return "Obsedidade 2 ";
        }
        else{
            return "Obsedidade 3";
        }
    }

    public String getSituacao() {
        double pesoAPerder = peso - (24.9 * (altura / 100.0) * (altura / 100.0));

        if(pesoAPerder < 0) {
            return "GANHAR";

        } else  if(pesoAPerder > 1) {
            return "PERDER";

        } else {
            return "NORMAL";
        }
    }


    
}
