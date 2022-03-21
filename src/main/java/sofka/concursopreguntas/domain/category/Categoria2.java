package sofka.concursopreguntas.domain.category;

import sofka.concursopreguntas.domain.Ronda;

import java.util.Scanner;

public class Categoria2 {
    private String pregunta;

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String resultado() {
        String resultado = "";
        this.pregunta = Ronda.Ronda2();
        if (pregunta.contains("Cuando hablamos de java")) {
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
            return resultado;
        }
        else if (pregunta.contains("Con java")) {
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
            return resultado;
        }
        else if (pregunta.contains("nodejs")) {
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
                    resultado = "Respuesta correcta";
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
            return resultado;
        }
        else if (pregunta.contains("Cuando hablamos de un backend")) {
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
            return resultado;
        }
        else if (pregunta.contains("Un modelo")) {
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
                    resultado = "Respuesta correcta";
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
            return resultado;
        }

        return resultado;

    }

}
