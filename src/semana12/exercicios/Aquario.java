package semana12.exercicios;

public class Aquario {
    public double comprimento;
    public double altura;
    public double largura;
    public double tempDesejada;
    public double tempAmbiente;


    public Aquario(double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double todos){
        this.comprimento = todos;
        this.altura = todos;
        this.largura = todos;
    }

    public Aquario(double comprimento, double altura, double largura, double tempDesejada, double tempAmbiente){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.tempAmbiente = tempAmbiente;
        this.tempDesejada = tempDesejada;
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

