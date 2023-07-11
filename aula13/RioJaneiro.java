public class RioJaneiro extends Salario{
    
    @Override
    public double calculaDescVT(double salarioBruto) {
        return salarioBruto * 0.08;
    }
    @Override
    public double calculaDescPS(double salarioBruto) {
        return salarioBruto * 0.02;
    }

}
