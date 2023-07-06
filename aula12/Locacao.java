package aula12;

public class Locacao {
    private NotaFiscal tipoNota;

    public Locacao(NotaFiscal tipoNota) {
        this.tipoNota = tipoNota;
    }
    public double calculaValorNota() {
        return tipoNota.calculoValorNota();
    }
}
