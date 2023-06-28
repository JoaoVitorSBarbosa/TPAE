public class Main { 
    public static void main(String[] args) {
        FolhaPagamento fp = new FolhaPagamento();
        Beneficiario ben;
        //Cadastro de beneficiários
        ben = new BeneficiarioPrivada("123.456.789-0","Tamara",90);
        fp.cadastrarBeneficiario(ben);
        ben = new BeneficiarioPublico("987.654.321-0","Chico",12000.0);
        fp.cadastrarBeneficiario(ben);
        ben = new BeneficiarioArmadas("234.567.890-1","Bento",15000.0);
        fp.cadastrarBeneficiario(ben);
        //Geração da folha de pagamentos
        fp.gerarFolhaPagamento(); 
    }
};