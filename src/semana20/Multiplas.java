package semana20;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


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
    public boolean isCorrect(String ) {


        String[] inputValues = inputLine.split(" ");
        int[] intArray = new int[inputValues.length];

        for (int i = 0; i < inputValues.length; i++) {
            intArray[i] = Integer.parseInt(inputValues[i]);
        }

        int certas = 0;
        int erradas = 0;

        for (int i = 0; i < intArray.length; i++) {

            if (getRespostas().contains(intArray[i])) {
                certas++;
            } else {
                erradas++;
            }

            scanner.close();
        }
        if (certas > erradas) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean isCorrect(int escolha) {
        return false;
    }

}

