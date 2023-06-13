package semana14.exsmoodle.ex03;
 
public class BancoMain{   
    public static void main(String[] args) {
        Banco user_1 = new Banco(0, null, 0);
        user_1.setSaldo(1000);
        user_1.setCodigo(1);
        user_1.setCorrentista("Nastenka");

        System.out.println(user_1.getCorrentista());
        System.out.println(user_1.getCodigo());
        System.out.println(user_1.getSaldo());

        System.out.println(user_1.sacar(10000));

        System.out.println();
    }
}