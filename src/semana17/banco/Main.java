package semana17.banco;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> conta = List.of();
        LocalDate localDate5 = LocalDate.of(2018, 07, 22);
        LocalDate localDate6 = LocalDate.of(2019, 12, 27);



        Correntista co1 = new Correntista(1, "Baesa",conta);
        Conta c1 = new Conta(1,localDate5, 234.34, 12, co1);
        ContaPoupanca cpo = new ContaPoupanca(2, localDate5, 5000.23, 13, co1, localDate5);
        ContaCorrente cc = new ContaCorrente(3, localDate5, 600, 1, co1, 20);

        Empresa izzy = new Empresa("1923123012", "Izzy print");
        ContaSalario cs = new ContaSalario(4, localDate6, 5000, 4, co1, izzy);


        System.out.println(c1.getNumero());
        System.out.println(c1.getDataAbertura());
        System.out.println(c1.getSaldo());
        c1.sacar(23);
        System.out.println(c1.getSaldo());
        System.out.println(c1.getCorrentista());

        System.out.println(cpo.getAniversario());
        System.out.println();

        System.out.println(cs.getEmpresa());

        cc.sacar(23);
    }
}
