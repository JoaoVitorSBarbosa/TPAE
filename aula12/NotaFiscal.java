public abstract class NotaFiscal {
    private int valorDiaria;
    private int numeroDias;

    public NotaFiscal(int valorDiaria, int numeroDias) {
        this.valorDiaria = valorDiaria;
        this.numeroDias = numeroDias;
    }
    public double calculoValorNota() {
        return valorDiaria * numeroDias;
    }   
}
