package sofka.concursopreguntas.business;

import sofka.concursopreguntas.accesoDatos.AccesoDatosImpl;
import sofka.concursopreguntas.accesoDatos.IAccedoDatos;
import sofka.concursopreguntas.domain.Jugador;
import sofka.concursopreguntas.exceptions.AccesoDatosEx;

public class BusinessImpl implements IBusiness {
    private final IAccedoDatos datos;

    public BusinessImpl() {
        this.datos = new AccesoDatosImpl();

    }

    @Override
    public void agregarJugador(String nombre, Jugador jugador) {
        //Jugador jugador = new Jugador(nombre, jugador);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_ARCHIVO);
            datos.escribirArchivo(NOMBRE_ARCHIVO, jugador, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listar() {
        try {
            var jugadores = this.datos.listar(NOMBRE_ARCHIVO);
            for (var jugador : jugadores) {
                System.out.println("Historial = " + jugador);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarhistorial() {
        try {
            if (this.datos.existe(NOMBRE_ARCHIVO)) {
                datos.borrar(NOMBRE_ARCHIVO);
                datos.crear(NOMBRE_ARCHIVO);

            } else {
                datos.crear(NOMBRE_ARCHIVO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar historial");
            ex.printStackTrace(System.out);
        }
    }
}