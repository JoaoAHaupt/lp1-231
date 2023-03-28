package semana06;
import java.util.Scanner;


public class Metodos {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        
        // Chamando o método imprimir palavra
        imprimirPalavra("Bom dia");

        double somar = Calculadora.somar(5, 6);
        System.out.println(somar);

        System.out.println(Calculadora.somar(4, 5));

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números ");
        double numC1 = sc.nextDouble();
        double numC2 = sc.nextDouble();
        // não precisamos usar import pra chamar um metodo de outro arquivo pq estão no mesmo pacote
        System.out.println(Calculadora.somar(numC1, numC2));
        System.out.println(Calculadora.subtrair(numC1, numC2));
        System.out.println(Calculadora.multiplicar(numC1, numC2));
        System.out.println(Calculadora.dividir(numC1, numC2));



 
    }




    // Assinatura do método
    // public - acesso em qualquer parte do projeto
    // static - método atrelado a calsse (não precisa criar um objeto)
    // void - tipo de retorno (sem retorno)
    // imprimirPalavra - nome do método
    // String palavra - parâmetro (pode ter zero ou)
    // Definindo o método
    public static void imprimirPalavra (String palavra) {
        // void não retorna nada = return 0
        System.out.println(palavra.toUpperCase());
    }

}