package questao_19.controle;

import questao_19.dados.ArtigoDAO;
import questao_19.modelo.Artigo;

public class ControleArtigo {
    public void addArtigo(Artigo artigo){
        ArtigoDAO.addArtigo(artigo);
    }
    public Artigo buscarArtigo(String titulo){
        return ArtigoDAO.buscarArtigo(titulo);
    }
}
