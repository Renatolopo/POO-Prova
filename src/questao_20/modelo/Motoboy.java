package questao_20.modelo;

public class Motoboy {
    private String nome;
    private String placa;
    private int quantidadeCorrida;

    public Motoboy(String nome, String placa){
        this.nome = nome;
        this.placa = placa;
        this.quantidadeCorrida = 0;
    }
    public void addCorrida(){
        this.quantidadeCorrida ++;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeCorrida() {
        return quantidadeCorrida;
    }

    public String getPlaca() {
        return placa;
    }
}
