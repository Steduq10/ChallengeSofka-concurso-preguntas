package sofka.concursopreguntas.domain.category;

import sofka.concursopreguntas.domain.Ronda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Categoria1 {
    private String pregunta;




    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String resultado() {
        String resultado = "";
        this.pregunta = Ronda.Ronda1();
        if (pregunta.contains("MySQL")) {
            System.out.println(pregunta);
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta correcta";
                    break;
                case "B":
                    resultado = "Respuesta incorrecta";
                    break;
                case "C":
                    resultado = "Respuesta incorrecta";
                    break;
                case "D":
                    resultado = "Respuesta incorrecta";
                    break;
                case "F":
                    resultado = "Gracias por participar";
                    break;


                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }

            return  resultado ;

        }
        else if (pregunta.contains("Una abstracción es")) {
            System.out.println(pregunta);
            System.out.println("Si quieres retirarte marca F");
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta incorrecta";
                    break;
                case "B":
                    resultado = "Respuesta incorrecta";
                    break;
                case "C":
                    resultado = "Respuesta incorrecta";
                    break;
                case "D":
                    resultado = "Respuesta correcta";
                    break;
                case "F":
                    resultado = "Gracias por participar";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }
        else if (pregunta.contains("Qué ciclo de control")) {
            System.out.println(pregunta);
            System.out.println("Si quieres retirarte marca F");
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta incorrecta";
                    break;
                case "B":
                    resultado = "Respuesta incorrecta";
                    break;
                case "C":
                    resultado = "Respuesta correcta";
                    break;
                case "D":
                    resultado = "Respuesta incorrecta";
                    break;
                case "F":
                    resultado = "Gracias por participar";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return  resultado;
        }
        else if (pregunta.contains("Un IDE conocido es")) {
            System.out.println(pregunta);
            System.out.println("Si quieres retirarte marca F");
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta correcta";
                    break;
                case "B":
                    resultado = "Respuesta incorrecta";
                    break;
                case "C":
                    resultado = "Respuesta incorrecta";
                    break;
                case "D":
                    resultado = "Respuesta incorrecta";
                    break;
                case "F":
                    resultado = "Gracias por participar";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return  resultado;
        }
        else if (pregunta.contains("Cuando hablamos de python")) {
            System.out.println(pregunta);
            System.out.println("Si quieres retirarte marca F");
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta incorrecta";
                    break;
                case "B":
                    resultado = "Respuesta incorrecta";
                    break;
                case "C":
                    resultado = "Respuesta correcta";

                    break;
                case "D":
                    resultado = "Respuesta incorrecta";
                    break;
                case "F":
                    resultado = "Gracias por participar";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return  resultado;
        }

        return  resultado;
    }


}
