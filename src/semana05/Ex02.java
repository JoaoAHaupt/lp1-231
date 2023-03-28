package semana05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu peso em kilogramas: ");
        double pesoKg = sc.nextDouble();
        
        System.out.println("Insira sua latura em metros: ");
        double alturaM = sc.nextDouble();

        double imc = pesoKg / (alturaM * alturaM);




        if( imc >= 18.5 && imc <= 24.9){
            System.out.println("peso Normal ");

        }
        else if( imc >= 25 && imc <= 29.9){
            System.out.println("Excesso de peso");
        }
        else if( imc >= 30 && imc <= 34.9){
            System.out.println("Obsedidade 1 ");
        }
        else if( imc >= 35 && imc <= 39.9){
            System.out.println("Obsedidade 2 ");
        }
        else if( imc >= 40){
            System.out.println("Obsedidade 3");
        }
        else{
            System.out.println("Baixo peso ");
        }

        double pesoIdeal = (18.5 *(alturaM * alturaM));
        double pesoMod = pesoKg - pesoIdeal;

        if( imc >= 18.5 && imc <= 24.9){
            System.out.println("Seu peso está perfeito!");
        }
        else if (imc >= 25){
            System.out.println("Seu peso ideal é de " + (pesoIdeal) + " precisa ganhar " + (pesoMod) + "Kg");
        }
        else if (imc < 18){
            System.out.println("Seu peso ideal é de " + (pesoIdeal) + " precisa ganhar " + (-pesoMod) + "Kg");
        }

        sc.close();
    }
}
