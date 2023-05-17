import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner imput = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular da conta");
		String nome = imput.nextLine();
		
		System.out.println("Digite o numero da conta: ");
		int numero = imput.nextInt();
		
		System.out.println("Valor inicial do saldo: ");
		int saldoInicial = imput.nextInt();
		
		ContaBancaria conta = new ContaBancaria(nome, numero, saldoInicial);

		System.out.printf("Conta numero %d com titular %s criada com sucesso!", conta.getNumero(), conta.getNome());
	}
}
