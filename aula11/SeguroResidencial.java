public class SeguroResidencial implements Segurados{
    private int tamanho;
    public SeguroResidencial(int tamanho) {
        this.tamanho = tamanho;
    }
    public int getTamanho() {
        return tamanho;
    }
    @Override
    public int calculaPremio() {
        return -1;
    }
    @Override
    public String toString() {
        return "\nTamanho: " + tamanho;
    }
}
