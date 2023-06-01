public class Main {
    public static void main(String[] args) {
        int duracaoSimulacao = 100;
        int numeroAtendentes = 3;

        Simulador simulador = new Simulador(duracaoSimulacao, numeroAtendentes);
        simulador.simular();
    }
}