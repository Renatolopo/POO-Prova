package questao_20.dados;

import questao_20.modelo.Motoboy;

import java.util.ArrayList;

public class MotoboyDAO {
    private static ArrayList<Motoboy> motoboys = new ArrayList<>();

    public static void addMotoboy(Motoboy motoboy){
        motoboys.add(motoboy);
    }
    public static Motoboy buscarMotoboy(String nome){
        Motoboy motoboy = null;
        for(Motoboy motoboyEmPesquisa : motoboys){
            if(motoboyEmPesquisa.getNome().equals(nome)){
                motoboy = motoboyEmPesquisa;
                break;
            }
        }
        return motoboy;
    }
    public static  void listMotoboy(){
        System.out.println("Lista de motoboys");
        for(Motoboy motoboy : motoboys){
            System.out.println(motoboy.getNome());
        }
    }
}
