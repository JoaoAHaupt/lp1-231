package semana04.exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner scannerDoProduto = new Scanner(System.in);
        System.out.println("Valor bruto do produto: ");
        float precoDaCompra = scannerDoProduto.nextFloat();

        float precoFinal = 0;
        int descontoProduto = 0;

        if ( 10 <= precoDaCompra && precoDaCompra <= 99.99){ 
            descontoProduto = 5;
        }
        else if ( 100 <= precoDaCompra && precoDaCompra <= 499.99){ 
            descontoProduto = 10;
        }
        else if ( 500 <= precoDaCompra){ 
            descontoProduto = 15;
        }
        else{
            precoFinal = precoDaCompra;
            descontoProduto = 0;
        }

        precoFinal = precoDaCompra - ((precoDaCompra * descontoProduto) / 100);

        System.out.println("Preço que deve ser pago é de: R$" + precoFinal + "     " + descontoProduto + "% de desconto");
        scannerDoProduto.close();
    } 
}
