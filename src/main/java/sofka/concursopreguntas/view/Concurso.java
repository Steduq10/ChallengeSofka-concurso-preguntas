package sofka.concursopreguntas.view;

import org.codehaus.groovy.transform.SourceURIASTTransformation;
import sofka.concursopreguntas.accesoDatos.AccesoDatosImpl;
import sofka.concursopreguntas.business.BusinessImpl;
import sofka.concursopreguntas.domain.Premio;
import sofka.concursopreguntas.domain.category.*;
import sofka.concursopreguntas.exceptions.AccesoDatosEx;

import java.util.Scanner;

public class Concurso {

    public static void main(String[] args) throws AccesoDatosEx {
        System.out.println("BIENVENIDOS AL CONCURSO DE PREGUNTAS");
        var opcion = -1;
        double premio1;
        double premio2;
        double premio3;
        double premio4;
        double premio5;
        double acumulado;

        BusinessImpl datos = new BusinessImpl();



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


            switch (opcion) {
                case 1:
                    datos.iniciarhistorial();
                    System.out.println("Ingrese nombre: ");
                    nombre = input.nextLine();
                    System.out.println("Responda las siguientes preguntas marcando A,B,C o D dependiendo de la respuesta que usted considere correcta:");
                    Categoria1 categoria1 = new Categoria1();
                    var res =categoria1.resultado();
                    System.out.println(res);
                    if (res.contains("correcta")) {
                        premio1 = Premio.PREMIO1.getPremio();
                        System.out.println("Felicidades. Ganaste: " + premio1 + "USD");
                        Categoria2 categoria2 = new Categoria2();

                        var res2 = categoria2.resultado();
                        System.out.println(res2);
                        if (res2.contains("correcta")) {
                            premio2 = Premio.PREMIO2.getPremio();
                            System.out.println("Felicidades. Ganaste: " + premio2 + "USD");
                            acumulado = premio1 + premio2;
                            System.out.println("Su premio acumulado es de: " + acumulado + "USD");
                            Categoria3 categoria3 = new Categoria3();
                            var res3 = categoria3.resultado();
                            if (res3.contains("correcta")) {
                                premio3 = Premio.PREMIO3.getPremio();
                                System.out.println("Felicidades. Ganaste: " + premio3 + "USD");
                                acumulado = premio1 + premio2 + premio3;
                                System.out.println("Su premio acumulado es de: " + acumulado + "USD");
                                Categoria4 categoria4 = new Categoria4();
                                var res4 = categoria4.resultado();
                                if (res4.contains("correcta")) {
                                    premio4 = Premio.PREMIO4.getPremio();
                                    System.out.println("Felicidades. Ganaste: " + premio4 + "USD");
                                    acumulado = premio1 + premio2 + premio3 + premio4;
                                    System.out.println("Su premio acumulado es de: " + acumulado + "USD");
                                    Categoria5 categoria5 = new Categoria5();
                                    var res5 = categoria5.resultado();
                                    if (res5.contains("correcta")) {
                                        premio5 = Premio.PREMIO5.getPremio();
                                        System.out.println("Felicidades. Ganaste: " + premio5 + "USD");
                                        acumulado = premio1 + premio2 + premio3 + premio4 + premio5;
                                        System.out.println("Su premio acumulado es de: " + acumulado + "USD");
                                    }
                                    }
                            }


                        }
                    }
                    break;
                case 2:
                    System.out.println("Nos vemos pronto");
                    break;
            }


        }

    }







}



