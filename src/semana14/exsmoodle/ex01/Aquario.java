package semana14.exsmoodle.ex01;

public class Aquario {
    
    double comprimento;
    double altura;
    double largura;
    double tempDesejada;
    double tempAmbiente;

    public Aquario(double comprimento, double altura, double largura, double tempDesejada, double tempAmbiente){
        this.setComprimento(comprimento);
        this.setAltura(altura);
        this.setLargura(largura);
        this.setTempDesejada(tempDesejada);
        this.setTempAmbiente(tempAmbiente);
    }

    public void setComprimento(double comprimento){
        if(comprimento <= 0.0){
            throw new RuntimeException("lado inválido! NOOB");
        }
        this.comprimento = comprimento;
    }

    public void setAltura(double altura){
        if(altura <= 0.0){
            throw new RuntimeException("altura inválida! NOOB");
        }
        this.altura = altura;
    }

    public void setLargura(double largura){
        if(largura <= 0.0){
            throw new RuntimeException("largura inválida! NOOB");
        }
        this.largura = largura;
    }

    public void setTempDesejada(double tempDesejada){
        if(tempDesejada <= 0.0){
            throw new RuntimeException("temperatura inválida! NOOB");
        }
        this.tempDesejada = tempDesejada;
    }

    public void setTempAmbiente(double tempAmbiente){
        if(tempAmbiente <= 0.0){
            throw new RuntimeException("temperatura inválida! NOOB");
        }
        this.tempAmbiente = tempAmbiente;
    }

    public double getComprimento(){
        return comprimento;
    }
    
    public double getLargura(){
        return largura;
    }
            
    public double getAltura(){
        return altura;
    }
    
    public double getTempAmbiente(){
        return tempAmbiente;
    }
    
    public double getTempDesejada(){
        return tempDesejada;
    }
    


    public double calcularVolume(){
        return ((comprimento * altura * largura) / 1000);
     }
    public double calcularPotenciaDoTermostato(){
        return ((comprimento * altura * largura) / 1000) * 0.05 * (tempDesejada - tempAmbiente);
    }
    public double calcularQuantidadeLitrosFiltro(){
        return ((comprimento * altura * largura) / 1000) * 2;
    }

}
