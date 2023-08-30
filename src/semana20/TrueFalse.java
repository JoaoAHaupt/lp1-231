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

}
