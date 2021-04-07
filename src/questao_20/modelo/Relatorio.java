package questao_20.modelo;

public class Relatorio {
    private int totalPizza;
    private int totalRefrigerante;
    private double totalPagamentoMotoboy;

    public Relatorio(){
        this.totalPagamentoMotoboy = 0;
        this.totalPizza = 0;
        this.totalRefrigerante = 0;
    }

    public double getTotalPagamentoMotoboy() {
        return totalPagamentoMotoboy;
    }

    public int getTotalPizza() {
        return totalPizza;
    }

    public int getTotalRefrigerante() {
        return totalRefrigerante;
    }
    public void addPizza(int quantidade){
        this.totalPizza += quantidade;
    }
    public void addRefrigerante(int quantidade){
        this.totalRefrigerante += quantidade;
    }
    public void addPagamentoMotoboy(){
        this.totalPagamentoMotoboy += 2.50;
    }
}
