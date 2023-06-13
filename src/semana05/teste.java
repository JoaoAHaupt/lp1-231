package semana05;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[3];
        for(int i = 0; i <4; i++){
            double num = sc.nextDouble();
            numeros[i] = num;
        }
        System.out.println(numeros[2]);
    }
}

