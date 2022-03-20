package sofka.concursopreguntas.accesoDatos;


import sofka.concursopreguntas.domain.Jugador;
import sofka.concursopreguntas.exceptions.AccesoDatosEx;
import sofka.concursopreguntas.exceptions.EscrituraDatosEx;
import sofka.concursopreguntas.exceptions.LecturaDatosEx;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosImpl implements IAccedoDatos{
    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public void crearArchivo(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear concurso:" + ex.getMessage());
        }
    }



    @Override
    public void escribirArchivo(String nombreArchivo, Jugador jugador, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(jugador.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + jugador);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir información:" + ex.getMessage());
        }
    }

    @Override
    public List<Jugador> listar(String nombreArchivo) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        List<Jugador> jugadores = new ArrayList<Jugador>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                var jugador = new Jugador(linea, null, 0);
                jugadores.add(jugador);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar jugador:" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar jugador:" + ex.getMessage());

        }
        return jugadores;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
            var archivo = new File(nombreArchivo);
            try {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            } catch (IOException ex) {
                ex.printStackTrace();
                throw new AccesoDatosEx("Excepcion al crear el historial:" + ex.getMessage());
            }
    }

    @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        if(archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
    }

    public AccesoDatosImpl() {
    }
}