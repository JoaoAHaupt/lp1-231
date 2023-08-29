package semana20;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Unica extends Questao{

    public Unica(int numero, String enunciado, int resposta,  Map<Integer, String> alternativas) {
        super( numero, enunciado, resposta, alternativas);
    }

    public void mostrarPergunta(){
        System.out.println(getEnunciado() + " " + getAlternativas());
    }


    public void isCorrect() {
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();

        if (escolha == getResposta()) {  // Assuming getResposta() returns an integer
            System.out.println("Correto!");
        } else {
            System.out.println("Resposta incorreta. A alternativa certa era: " + getResposta());
        }
    }
}
