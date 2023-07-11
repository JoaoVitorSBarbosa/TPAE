public class MinasGerais extends Salario{
    @Override
    public double calculaDescVT(double salarioBruto) {
        return salarioBruto * 0.06;
    }
    @Override
    public double calculaDescPS(double salarioBruto) {
        return salarioBruto * 0.02;
    }

}
