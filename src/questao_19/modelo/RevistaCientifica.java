package questao_19.modelo;

public class RevistaCientifica {
    private String titulo;
    private int issn;
    private String periodicidade;

    public RevistaCientifica(String titulo, int issn, String periodicidade){
        this.titulo = titulo;
        this.issn = issn;
        this.periodicidade = periodicidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getIssn() {
        return issn;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }
}
