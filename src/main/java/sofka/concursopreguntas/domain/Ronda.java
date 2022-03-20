package sofka.concursopreguntas.domain;

import java.util.List;
import java.util.Random;

public class Ronda {
    private static Random PreguntaAleatoria = new Random();

    public static String  Ronda1(){
        List<String> listaPregunta = Pregunta.preguntas1;
        return listaPregunta.get(PreguntaAleatoria.nextInt(listaPregunta.size()));

    }
    public static String  Ronda2(){
        List<String> listaPregunta = Pregunta.preguntas2;
        return listaPregunta.get(PreguntaAleatoria.nextInt(listaPregunta.size()));

    }
    public static String  Ronda3(){
        List<String> listaPregunta = Pregunta.preguntas3;
        return listaPregunta.get(PreguntaAleatoria.nextInt(listaPregunta.size()));

    }

    public static String  Ronda4(){
        List<String> listaPregunta = Pregunta.preguntas4;
        return listaPregunta.get(PreguntaAleatoria.nextInt(listaPregunta.size()));

    }

    public static String  Ronda5(){
        List<String> listaPregunta = Pregunta.preguntas5;
        return listaPregunta.get(PreguntaAleatoria.nextInt(listaPregunta.size()));

    }

}
