package sofka.concursopreguntas.domain.category;

import sofka.concursopreguntas.domain.Ronda;

import java.util.Scanner;

public class Categoria5 {
    private String pregunta;

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String resultado() {
        String resultado = "";
        this.pregunta = Ronda.Ronda5();
        if (pregunta.contains("Para una clase")) {
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
        else if (pregunta.contains("¿Qué es una")) {
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
        else if (pregunta.contains("Que lenguajes")) {
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
                    resultado = "Respuesta incorrecta";
                    break;
                case "D":
                    resultado = "Respuesta correcta";
                    break;

                default:
                    resultado = "Vuelve a intentarlo";
                    break;
            }
            return resultado;
        }
        else if (pregunta.contains("El servidor")) {
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
        }
        else if (pregunta.contains("Qué es un algoritmo")) {
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

        return resultado;

    }

}
