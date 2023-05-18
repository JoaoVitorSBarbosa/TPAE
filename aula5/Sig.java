import java.util.ArrayList;
import java.util.Scanner;

public class Sig {
    private ArrayList<Disciplina> listaDisciplinas;
    private Scanner input; 

    public Sig () {
        listaDisciplinas = new ArrayList<Disciplina>();
        input = new Scanner(System.in);
    }
    private int exibirMenu() {
        System.out.println("### MENU ###");
        System.out.println("1. Cadastrar disciplina");
        System.out.println("2. Cadastrar dados de aluno em disciplina");
        System.out.println("3. Mostrar diario de disciplina");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opcao:");
        
        return input.nextInt();
    }
    private boolean getDisciplinaJaCadastrada (String codigo) {
        for(Disciplina disciplina: listaDisciplinas) {
            if (disciplina.getCodigo().equals(codigo)) return true;
        }
        return false;
    }
    private void addDisciplina() {
        System.out.println("Digite o código da nova Disciplina");
        String nomeDisciplina = input.nextLine();
        if(!getDisciplinaJaCadastrada(nomeDisciplina)) {
            listaDisciplinas.add(new Disciplina(nomeDisciplina));
        }
    }
    private Disciplina findDisciplina (String nomeDisciplina) {
        for(Disciplina disciplina: listaDisciplinas) {
            if(disciplina.getCodigo().equals(nomeDisciplina)) return disciplina;
        }
        return null;
    }
    private void addAlunoDisciplina() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código da Disciplina");
        String nomeDisciplina = input.nextLine();
        
        Disciplina disciplina = findDisciplina(nomeDisciplina);
        if(disciplina != null) {
            System.out.println("Digite o nome do aluno");
            String nomeAluno = input.nextLine();
            System.out.println("Digite a nota do aluno");
            int nota = input.nextInt();
            System.out.println("Digite o numero de faltas do aluno");
            int faltas = input.nextInt();
            disciplina.adicionarAluno(new Aluno(nomeAluno, nota, faltas));
        } else {
            System.out.println("Disciplina não encontrada");
        }
    }
    private void showDiarioDisciplina() {
        System.out.println("Digite o código da Disciplina");

        String nomeDisciplina = input.nextLine();
        
        Disciplina disciplina = findDisciplina(nomeDisciplina);
        if(disciplina != null) {
            disciplina.ordenarDiario();
            for (Aluno a : disciplina.getListaAlunos()){
                System.out.printf("%-10s %-12s %-8s %-10s %n",a.getNome(),a.getNota(),
                a.getFaltas(),a.getSituacao());
            }
        }
        System.out.println("");
    }
    private void limparTela() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    private void executarOpcao(int opcao) {
        input.nextLine();
        switch (opcao) {
            case 1:
                addDisciplina();
                break;
            case 2:
                addAlunoDisciplina();
                break;
            case 3:
                showDiarioDisciplina();
                break;
            case 5:
                limparTela();
        
        }
    }
    public void executar() {
        int opcao = exibirMenu();
        while(opcao != 4) {
            executarOpcao(opcao);
            opcao = exibirMenu();
        }
    }
}
