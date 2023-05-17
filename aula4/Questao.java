import java.util.Random;

public class Questao {
	public static int lastId = 1;
	private int id;
	private String enunciado;
	private int gabarito;
	public Questao () {
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		gabarito = num1 * num2;
		enunciado = "Quanto é ";
		enunciado += num1;  
		enunciado += " * ";
 		enunciado += num2;  
		enunciado += "?";
		id = lastId;
		lastId++;
	}	
	public String getEnunciado(){
		return enunciado;
	}
	public boolean getAcerto(int resposta) {
		return(resposta == gabarito);
	}
	public int getId() {
		return id;
	}
};
