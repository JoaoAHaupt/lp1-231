package semana11;

public class Aquario {
    
    double comprimento;
    double altura;
    double largura;
    double tempDesejada;
    double tempAmbiente;


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
