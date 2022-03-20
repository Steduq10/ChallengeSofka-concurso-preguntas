package sofka.concursopreguntas.domain;

import java.util.List;
import java.util.Random;

public class Ronda {
    private static Random PreguntaAleatoria = new Random();

    public static String  Ronda(){
        List<String> listaPregunta = Pregunta.preguntas1;
        return listaPregunta.get(PreguntaAleatoria.nextInt(listaPregunta.size()));
    }

    public static void main(String[] args) {
        System.out.println(Ronda.Ronda());
    }
}
