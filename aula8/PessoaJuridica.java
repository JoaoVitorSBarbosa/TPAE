public class PessoaJuridica extends Contato {
    private String cnpj; 
    private int inscricaoEst;
    public PessoaJuridica(String nome, String endereco, String email, String cnpj, int inscricaoEst) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEst = inscricaoEst;
    }
    public String getCnpj() {
        return cnpj;
    }
    public int getInscricaoEst() {
        return inscricaoEst;
    }
}
