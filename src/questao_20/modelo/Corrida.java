package questao_20.modelo;

public class Corrida {
    private int quantidadePizza;
    private int quantidadeRefrigerante;
    private String data;
    private String hora;
    private Motoboy motoboy;

    public Corrida(int quantidadePizza, int quantidadeRefrigerante, String data,
                   String hora, Motoboy motoboy){
        this.quantidadePizza = quantidadePizza;
        this.quantidadeRefrigerante = quantidadeRefrigerante;
        this.data = data;
        this.hora = hora;
        this.motoboy = motoboy;
        if(motoboy != null){
            motoboy.addCorrida();
        }
    }

    public String getData() {
        return data;
    }

    public int getQuantidadePizza() {
        return quantidadePizza;
    }

    public int getQuantidadeRefrigerante() {
        return quantidadeRefrigerante;
    }

    public Motoboy getMotoboy() {
        return motoboy;
    }

    public String getHora() {
        return hora;
    }
}
