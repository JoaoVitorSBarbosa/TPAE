public class BeneficiarioArmadas extends Beneficiario implements CalculoContribuicao{
    private double ultimoSalario;
    public BeneficiarioArmadas(String cpf, String nome, double ultimoSalario) {
        super(cpf, nome);
        this.ultimoSalario = ultimoSalario;
    }
    
    @Override
    public double calculaAposentadoria() {
        return (ultimoSalario*0.9);
    }

    @Override
    public double calculaContribuicao() {
        return ultimoSalario * 0.11;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAposentadoria: " + calculaAposentadoria() +"\nContribuição: " + calculaContribuicao();
    }
}
