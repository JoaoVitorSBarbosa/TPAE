public class Cliente {
    private static int id;
    private int idCliente;
    private int tempoDeChegada;
    private int duracaoAtendimento;

    public Cliente(int tempoDeChegada, int duracaoAtendimento) {
        this.tempoDeChegada = tempoDeChegada;
        this.duracaoAtendimento = duracaoAtendimento;
        idCliente = id;
        id++;
    }
    public int getDuracaoAtendimento() {
        return duracaoAtendimento;
    }
    public int getTempoDeChegada() {
        return tempoDeChegada;
    }
    public int getId () {
        return idCliente;
    }
}
