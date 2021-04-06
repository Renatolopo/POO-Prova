package questao_19.modelo;

public class Edicao {
    private int numEdicao;
    private int volume;
    private String data;
    private RevistaCientifica revistaCientifica;

    public Edicao(int numEdicao, int volume, String data, RevistaCientifica revistaCientifica){
        this.numEdicao = numEdicao;
        this.volume = volume;
        this.data = data;
        this.revistaCientifica = revistaCientifica;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public int getVolume() {
        return volume;
    }

    public String getData() {
        return data;
    }
}
