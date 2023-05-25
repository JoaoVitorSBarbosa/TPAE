import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disciplina {
    private ArrayList<Aluno> listaAlunos; 
    private String codigo;
    
    public Disciplina(String codigo) {
        this.codigo = codigo;
        listaAlunos =  new ArrayList<Aluno>();
    }

    private boolean getAlunoJaCadastrado (String nome) {
        for(Aluno aluno: listaAlunos) {
            if (aluno.getNome().equals(nome)) return true;
        }
        return false;
    }
    
    private Comparator<Aluno> getComparador() {
        return new Comparator<Aluno>() {
            @Override
            public int compare(Aluno nome1, Aluno nome2){
                return nome2.getNota() - nome1.getNota();
            }
        };
    }
    
    
    public void adicionarAluno (Aluno aluno) {
        if(!getAlunoJaCadastrado(aluno.getNome())) {
            listaAlunos.add(aluno);
        }
    }
    public void ordenarDiario() {
        listaAlunos.sort(getComparador());
    }
    public String getCodigo() {
        return codigo;
    }
    public List<Aluno> getListaAlunos() {
        return Collections.unmodifiableList(listaAlunos);  
    }
};