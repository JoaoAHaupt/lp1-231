package semana20;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Verdadeiro ou falso
        Map<Integer, String> alternativas1 = new HashMap<>();
        alternativas1.put(1, "Verdadeiro");
        alternativas1.put(2, "Falso");
        TrueFalse qtf1 = new TrueFalse(1, "Eu sou lindo?", 1, alternativas1);



        // Única escolha
        Map<Integer, String> alternativas2 = new HashMap<>();
        alternativas2.put(1, "Platão");
        alternativas2.put(2, "Galileu Galilei ");
        alternativas2.put(3, "Descartes");
        alternativas2.put(4, "Socrates");
        Unica questaoUnica1 = new Unica(2, "De quem é a famosa frase “Penso, logo existo”?", 3 ,alternativas2);


        // Multipla escolha
        List<Integer> escolhas1 = new ArrayList<>();
        escolhas1.add(1);
        escolhas1.add(3);

        Map<Integer, String> alternativas3 = new HashMap<>();
        alternativas3.put(1,"Bom dia 1");
        alternativas3.put(2,"Como vai?");
        alternativas3.put(3, "Chama pae");
        Multiplas multiplasquestoes = new Multiplas(3, "Qual mais adequado?", escolhas1, alternativas3);


        List<Map<Integer, String>> questoes = new ArrayList<>();
        questoes.add(alternativas3);


        Prova p1 = new Prova("Prova Bimestral", 0,questoes);
        p1.provasQuestoes();

    }
}