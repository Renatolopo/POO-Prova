package questao_19.dados;

import questao_19.modelo.Edicao;

import java.util.ArrayList;
import java.util.Collections;

public class EdicaoDAO {
    private static ArrayList<Edicao> edicoes = new ArrayList<>();

    public static void addEdicao(Edicao edicao){
        edicoes.add(edicao);
    }
    public static Edicao buscaEdicao(int numEdicao){
        Edicao edicao = null;
        for(Edicao edicaEmPesquisa : edicoes){
            if(edicaEmPesquisa.getNumEdicao() == numEdicao){
                edicao = edicaEmPesquisa;
                break;
            }
        }
        return edicao;
    }

    public static void listEdicoes(){
        Collections.sort(edicoes, (edicao1, edicao2) ->
                edicao1.getData().compareToIgnoreCase(edicao2.getData()));

        for(Edicao edicao : edicoes){
            System.out.println("---");
            System.out.printf("Numero de edição: %d\n" +
                    "Volume: %d\n" +
                    "Data: %s \n", edicao.getNumEdicao(),
                    edicao.getVolume(),
                    edicao.getData());
            if(edicao.getRevistaCientifica() != null){
                System.out.printf("Revista: %s\n", edicao.getRevistaCientifica().getTitulo());
            }
        }
    }
}
