package semana20;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Prova {

    private String nome;
    private int pontuacao;
    private List<Questao> questoes;

    public Prova(String nome, int pontuacao, List<Questao> questoes) {
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

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }

    public int provasQuestoes(){
        int nota = 0;
        for (int i = 0; i < getQuestoes().size(); i++) {
            if(getQuestoes() instanceof Multiplas){
                ((Multiplas) getQuestoes()).mostrarPergunta();
                ((Multiplas) getQuestoes()).isCorrect();
                if(((Multiplas) getQuestoes()).isCorrect() == true){
                    nota++;
                }
            }
            else if(getQuestoes() instanceof TrueFalse){
                ((TrueFalse) getQuestoes()).mostrarPergunta();
                ((TrueFalse) getQuestoes()).isCorrect();
            }
        }

        return nota;
    }
}

