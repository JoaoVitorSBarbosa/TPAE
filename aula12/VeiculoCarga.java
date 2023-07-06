public class VeiculoCarga extends NotaFiscal{
    private boolean cabineDupla;

    public VeiculoCarga(int valorDiaria, int numeroDias, boolean cabineDupla) {
        super(valorDiaria, numeroDias);
        this.cabineDupla = cabineDupla;
    }

    @Override
    public double calculoValorNota() {
        return (cabineDupla ? 1.5 : 1.2) * super.calculoValorNota();
    }

}
