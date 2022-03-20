package sofka.concursopreguntas.domain.category;

import sofka.concursopreguntas.domain.Ronda;

import java.util.Scanner;

public class Categoria3 {
    private String pregunta;

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String resultado() {
        String resultado = "";
        this.pregunta = Ronda.Ronda3();
        if (pregunta.contains("Cuando hablamos")) {
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

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }
        else if (pregunta.contains("Que combinaciones")) {
            System.out.println(pregunta);
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

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }
        else if (pregunta.contains("Todas")) {
            System.out.println(pregunta);
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta incorrecta";
                    break;
                case "B":
                    resultado = "Respuesta correcta";
                    break;
                case "C":
                    resultado = "Respuesta incorrecta";
                    break;
                case "D":
                    resultado = "Respuesta incorrecta";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }
        else if (pregunta.contains("Una")) {
            System.out.println(pregunta);
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

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }
        else if (pregunta.contains("Qué tipos")) {
            System.out.println(pregunta);
            System.out.println("¿Su respuesta es?: ");
            Scanner consola = new Scanner(System.in);
            var respuesta = consola.nextLine();
            System.out.println("Su respuesta fue: " + respuesta);
            switch (respuesta) {
                case "A":
                    resultado = "Respuesta incorrecta";
                    break;
                case "B":
                    resultado = "Respuesta correcta";
                    break;
                case "C":
                    resultado = "Respuesta incorrecta";
                    break;
                case "D":
                    resultado = "Respuesta incorrecta";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }

        return resultado;

    }


}
