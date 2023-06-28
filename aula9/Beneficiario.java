public abstract class Beneficiario {
    private String nome;
    private String cpf;

    public Beneficiario (String cpf, String nome) {
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        String string = "Nome: " + nome;
        string += "\nCpf: " + cpf;
        return string;
    }
    public abstract double calculaAposentadoria();
}
