class ContaBancaria {
	int numero;
	int saldo;
	String nome;

	ContaBancaria (String nome, int numero, int saldoInicial) {
		this.nome = nome;
		this.numero = numero;
		saldo = saldoInicial;
	}

	public String getNome () {
		return nome;
	}

	public int getNumero () {
		return numero;
	}

	public int getSaldo () {
		return saldo;
	}

};
