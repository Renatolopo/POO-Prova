package questao_19.dados;

import questao_19.modelo.RevistaCientifica;

import java.util.ArrayList;

public class RevistaCientificaDAO {
    private static ArrayList<RevistaCientifica> revistasCientificas;

    public static void addRevista(RevistaCientifica revistaCientifica){
        revistasCientificas.add(revistaCientifica);
    }

    public static RevistaCientifica buscarRevista(String titulo){
        RevistaCientifica revistaCientifica = null;
        for(RevistaCientifica revistaEmPesquisa : revistasCientificas){
            if(revistaEmPesquisa.getTitulo() == titulo){
                revistaCientifica = revistaEmPesquisa;
                break;
            }
        }
        return revistaCientifica;
    }
}
