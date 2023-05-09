package semana11;

public class Pessoa {

    double peso;
    double altura;
    
    double imc = peso / (altura * altura);


    public double calcularImc(){
        return peso / (altura * altura);
    }

    public String getFaixa(){


        if( peso / (altura * altura) >= 18.5 && peso / (altura * altura) <= 24.9){
            return "peso Normal ";
        }
        else if( peso / (altura * altura) >= 25 && peso / (altura * altura) <= 29.9){
            return "Excesso de peso";
        }
        else if( peso / (altura * altura) >= 30 && peso / (altura * altura) <= 34.9){
            return "Obsedidade 1 ";
        }
        else if( peso / (altura * altura) >= 35 && peso / (altura * altura) <= 39.9){
            return "Obsedidade 2 ";
        }
        else{
            return "";
        }
    }

    public String getSituacao(){

        if( peso / (altura * altura) >= 18.5 && peso / (altura * altura)<= 24.9){
            return "NORMAL";
        }
        else if (peso / (altura * altura) >= 25){
            return "PERDER";
        }
        else if (peso / (altura * altura) < 18){
           return "GANHAR";
        }
        else {
            return "";
        }

    }


    
}
