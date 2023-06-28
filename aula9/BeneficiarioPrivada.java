public class BeneficiarioPrivada extends Beneficiario {
    private int porcentual;
    BeneficiarioPrivada(String cpf, String nome, int porcentual) {
        super(cpf, nome);
        this.porcentual = porcentual;
    }

    @Override
    public double calculaAposentadoria() {
        return (porcentual * 7507.49) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAposentadoria: " + calculaAposentadoria();
    }
}
