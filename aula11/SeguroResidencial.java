public abstract class SeguroResidencial implements Segurados{
    private int tamanho;
    public SeguroResidencial(int tamanho) {
        this.tamanho = tamanho;
    }
    public int getTamanho() {
        return tamanho;
    }
    @Override
    public String toString() {
        return "\nTamanho: " + tamanho + "\nPrêmio: " + calculaPremio();
    }
}
