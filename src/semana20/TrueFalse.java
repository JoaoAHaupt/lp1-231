package semana20;
import java.util.Map;

public class TrueFalse extends Questao {

    public TrueFalse(int numero, String enunciado, int resposta, Map<Integer, String> alternativas) {
        super(numero, enunciado, resposta, alternativas);
    }

    @Override
    public void mostrarPergunta(){
        System.out.println(getEnunciado() + " " + getAlternativas());
    }

    @Override
    public boolean isCorrect() {
        return false;
    }

    @Override
    public boolean isCorrect(int escolha) {

        if (escolha == getResposta()) {
            return true;
        } else {
            return false;
        }

    }
}
