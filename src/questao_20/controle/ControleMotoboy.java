package questao_20.controle;

import questao_20.dados.MotoboyDAO;
import questao_20.modelo.Motoboy;

public class ControleMotoboy {
    public void addMotoboy(Motoboy motoboy){
        MotoboyDAO.addMotoboy(motoboy);
    }
    public Motoboy buscarMotoboy(String nome){
        return MotoboyDAO.buscarMotoboy(nome);
    }
    public void listMotoboy(){
        MotoboyDAO.listMotoboy();
    }
}
