package semana20;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Prova {

    private String nome;
    private int pontuacao;
    private List<Map<Integer, String>> questoes;

    public Prova(String nome, int pontuacao, List<Map<Integer, String>> questoes) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.questoes = questoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public List<Map<Integer, String>> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Map<Integer, String>> questoes) {
        this.questoes = questoes;
    }

    public void provasQuestoes(){
        for (int i = 0; i < getQuestoes().size(); i++) {
            Object obj = getQuestoes().get(i);
            if(obj instanceof Multiplas){
                ((Multiplas) getQuestoes().get(i)).mostrarPergunta();
                ((Multiplas) getQuestoes().get(i)).isCorrect();
            }
            else if(obj instanceof TrueFalse){
                ((TrueFalse) getQuestoes().get(i)).mostrarPergunta();
                ((TrueFalse) getQuestoes().get(i)).isCorrect();
            }
            else {
                ((Unica) getQuestoes().get(i)).mostrarPergunta();
                ((Unica) getQuestoes().get(i)).isCorrect();
            }

        }
    }
}

