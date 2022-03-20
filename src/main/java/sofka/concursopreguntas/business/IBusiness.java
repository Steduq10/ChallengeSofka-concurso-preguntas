package sofka.concursopreguntas.business;

import sofka.concursopreguntas.domain.Jugador;

public interface IBusiness {
    String NOMBRE_ARCHIVO = "historial.txt";

   void agregarJugador (String NOMBRE_ARCHIVO, Jugador jugador);
    void listar();
    void iniciarhistorial();
}
