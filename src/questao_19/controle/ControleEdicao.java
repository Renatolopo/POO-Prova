package questao_19.controle;

import questao_19.dados.EdicaoDAO;
import questao_19.modelo.Edicao;

public class ControleEdicao {
    public void addEdicao(Edicao edicao){
        EdicaoDAO.addEdicao(edicao);
    }
    public Edicao buscarEdicao(int numEdicao){
        return EdicaoDAO.buscaEdicao(numEdicao);
    }
    public void listEdicoes(){
        EdicaoDAO.listEdicoes();
    }
}
