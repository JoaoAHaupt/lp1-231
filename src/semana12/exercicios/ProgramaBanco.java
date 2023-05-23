package semana12.exercicios;



public class ProgramaBanco {
    public static void main(String[] args) {
        Banco usuario1 = new Banco(1, "Framboesa", 0);
        System.out.println(usuario1.depositar(1000));
        System.out.println(usuario1.trasnferencia(500));
        System.out.println(usuario1.sacar(500));
        
    }
}

