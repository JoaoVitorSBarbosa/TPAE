import java.util.Scanner;

public class Prova {
	private Questao[] questoes;
	private Correcao[] correcoes;
	public Prova () {
		questoes = new Questao[5];
		for(int i = 0; i < 5; i++) {
			questoes[i] = new Questao();
		}
		correcoes = new Correcao[5];
	}
	public void aplicar () {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i <5; i++) {
			System.out.printf("Questão %d:\n",questoes[i].getId());
			System.out.printf("%s\n",questoes[i].getEnunciado());
			int tentativas = 1;
			boolean acertou = false;
			while(!acertou && tentativas <= 2) {
				acertou  = questoes[i].getAcerto(input.nextInt());
				if(acertou) {
					System.out.printf("Você tentou %d vez(es) e acertou a questão.\n",tentativas);
				} else {
					System.out.printf("Você tentou %d vezes e errou a questão.\n",tentativas);
				}
				tentativas++;
			
			}
			tentativas--;
			correcoes[i] = new Correcao(questoes[i].getId(), acertou, tentativas);
		}
		input.close();
	}
	public void gerarRelatorio() {
		System.out.printf("\t Questão \t Situacao \t Número de Tentativas \n");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%13d%18s%20d\n",correcoes[i].getQuestao(), (correcoes[i].getAcerto() ? "acertou" : "errou"), correcoes[i].getNumTentativas());
		}
	
	}
};
