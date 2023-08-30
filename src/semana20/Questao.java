package semana20;

import java.util.List;
import java.util.Map;

public abstract class Questao {

    private int numero;
    private String enunciado;
    private int resposta;
    private Map<Integer, String> alternativas;

    public Questao(int numero, String enunciado, int resposta, Map<Integer, String> alternativas) {
        this.resposta = resposta;
        this.numero = numero;
        this.enunciado = enunciado;
        this.alternativas = alternativas;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Map getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Map alternativas) {
        this.alternativas = alternativas;
    }


    public void mostrarPergunta(){}




    public boolean isCorrect(List<Integer> escolha) {
        for(int i = 0; i < escolha.size(); i++){
            if (escolha.get(i) == getResposta()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
