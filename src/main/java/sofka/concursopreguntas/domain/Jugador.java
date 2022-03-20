package sofka.concursopreguntas.domain;



public class Jugador {
    private String nombre;
    private String pregunta;
    private String resultado;
    private double premio;


    public Jugador(String nombre, String resultado, double premio) {
        this.nombre = nombre;
        this.resultado = resultado;
        this.premio = premio;

    }




    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
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
                ", premio= " + premio;
    }
}
