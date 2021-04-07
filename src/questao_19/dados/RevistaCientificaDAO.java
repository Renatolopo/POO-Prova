package questao_19.dados;

import questao_19.modelo.RevistaCientifica;

import java.util.ArrayList;
import java.util.Collections;

public class RevistaCientificaDAO {
    private static ArrayList<RevistaCientifica> revistasCientificas = new ArrayList<>();

    public static void addRevista(RevistaCientifica revistaCientifica){
        revistasCientificas.add(revistaCientifica);
    }

    public static RevistaCientifica buscarRevista(String titulo){
        RevistaCientifica revistaCientifica = null;
        for(RevistaCientifica revistaEmPesquisa : revistasCientificas){
            if(revistaEmPesquisa.getTitulo().equals(titulo)){
                revistaCientifica = revistaEmPesquisa;
                break;
            }
        }
        return revistaCientifica;
    }
    public static void listRevistas(){
        Collections.sort(revistasCientificas, (revista1, revista2) ->
                revista1.getTitulo().compareToIgnoreCase(revista2.getTitulo()));

        for(RevistaCientifica revista : revistasCientificas){
            System.out.println("---");
            System.out.printf("Titulo: %s\n" +
                    "ISSN: %d\n" +
                    "Periodicidade: %s\n", revista.getTitulo(),
                    revista.getIssn(), revista.getPeriodicidade());
            System.out.println("---");
        }
    }
}
