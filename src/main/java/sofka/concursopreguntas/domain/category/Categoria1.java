package sofka.concursopreguntas.domain.category;

import sofka.concursopreguntas.domain.Ronda;

import java.util.Scanner;

public class Categoria1 {
    private String respuesta;




    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String resultado() {
        String resultado = "";
        this.respuesta = Ronda.Ronda();
        if (respuesta.contains("MySQL")) {
            System.out.println(respuesta);
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
        else if (respuesta.contains("Una")) {
            System.out.println(respuesta);
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
        }
        else if (respuesta.contains("Qué")) {
            System.out.println(respuesta);
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
        }
        else if (respuesta.contains("Un")) {
            System.out.println(respuesta);
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
        else if (respuesta.contains("Cuando")) {
            System.out.println(respuesta);
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
        }

            return resultado;
    }

    public boolean correcto() {
        String result = resultado();
        if (result.contains("Respuesta correcta")){
            return true;
        }
        return false;

    }
}