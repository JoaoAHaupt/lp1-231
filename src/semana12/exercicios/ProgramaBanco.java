package semana12.exercicios;



public class ProgramaBanco {
    public static void main(String[] args) {
        Banco usuario1 = new Banco(1, "Framboesa", 10);
        System.out.println(usuario1.depositar(1000));
        System.out.println(usuario1.trasnferencia(100));
    }
}

