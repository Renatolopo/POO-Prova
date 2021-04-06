package questao_19.dados;

import questao_19.modelo.Edicao;

import java.util.ArrayList;

public class EdicaoDAO {
    private static ArrayList<Edicao> edicoes;

    public static void addEdicao(Edicao edicao){
        edicoes.add(edicao);
    }
    public static Edicao buscaEdicao(int numEdicao){
        Edicao edicao = null;
        for(Edicao edicaEmPEsquisa : edicoes){
            if(edicaEmPEsquisa.getNumEdicao() == numEdicao){
                edicao = edicaEmPEsquisa;
                break;
            }
        }
        return edicao;
    }
}
