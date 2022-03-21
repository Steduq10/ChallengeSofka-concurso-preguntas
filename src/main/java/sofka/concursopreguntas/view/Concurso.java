package sofka.concursopreguntas.view;


import sofka.concursopreguntas.business.BusinessImpl;
import sofka.concursopreguntas.business.IBusiness;
import sofka.concursopreguntas.domain.Jugador;
import sofka.concursopreguntas.domain.Premio;

import sofka.concursopreguntas.domain.category.*;
import sofka.concursopreguntas.exceptions.AccesoDatosEx;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Concurso {

    public static void main(String[] args) throws AccesoDatosEx {

        System.out.println("---------------------------------------------");
        System.out.println("----BIENVENIDOS AL CONCURSO DE PREGUNTAS----");
        System.out.println("---------------------------------------------");
        System.out.println(" ");
        String NOMBRE_ARCHIVO = "historial.txt";
        var opcion = -1;
        double premio1;
        double premio2;
        double premio3;
        double premio4;
        double premio5;
        double acumulado;


        IBusiness datos = new BusinessImpl();



        String nombre;



        while (opcion != 0) {
            System.out.println("MENÚ\n" +
                    "1. Iniciar juego\n" +
                    "2. Salir del juego\n" +
                    "3. Historial");

            Scanner input = new Scanner(System.in);
            opcion = Integer.parseInt(input.nextLine());


            switch (opcion) {
                case 1:
                    datos.iniciarhistorial();
                    System.out.println("Para iniciar el juego, por favor ingrese su nombre: ");
                    nombre = input.nextLine();
                    System.out.println("--------------------------------");
                    System.out.println("Bienvenido " + nombre);
                    System.out.println("-------------------------------");
                    System.out.println(" ");
                    System.out.println("En este juego deberás responder de forma correcta cada una de las preguntas, En total son 5 niveles y en cada nivel ganarás espectaculares premios");
                    System.out.println(" ");
                    System.out.println("Responda las siguientes preguntas marcando A,B,C o D dependiendo de la respuesta que usted considere correcta:");
                    System.out.println(" ");
                    System.out.println("**********************************************");
                    System.out.println("Primera pregunta, por un premio de 1000 USD");
                    System.out.println("**********************************************");
                    acumulado =0;
                    Categoria1 categoria1 = new Categoria1();
                    //var res0 = categoria1.resultado();
                    var res = categoria1.resultado();
                    Jugador jugador0 = new Jugador(nombre, res, acumulado);
                    datos.agregarJugador(NOMBRE_ARCHIVO, jugador0);
                    System.out.println(res);
                    System.out.println("-----------------------------------------------");
                    System.out.println(" ");
                    if (res.contains("Respuesta correcta")) {
                        premio1 = Premio.PREMIO1.getPremio();
                        System.out.println("Felicidades. Ganaste: " + premio1 + " USD");
                        System.out.println(" ");
                        System.out.println("**********************************************");
                        acumulado = premio1;
                        Jugador jugador = new Jugador(nombre, res, acumulado);
                        datos.agregarJugador(NOMBRE_ARCHIVO, jugador);
                        Categoria2 categoria2 = new Categoria2();
                        System.out.println("Segunda pregunta, por un premio de 2000 USD");
                        ;
                        System.out.println("**********************************************");
                        var res2 = categoria2.resultado();
                        System.out.println(res2);
                        System.out.println("-----------------------------------------------");
                        System.out.println(" ");
                        if (res2.contains("Respuesta correcta")) {
                            premio2 = Premio.PREMIO2.getPremio();
                            System.out.println("Felicidades. Ganaste: " + premio2 + " USD");
                            acumulado = premio1 + premio2;
                            System.out.println("Su premio acumulado es de: " + acumulado + " USD");
                            System.out.println(" ");
                            System.out.println("**********************************************");
                            Jugador jugador2 = new Jugador(nombre, res, acumulado);
                            datos.agregarJugador(NOMBRE_ARCHIVO, jugador2);
                            Categoria3 categoria3 = new Categoria3();
                            System.out.println("Tercera pregunta, por un premio de 3000 usd");
                            ;
                            System.out.println("**********************************************");
                            var res3 = categoria3.resultado();
                            System.out.println("-----------------------------------------------");
                            System.out.println(" ");
                            if (res3.contains("Respuesta correcta")) {
                                premio3 = Premio.PREMIO3.getPremio();
                                System.out.println("Felicidades. Ganaste: " + premio3 + " USD");
                                acumulado = premio1 + premio2 + premio3;
                                System.out.println("Su premio acumulado es de: " + acumulado + " USD");
                                System.out.println(" ");
                                System.out.println("**********************************************");
                                Jugador jugador3 = new Jugador(nombre, res, acumulado);
                                datos.agregarJugador(NOMBRE_ARCHIVO, jugador3);
                                Categoria4 categoria4 = new Categoria4();
                                System.out.println("Cuarta pregunta, por un premio de 4000 usd");
                                ;
                                System.out.println("**********************************************");
                                var res4 = categoria4.resultado();
                                System.out.println("-----------------------------------------------");
                                System.out.println(" ");
                                if (res4.contains("Respuesta correcta")) {
                                    premio4 = Premio.PREMIO4.getPremio();
                                    System.out.println("Felicidades. Ganaste: " + premio4 + " USD");
                                    acumulado = premio1 + premio2 + premio3 + premio4;
                                    System.out.println("Su premio acumulado es de: " + acumulado + " USD");
                                    System.out.println(" ");
                                    System.out.println("**********************************************");
                                    Jugador jugador4 = new Jugador(nombre, res, acumulado);
                                    datos.agregarJugador(NOMBRE_ARCHIVO, jugador4);
                                    Categoria5 categoria5 = new Categoria5();
                                    System.out.println("Quinta pregunta, por un premio de 5000 usd");
                                    ;
                                    System.out.println("**********************************************");
                                    var res5 = categoria5.resultado();
                                    System.out.println("-----------------------------------------------");
                                    System.out.println(" ");
                                    if (res5.contains("correcta")) {
                                        premio5 = Premio.PREMIO5.getPremio();
                                        System.out.println("Felicidades. Ganaste: " + premio5 + " USD");
                                        acumulado = premio1 + premio2 + premio3 + premio4 + premio5;
                                        System.out.println("GANASTE EL PREMIO MAYOR, Y TE LLEVAS UN ACUMULADO DE: " + acumulado + " USD");
                                        System.out.println(" ");
                                        System.out.println("**********************************************");
                                        Jugador jugador5 = new Jugador(nombre, res, acumulado);
                                        datos.agregarJugador(NOMBRE_ARCHIVO, jugador5);

                                    }else {
                                        System.out.println("Lo sentimos, PERDISTE");
                                        acumulado =0;
                                        System.out.println("Tu premio es de: " + acumulado + " USD");
                                        jugador0.setAcumulado(0);
                                        datos.agregarJugador(NOMBRE_ARCHIVO,jugador0);
                                        opcion =0;
                                    }
                                }else {
                                    System.out.println("Lo sentimos, PERDISTE");
                                    acumulado =0;
                                    System.out.println("Tu premio es de: " + acumulado + " USD");
                                    jugador0.setAcumulado(0);
                                    datos.agregarJugador(NOMBRE_ARCHIVO,jugador0);
                                    opcion =0;
                                }
                            }else {
                                System.out.println("Lo sentimos, PERDISTE");
                                acumulado =0;
                                System.out.println("Tu premio es de: " + acumulado + " USD");
                                jugador0.setAcumulado(0);
                                datos.agregarJugador(NOMBRE_ARCHIVO,jugador0);
                                opcion =0;
                            }


                    }else {
                            System.out.println("Lo sentimos, PERDISTE");
                            acumulado =0;
                            System.out.println("Tu premio es de: " + acumulado + " USD");
                            jugador0.setAcumulado(0);
                            datos.agregarJugador(NOMBRE_ARCHIVO,jugador0);
                            opcion =0;
                        }

                    }else {
                        System.out.println("Lo sentimos, PERDISTE");
                        acumulado =0;
                        System.out.println("Tu premio es de: " + acumulado + " USD");
                        jugador0.setAcumulado(0);
                        datos.agregarJugador(NOMBRE_ARCHIVO,jugador0);

                        opcion =0;
                    }




                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("Nos vemos pronto");
                    System.out.println("---------------------------");
                    opcion = 0;
                    break;


            }


        }

    }







}



