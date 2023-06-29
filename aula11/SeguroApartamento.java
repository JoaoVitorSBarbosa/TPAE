public class SeguroApartamento extends SeguroResidencial{
    private int numeroDeAndaresPredio;
    public SeguroApartamento(int tamanho, int numeroDeAndaresPredio) {
        super(tamanho);
        this.numeroDeAndaresPredio = numeroDeAndaresPredio;
    }
    @Override
    public int calculaPremio() {
        return (numeroDeAndaresPredio < 4) ? getTamanho() * 3 : getTamanho() * 4;
    }
    @Override
    public String toString() {
        return super.toString() + "\nAndares: " + numeroDeAndaresPredio + "\nPrêmio: " + calculaPremio();
    }
}
