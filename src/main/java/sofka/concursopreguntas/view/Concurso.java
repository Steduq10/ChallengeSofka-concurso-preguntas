package sofka.concursopreguntas.view;

import sofka.concursopreguntas.business.AccesoDatosImpl;
import sofka.concursopreguntas.business.IAccedoDatos;
import sofka.concursopreguntas.domain.category.Categoria1;
import sofka.concursopreguntas.domain.category.Categoria2;
import sofka.concursopreguntas.exceptions.AccesoDatosEx;

import java.util.Scanner;

public class Concurso {
   // private static IAccedoDatos iAccedoDatos;

   // public Concurso(IAccedoDatos iAccedoDatos) {
    //    this.iAccedoDatos = iAccedoDatos;
   // }

    public static void main(String[] args) throws AccesoDatosEx {
        System.out.println("BIENVENIDOS AL CONCURSO DE PREGUNTAS");
        var opcion = -1;
        AccesoDatosImpl datos = new AccesoDatosImpl();
        var nombreArchivo = "C:\\historial.txt";
        //Concurso concurso = new Concurso(iAccedoDatos);


        String nombre;
        String pregunta;
        String resultado;
        String premio;


        while (opcion != 0) {
            System.out.println("MENÚ\n" +
                    "1. Iniciar juego\n" +
                    "2. Salir del juego\n" +
                    "3. Historial");

            //System.out.println("Ingrese la opción: ");
            Scanner input = new Scanner(System.in);
            opcion = Integer.parseInt(input.nextLine());
            System.out.println("Inicio switch" + opcion);

            switch (opcion) {
                case 1:
                    System.out.println("Entro al caso 1");
                    datos.crearArchivo(nombreArchivo);
                    System.out.println("Ingrese nombre: ");
                    nombre = input.nextLine();
                    System.out.println("Responda las siguientes preguntas marcando A,B,C o D dependiendo de la respuesta que usted considere correcta:");
                    Categoria1 categoria1 = new Categoria1();
                    categoria1.resultado();
                    //if (categoria1.correcto()){
                    //Categoria2
                    break;
                case 2:
                    System.out.println("Nos vemos pronto");
                    break;
            }


        }

    }







}



