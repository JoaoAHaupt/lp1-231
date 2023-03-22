package semana04.exercicios;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int num = scanner.nextInt();
        int numMenos = num-1;
        int numMais = num +1;

        System.out.println("Número escolhido: " + num + " | Sucessor: " + numMais + " | Antecessor: " + numMenos);

        scanner.close();
    }
}