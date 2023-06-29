public class SeguroVida implements Segurados {
    private int idade;
    private boolean masculino;

    public SeguroVida(int idade, boolean masculino) {
        this.idade = idade;
        this.masculino = masculino;
    }

    @Override
    public int calculaPremio() {
        int premio = 100;
        if (idade < 60) {
            for (int i = 10; i < idade; i++) {
                if ((i % 10) == 0) {
                    premio += 100;
                }
            }
        } else {
            premio = masculino ? 800 : 900;
        }
        return premio;
    }
    @Override
    public String toString() {
        return "\nIdade: " + idade + "\nGênero: " + (masculino ? "Masculino" : "Feminino") + "\nPrêmio: " + calculaPremio();
    }
}
