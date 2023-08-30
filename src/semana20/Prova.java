package semana20;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Prova {

    private String nome;

    private List<Questao> questoes;

    public Prova(String nome, List<Questao> questoes) {
        this.nome = nome;
        this.questoes = questoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public List<Questao> getQuestoes() {
        return questoes;
    }


    public int verificarRespostas(Map<Questao, List<Integer>> escolhas) {
        int nota = 0;

        for (Questao questao : questoes) {
            questao.mostrarPergunta();
            questao.getAlternativas();
            List<Integer> escolha = escolhas.get(questao);
            if (escolha != null && questao.isCorrect(escolha)) {
                nota++;
            }
        }
        return nota;
    }


}

