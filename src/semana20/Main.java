package semana20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Verdadeiro ou falso
        Map<Integer, String> alternativas1 = new HashMap<>();
        alternativas1.put(1, "Verdadeiro");
        alternativas1.put(2, "Falso");
        TrueFalse qtf1 = new TrueFalse(1, "Raskolnikov nasceu em São Petesburgo?", 2, alternativas1);



        // Única escolha
        Map<Integer, String> alternativas2 = new HashMap<>();
        alternativas2.put(1, "Platão");
        alternativas2.put(2, "Galileu Galilei ");
        alternativas2.put(3, "Descartes");
        alternativas2.put(4, "Fiodor Dosotieviski");
        Unica questaoUnica1 = new Unica(2, "Qual o autor de Crime e Castigo?", 4 ,alternativas2);


        // Multipla escolha
        List<Integer> escolhas1 = new ArrayList<>();
        escolhas1.add(1);
        escolhas1.add(3);

        Map<Integer, String> alternativas3 = new HashMap<>();
        alternativas3.put(1,"Bom dia 1");
        alternativas3.put(2,"Como vai?");
        alternativas3.put(3, "Chama pae");
        Multiplas multiplasquestoes = new Multiplas(3, "Qual mais adequado?", escolhas1, alternativas3);


        List<Questao> questoes = new ArrayList<>();
        questoes.add(multiplasquestoes);
        questoes.add(questaoUnica1);
        questoes.add(qtf1);

        List<Integer>qtf1resposta = new ArrayList<>();
        qtf1resposta.add(1);

        List<Integer> questaoUnica1Resposta = new ArrayList<>();
        questaoUnica1Resposta.add(4);

        List<Integer> multiplasQuestoesRespostas = new ArrayList<>();
        multiplasQuestoesRespostas.add(1);
        multiplasQuestoesRespostas.add(3);



        Map<Questao, List<Integer>> escolhas = new HashMap<>();
        escolhas.put(qtf1, qtf1resposta);
        escolhas.put(questaoUnica1, questaoUnica1Resposta);
        escolhas.put(multiplasquestoes, multiplasQuestoesRespostas);

        Prova prova = new Prova("Prova sobre Crime e Castigo (livro)", questoes);



        int nota = prova.verificarRespostas(escolhas);
        System.out.println("\nVocê acertou/tirou de nota " + nota + " de " + questoes.size() + " alternativas");

    }
}