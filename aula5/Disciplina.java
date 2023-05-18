import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Disciplina {
    private ArrayList<Aluno> listaAlunos =  new ArrayList<Aluno>(); 
    private String codigo;
    private boolean getAlunoJaCadastrado (String nome) {
        for(Aluno aluno: listaAlunos) {
            if (aluno.getNome().equals(nome)) return true;
        }
        return false;
    }
    private Comparator<Aluno> getComparador = new Comparator<Aluno>() {
        @Override
        public int compare(Aluno nome1, Aluno nome2){
            return nome1.getNome().compareTo(nome2.getNome());
        }
    };
    public Disciplina(String codigo) {
        this.codigo = codigo;
    }
    public void adicionarAluno (Aluno aluno) {
        if(!getAlunoJaCadastrado(aluno.getNome())) {
            listaAlunos.add(aluno);
        }
    }
    public void ordenarDiario() {
        Collections.sort(listaAlunos, getComparador);
    }
    public String getCodigo() {
        return codigo;
    }
    public List<Aluno> getListaAlunos() {
        return Collections.unmodifiableList(listaAlunos);  
    }
};