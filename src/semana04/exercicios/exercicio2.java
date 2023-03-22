package semana04.exercicios;

import java.util.Scanner;

public class exercicio2 
{
    public static void main(String[] args) 
    {
        Scanner scannerMedia = new Scanner(System.in);
        int[] numerosMedia = new int[3];
        int media = 0;

        for(int i = 0; i < 3; i++){ 
            System.out.println("Insira o " + (i+1)+"° numero");
            numerosMedia[i] = scannerMedia.nextInt();
        }

        for(int i = 0; i < 3; i++){
            media = (media + numerosMedia[i]);
        }

        System.out.println("A média dos números inseridos é: " + media/3);
        scannerMedia.close();
    }
}