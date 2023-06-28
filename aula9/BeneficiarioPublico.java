public class BeneficiarioPublico extends Beneficiario implements CalculoContribuicao{
    private double mediaSalarial;
    BeneficiarioPublico(String cpf, String nome, double mediaSalarial) {
        super(cpf, nome);
        this.mediaSalarial = mediaSalarial;
    }
    public double getMediaSalarial() {
        return mediaSalarial;
    }
    @Override
    public double calculaAposentadoria() {
        return mediaSalarial * 0.8;
    }

    @Override
    public double calculaContribuicao() {
        return mediaSalarial * 0.14;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAposentadoria: " + calculaAposentadoria() +"\nContribuição: " + calculaContribuicao();
    }
}
