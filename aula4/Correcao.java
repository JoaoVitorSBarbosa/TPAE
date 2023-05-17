public class Correcao {
	private int questao;
	private boolean acerto;
	private int numTentativas;
	
	public Correcao (int questao, boolean acerto, int numTentativas) {
		this.questao = questao;
		this.acerto = acerto;
		this.numTentativas = numTentativas;
	}
	public int getQuestao() {
		return questao;
	}
	public boolean getAcerto() {
		return acerto;
	}
	public int getNumTentativas() {
		return numTentativas;
	}

};
