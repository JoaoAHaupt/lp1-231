package semana11;

public class ProgramaSemana11 {
    public static void main(String[] args) {

    Aquario aqua1 = new Aquario();
    aqua1.largura = 145;
    aqua1.comprimento = 10;
    aqua1.altura = 102;
    aqua1.tempDesejada = 30;
    aqua1.tempAmbiente = 3;

    System.out.println(aqua1.calcularVolume());
    System.out.println(aqua1.calcularPotenciaDoTermostato());
    System.out.println(aqua1.calcularQuantidadeLitrosFiltro());
    }
   
}
