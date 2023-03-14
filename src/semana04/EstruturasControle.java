package semana04;

import java.security.Key;

public class EstruturasControle {
    public static void main(String[] args){
        // if 

        var idade = 19;
        final int MAIORIDADE = 18;
       
        // Pesquisar sobre strings magicas
        if (idade >= MAIORIDADE){
            System.out.println("BORA TOMA UMA???");

        }
        
        var ligado = true;
        if (ligado){
            System.out.println("Está ligado");
        } else{
            System.out.println("Está desligado");
        }

        // switch
        // char, byte, short, int
        // literal string
        // enum

        int n =3;
        switch (n) {
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;
            case 3:
                System.out.println("Número 3");
                break;            
            default:
                System.out.println("Não identificado");
                break;
        }

        // loops
        // for, foreach, while, do while

        int contador = 0;

        while(contador > 3){
            System.out.println("Ligado!");
            contador++;
        }
        contador=0;
        do{
         System.out.println("Do while ligado!!!!");
         contador++;
        } while (contador < 3);

        /*i=0; 0<3; !
          i=1; 0<3; !
          i=2; 0<3; !
          i=3; 0=3; _
        */ 
        
        for (int i = 0; i < 3; i++){
            System.out.println("For ligado!!!!! uwu");
        }


        //String nome = "João";

        // Array
        // armazena mais de um elemento
        // acesso via index - numero inteiro
        // tamanho fixo no momento da criação 

        // nomes = [____, ____, ____]
        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Marta";
        nomes[2] = "Marcia";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        //
        for (String nome : nomes){
            System.out.println(nome);
        }

        int[] numeros = {1, 3, 5, 0};
        for (int numero : numeros){
            System.out.println(numero);
        }

    }    
}
