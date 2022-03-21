package sofka.concursopreguntas.domain;



public class Jugador {
    private String nombre;
    private String pregunta;
    private String resultado;
    private double acumulado;



    public Jugador(String nombre, String resultado, double acumulado) {
        this.nombre = nombre;
        this.resultado = resultado;
        this.acumulado = acumulado;


    }

    public Jugador(String nombre, String resultado) {
        this.nombre = nombre;
        this.resultado = resultado;
        this.acumulado = 0;


    }




    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getAcumulado() {
        return acumulado;
    }

    public void setAcumulado(double acumulado) {
        this.acumulado = acumulado;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                "Nombre del jugador= '" + nombre + '\'' +
                ", resultado= '" + resultado + '\'' +
                ", acumulado= " + acumulado;
    }
}
