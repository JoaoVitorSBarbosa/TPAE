public class Main {
    public static void main (String[] args) {
        MinasGerais mg = new MinasGerais();
        RioJaneiro rj = new RioJaneiro();
        System.out.println(mg.calcularSalarioLiquido(3000));
        System.out.println(rj.calcularSalarioLiquido(3000));
    }
};
