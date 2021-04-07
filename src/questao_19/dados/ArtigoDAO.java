package questao_19.dados;

import questao_19.modelo.Artigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArtigoDAO {
    private static ArrayList<Artigo> artigos = new ArrayList<>();

    public static void addArtigo(Artigo artigo){
        artigos.add(artigo);
    }

    public static Artigo buscarArtigo(String titulo){
        Artigo artigo = null;
        for(Artigo artigoEmPEsquisa : artigos){
            if(artigoEmPEsquisa.getTitulo().equals(titulo)){
                artigo = artigoEmPEsquisa;
                break;
            }
        }
        return artigo;
    }
    public static void listArtigos(){
        Collections.sort(artigos, (artigo1, artigo2) ->
                artigo1.getTitulo().compareToIgnoreCase(artigo2.getTitulo()));

        for(Artigo artigo : artigos){
            System.out.println("---");
            System.out.printf("Titulo %s\n" +
                    "Autor: %s\n",
                    artigo.getTitulo(), artigo.getNomeAutor());
            if(artigo.getEdicao() != null){
                System.out.printf("Edição: %s\n", artigo.getEdicao().getNumEdicao());
            }
        }

    }


}
