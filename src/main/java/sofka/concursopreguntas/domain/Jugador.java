package sofka.concursopreguntas.domain;

public class Jugador {
    private String nombre;
    private String pregunta;
    private String resultado;
    private double premio;

    public Jugador(String nombre, String pregunta, String resultado, double premio) {
        this.nombre = nombre;
        this.pregunta = pregunta;
        this.resultado = resultado;
        this.premio = premio;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
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


}
