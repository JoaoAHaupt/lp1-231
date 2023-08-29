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


    public boolean isCorrect() {
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();

        if (escolha == getResposta()) {  // Assuming getResposta() returns an integer
            return true;
        } else {
            return false;
        }
    }
}
