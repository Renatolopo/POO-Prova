package questao_20.dados;

import questao_20.modelo.Corrida;

import java.util.ArrayList;
import java.util.Collections;

public class CorridaDAO {
    public static ArrayList<Corrida> corridas = new ArrayList<>();

    public static void addCorrida(Corrida corrida){
        corridas.add(corrida);
    }
    public static void listCorrida(){
        Collections.sort(corridas, (corrida1, corrida2) ->
                corrida1.getData().compareToIgnoreCase(corrida2.getData()));
        for(Corrida corrida : corridas){
            System.out.println("---");
            System.out.printf("Data: %s\n" +
                    "Hora: %s\n" +
                    "Quantidade de Pizza: %d\n" +
                    "Quantidade de Refrigerante: %d\n", corrida.getData(),
                    corrida.getHora(), corrida.getQuantidadePizza(),
                    corrida.getQuantidadeRefrigerante());
            if(corrida.getMotoboy() != null){
                System.out.printf("Nome do motoboy: %s\n" +
                        "Placa do Motoboy: %s\n", corrida.getMotoboy().getNome(),
                        corrida.getMotoboy().getPlaca());
            }else {
                System.out.println("Motoboy não encontrado");
            }
        }
    }

    public static ArrayList<Corrida> getCorridas() {
        return corridas;
    }
}
