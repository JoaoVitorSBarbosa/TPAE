public class Aluno {
	private String nome;
	private String categoria;
	private int[] notas;

	public Aluno (String nome, String categoria, int qtdeDisciplinas) {
		this.nome = nome;
		this.categoria  = categoria;
		notas = new int[qtdeDisciplinas];
		for(int i = 0; i < qtdeDisciplinas; i++) {
			notas[i] = -1;
		}
	}
	public String getNome () {
		return nome;
	}
	public float getMedia() {
		float notaTotal = 0;
		for(int i = 0; i < notas.length; i++) {
			notaTotal = notaTotal + notas[i];
		} 
		return notaTotal/notas.length;
	}
	public String getSituacao() {
		if (categoria.equals("bolsista")) {
			if(getMedia() < 75) {
                                return "Desligado";
                        } else {
                                return "Regular";
                        }

		} else if (categoria.equals("nao bolsista")) {
			if(getMedia() < 70) {
				return "Desligado";
			} else {
				return "Regular";
			}
		} else {
			return "categoria invalida";
		}
	}
	public void setNotas(int novaNota) { 
		for (int i = 0; i < notas.length; i++) {
			if(notas[i] == -1) {
				notas[i] = novaNota;
				novaNota = -1;
			} 
		}
	}
};
