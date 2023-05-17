import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite o nome do aluno: ");
		String nome = input.nextLine();
		
		System.out.printf("Insira a categoria do aluno (bolsista/nao bolsista): ");
		String categoria = input.nextLine();
		
		System.out.printf("Entre com a quantidade de disciplinas cursadas: ");
		int qtdeDisciplinas = input.nextInt();

		Aluno novoAluno = new Aluno(nome, categoria, qtdeDisciplinas);
		for (int i = 0; i < qtdeDisciplinas; i++){
			System.out.printf("Insira a nota na disciplina %d: ", i+1);
			novoAluno.setNotas(input.nextInt());					
		}


		System.out.printf("############# RELATÓRIO FINAL ############# \n");
		System.out.printf("Nome do aluno: %s\nCoeficiente de Rendimento: %.2f\nSituação final: %s\n",novoAluno.getNome(),novoAluno.getMedia(), novoAluno.getSituacao());
	}

};
