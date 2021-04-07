package questao_20.controle;

import questao_20.dados.CorridaDAO;
import questao_20.modelo.Corrida;

import java.util.ArrayList;

public class ControleCorrida {
    public void addCorrida(Corrida corrida){
        CorridaDAO.addCorrida(corrida);
    }
    public void listCorrida(){
        CorridaDAO.listCorrida();
    }

    public ArrayList<Corrida> getCorridas() {
        return CorridaDAO.getCorridas();
    }
}
