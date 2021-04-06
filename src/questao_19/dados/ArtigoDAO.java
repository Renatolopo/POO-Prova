package questao_19.dados;

import questao_19.modelo.Artigo;

import java.util.ArrayList;

public class ArtigoDAO {
    private static ArrayList<Artigo> artigos;

    public static void addArtigo(Artigo artigo){
        artigos.add(artigo);
    }
    public static Artigo buscarArtigo(String titulo){
        Artigo artigo = null;
        for(Artigo artigoEmPEsquisa : artigos){
            if(artigoEmPEsquisa.getTitulo() == titulo){
                artigo = artigoEmPEsquisa;
                break;
            }
        }
        return artigo;
    }
}
