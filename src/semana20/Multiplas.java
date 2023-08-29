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

    public void mostrarPergunta(){
        System.out.println(getEnunciado() + "(OBS: DIGITE O NÚMERO DAS ALTERNATIVAS COM ESPAÇOS ENTRE ELES) \n " + getAlternativas());
    }


    public void isCorrect() {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

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
            System.out.println("ACertou");
        } else {
            System.out.println("errou");
        }

    }

}

