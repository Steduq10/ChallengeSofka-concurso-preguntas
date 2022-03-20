package sofka.concursopreguntas.domain;

public enum Premio {
    PREMIO1(1000), PREMIO2(2000), PREMIO3(3000), PREMIO4(4000), PREMIO5(5000);

    private Premio(final double premio) {
        this.premio = premio;
    }

    private double premio;

    public double getPremio() {
        return premio;
    }
}
