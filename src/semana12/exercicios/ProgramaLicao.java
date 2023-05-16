package semana12.exercicios;

public class ProgramaLicao {
    public static void main(String[] args) {
        Aquario aqua = new Aquario(12, 13, 19);
        Aquario aqua2 = new Aquario(16);
        Aquario aqua3 = new Aquario(12, 13, 19, 30, 16);


        System.out.println(aqua.calcularVolume());
        System.out.println(aqua2.calcularVolume());
        System.out.println(aqua3.calcularPotenciaDoTermostato());
        System.out.println(aqua.calcularQuantidadeLitrosFiltro());

        Imc pessoa = new Imc(1100, 1.70);

        System.out.println(pessoa.calcularImc());
        System.out.println(pessoa.getFaixa());
    }
}
