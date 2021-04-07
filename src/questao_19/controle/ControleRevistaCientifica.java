package questao_19.controle;

import questao_19.dados.RevistaCientificaDAO;
import questao_19.modelo.RevistaCientifica;

public class ControleRevistaCientifica {
    public void addRevista(RevistaCientifica revistaCientifica){
        RevistaCientificaDAO.addRevista(revistaCientifica);
    }
    public RevistaCientifica buscarRevista(String titulo){
        return RevistaCientificaDAO.buscarRevista(titulo);
    }
    public void listRevistas(){
        RevistaCientificaDAO.listRevistas();
    }
}
