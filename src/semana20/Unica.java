package semana20;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Unica extends Questao{

    public Unica(int numero, String enunciado, int resposta,  Map<Integer, String> alternativas) {
        super( numero, enunciado, resposta, alternativas);
    }

    @Override
    public void mostrarPergunta(){
        System.out.println(getEnunciado() + " " + getAlternativas());
    }
}
