import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner input;
    Agenda agenda;

    public Menu() {
        input = new Scanner(System.in);
        agenda = new Agenda();
    }

    private String getNome() {
        System.out.println("Digite o nome:");
        return input.nextLine();
    }
    private String getEndereco() {
        System.out.println("Digite o endereço:");
        return input.nextLine();
    }
    private String getEmail() {
        System.out.println("Digite o e-mail:");
        return input.nextLine();
    }
    private String getCpf() {
        System.out.println("Digite o CPF:");
        return input.nextLine();
    }
    private String getEstadoCivil() {
        System.out.println("Digite o Estado Civil:");
        return input.nextLine();
    }
    private String getCnpj() {
        System.out.println("Digite o CNPJ:");
        return input.nextLine();
    }
    private int getInscricaoEst() {
        System.out.println("Digite a Incrição Estadual:");
        return Integer.parseInt(input.nextLine());
    }
    private String getCpfCnpj() {
        System.out.println("Digite o CPF/CNPJ:");
        return input.nextLine();
    }

    private void addPessoa(boolean pessoaFisica) {
        String nome = getNome();
        String endereco = getEndereco();
        String email = getEmail();
        if(pessoaFisica) {
            String cpf = getCpf();
            String estadoCivil = getEstadoCivil();
            System.out.println(
                agenda.add(nome, endereco, email, cpf, estadoCivil) ?
                "O contato foi adicionado!" :
                "O contato já existe"
            );
        } else {
            String cnpj = getCnpj();
            int inscricaoEst = getInscricaoEst();
            System.out.println(
                agenda.add(nome, endereco, email, cnpj, inscricaoEst) ?
                "O contato foi adicionado!" :
                "O contato já existe"
            );
        }
    }
    private void removerPessoa() {
        String cpfCnpj = getCpfCnpj();
        agenda.removerPessoa(cpfCnpj);
    }
    private void imprimirAgenda() {
        List<Contato> contatos = agenda.getContatos();
        for(Contato contato: contatos) {
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("Nome: " + contato.getNome());
            System.out.println("E-mail: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            if(contato instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contato;
                System.out.println("CPF: " + pf.getCpf());
                System.out.println("Estado Civil: " + pf.getEstadoCivil());
            } 
            else if(contato instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contato;
                System.out.println("CNPJ: " + pj.getCnpj());
                System.out.println("INscrição Estadual: " + pj.getInscricaoEst());
                
            }   
            System.out.println("-------------------------------");
            System.out.println();
        } 
    }
    private void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                addPessoa(true);
                break;
            case 2:
                addPessoa(false);
                break;
            case 3:
                removerPessoa();
            case 4:
                imprimirAgenda();
        }
    }
    public void exibirMenu() {
        System.out.println("=======Menu de Opções=======");
        System.out.println("1 - Cadastrar uma pessoa física");
        System.out.println("2 - Cadastrar uma pessoa jurídica");
        System.out.println("3 - Remover um contato");
        System.out.println("4 - Imprimir dados da agenda");
        System.out.println("5 - Sair");
    }
    public int getOpcao() {
        return Integer.parseInt(input.nextLine());
    }
    public void run () {
        exibirMenu();
        int opcao = getOpcao();
        while (opcao != 5) {
            executarOpcao(opcao);
            exibirMenu();
            opcao = getOpcao();
        }
    }
}
