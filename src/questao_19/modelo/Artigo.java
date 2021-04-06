package questao_19.modelo;

public class Artigo {
    private String titulo;
    private String nomeAutor;
    private Edicao edicao;

    public Artigo(String titulo, String nomeAutor, Edicao edicao){
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }
}
