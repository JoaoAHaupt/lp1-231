package semana17.vendedor;

public class Main {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Lepo", 10.00, 12.00);
        VendedorFixo v2 = new VendedorFixo("Bobonildo", 2.50, 5.00, 126.43);

        System.out.println(v1.obterSalario());
        System.out.println(v2.obterSalario());
    }
}

