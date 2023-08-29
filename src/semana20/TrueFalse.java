package semana20;
import java.util.Map;
import java.util.Scanner;

public class TrueFalse extends Questao {

    public TrueFalse(int numero, String enunciado, int resposta, Map<Integer, String> alternativas) {
        super(numero, enunciado, resposta, alternativas);
    }

    public void mostrarPergunta(){
        System.out.println(getEnunciado() + " " + getAlternativas());
    }

    public void isCorrect() {
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        sc.nextLine();
        if (escolha == getResposta()) {
            System.out.println("ACertou");
        } else {
            System.out.println("errou");
        }

    }
}
