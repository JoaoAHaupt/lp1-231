package semana20;
import java.util.Map;
import java.util.List;


public class Multiplas extends Questao {
    private List<Integer> respostas;

    public Multiplas(int numero, String enunciado, List<Integer> respostas, Map<Integer, String> alternativas) {
        super(numero, enunciado, respostas.get(0), alternativas);
        this.respostas = respostas;
    }

    public List<Integer> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<Integer> respostas) {
        this.respostas = respostas;
    }

    @Override
    public void mostrarPergunta(){
        System.out.println(getEnunciado() + "(OBS: DIGITE O NÚMERO DAS ALTERNATIVAS COM ESPAÇOS ENTRE ELES) \n " + getAlternativas());
    }
    @Override
    public boolean isCorrect(List<Integer> escolha) {
        int certo = 0;
        for(int i = 0; i < escolha.size(); i++){
            if(respostas.contains(escolha.get(i))){
                certo++;
            }
        }
        if(certo == respostas.size()){
            return true;
        }
        return false;
    }


}

