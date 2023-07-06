package aula12;

public class VeiculoPassageiro extends NotaFiscal{
    private int capacidade;

    public VeiculoPassageiro(int valorDiaria, int numeroDias, int capacidade) {
        super(valorDiaria, numeroDias);
        this.capacidade = capacidade;
    }
    @Override
    public double calculoValorNota() {
        return super.calculoValorNota() * (1 + (capacidade/100));
    }

}
