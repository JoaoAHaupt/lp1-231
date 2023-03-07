package semana03;

import java.util.Scanner;

public class introducao {
    public static void main(String[] args) {
        // Comentário de linha 
        
        /*
         * Comentário de linhaS
         */
        
        // Tipos Primitivos

        /* INTEIROS
        byte, short, int, long*/
        byte n1 = 100; // 1 byte - -128 a 127
        short n2 = 3000; // 2 bytes - -32768 a 32767
        int n3 = 4000000; // 4 bytes - 2 bilhoes
        long n4 = 32323232L; // 8 bytes

         /* PONTO FLUTUANTE
        float, double*/
        float nota1 = 9.5f; // 4 bytes
        double nota2 = 9.5f;// 8 bytes

        // CHAR
        char letra = 'A';

        //BOOLEAN
        boolean ligado = true;
        boolean desligado = false;

        //String
        String palavra = "Olá, mundo";
         System.out.println(palavra);
         System.out.println(palavra.toLowerCase());
         System.out.println(palavra.toUpperCase());

         // Variaveis e constantes
         // tipo nome = valor;
         // tipo nome
         // nome =valor

         short idade = 20;

         short idade2;
         idade2 = 30;  // péssima pratica de programação

         // Java 10 - inferência de tipo
         var sobrenome = "Vasco";
         var idade3 = 25;

         IllegalArgumentException ex = new IllegalArgumentException();
         var ex2 = new IllegalAccessException();

         // Constatnes
         final double TESTE = 30.4;

         // Entrada e saida
         // Instancia um objeto scanner para receber
         // dados do usuário
         Scanner sc  = new Scanner(System.in);
         
         System.out.println("Entre com seu nome");
         String nomeinformado = sc.nextLine();

         System.out.println("Entre com sua idade");
         short idadeinformado = sc.nextShort();

         System.out.println(nomeinformado + " " + idadeinformado);

         // fecha o objeto Scanner liberando
         // os recursos alocados
        sc.close();

    }
}

