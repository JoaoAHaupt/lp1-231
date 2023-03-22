package semana04.exercicios;

import java.util.Scanner;


public class exercicio4 {
    public static void main(String[] args){
        Scanner scannerIdentificador = new Scanner(System.in);
        String arrayIdentificador = scannerIdentificador.nextLine(); 
        String[] texto = arrayIdentificador.split("");
        int certo = 0;
        int erro = 0;

        if(texto.length < 6){ 
            if (texto[0] == "B"){
                certo = certo + 1;
            }

            if (texto[1] == "R"){
            certo = certo + 1;
            } 
            if (texto[6] == "X"){
                certo = certo + 1;
            } 

            for(int i = 2; i < 6; i++){
                    int textoInt = Integer.parseInt(texto[i]);
                    if (textoInt > 0 || textoInt < 9){
                        certo ++;
                }
                System.out.println(certo);
            }
        }
        else{ 
            System.out.println("invalido");
            erro = erro + 1;
        }
        if(certo >= 7 ){
            System.out.println("valido");
        }
       if (erro == 1){
            assert true;
        }
        else
        System.out.println("invalido");


        System.out.println(certo);
        scannerIdentificador.close();
    }
}