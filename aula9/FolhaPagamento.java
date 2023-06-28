import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Beneficiario> listaBeneficiarios;
    
    FolhaPagamento() {
        listaBeneficiarios = new ArrayList<>();
    }
    public void cadastrarBeneficiario (Beneficiario beneficiario) {
        listaBeneficiarios.add(beneficiario);
    }
    public void gerarFolhaPagamento(){
        for(Beneficiario beneficiario: listaBeneficiarios) {
            System.out.println("-------------------");
            System.out.println(beneficiario.toString());
            
        }
        System.out.println("------------------------");
    }
}
