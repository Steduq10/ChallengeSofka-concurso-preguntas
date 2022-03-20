package sofka.concursopreguntas.business;

import sofka.concursopreguntas.domain.Jugador;
import sofka.concursopreguntas.exceptions.AccesoDatosEx;
import sofka.concursopreguntas.exceptions.EscrituraDatosEx;
import sofka.concursopreguntas.exceptions.LecturaDatosEx;

import java.util.List;

public interface IAccedoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    void crearArchivo(String nombreArchivo) throws AccesoDatosEx;
    void escribirArchivo(String nombreArchivo, Jugador jugador, boolean anexar) throws EscrituraDatosEx;
    List<Jugador> listar (String nombreArchivo) throws LecturaDatosEx;
}
