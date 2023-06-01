public class Atendente {
    private static int id;
    private int idAtendente;
    private int momento;

    public Atendente(int tempoAtual) {
        momento = tempoAtual;
        idAtendente = id;
        id++;
    }

    public void atenderCliente (int duracao) {
        momento = momento + duracao;
    }

    public boolean estaDisponivel(int tempoAtual) {
        return (tempoAtual > momento);
    }
    public int getId () {
        return idAtendente;
    }
};
