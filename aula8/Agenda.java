import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    private ArrayList<Contato> listaContatos;

    public Agenda() {
        listaContatos = new ArrayList<Contato>();
    }
    private Contato contatoJaExiste(String cpfCnpj) {
        for(Contato contato: listaContatos) {
            if(contato instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contato;
                if(cpfCnpj.equals(pf.getCpf())) {
                    return contato;
                } else {
                    return null;
                }
            } 
            else if(contato instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contato;
                if(cpfCnpj.equals(pj.getCnpj())) {
                    return contato;
                } else {
                    return null;
                }
            }   
        }
        return null;
    }
    public boolean add(String nome, String endereco, String email, String cpf, String estadoCivil) {
        PessoaFisica contato = new PessoaFisica(nome, endereco, email, cpf, estadoCivil);
        if(contatoJaExiste(contato.getCpf()) != null) {
            return false;
        } else {
            listaContatos.add(contato);
            return true;
        }
    }
    public boolean add(String nome, String endereco, String email, String cnpj, int inscricaoEst) {
        PessoaJuridica contato = new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEst);
        if(contatoJaExiste(contato.getCnpj()) != null) {
            return false;
        } else {
            listaContatos.add(contato);
            return true;
        }
    }
    public boolean removerPessoa(String cpfCnpj){
        Contato contato = contatoJaExiste(cpfCnpj);
        if(contato != null) {
            return false;
        } else {
            listaContatos.remove(contato);
            return true;
        }
    }
    public List<Contato> getContatos() {
        return Collections.unmodifiableList(listaContatos);
    } 
}
