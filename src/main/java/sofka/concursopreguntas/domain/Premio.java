package sofka.concursopreguntas.domain;

public enum Premio {
    PREMIO1("1000"), PREMIO2("2000"), PREMIO3("3000"), PREMIO4("4000"), PREMIO5("5000");

    private Premio(final String premio) {
        this.premio = premio;
    }

    private String premio;

    public String getPremio() {
        return premio;
    }
}
