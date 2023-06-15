import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulador {
    private int duracaoSimulacao;
    private ArrayList<Atendente> listaAtendentes;
    private Queue<Cliente> filaClientes;
    private Random randGenerator;

    
    public Simulador(int duracaoSimulacao, int numeroAtendentes) {
        this.duracaoSimulacao = duracaoSimulacao;
        listaAtendentes = new ArrayList<Atendente>();
        filaClientes = new LinkedList<Cliente>();
        randGenerator = new Random();
        criarFilaClientes();
        criarListaAtendentes(numeroAtendentes);
    }
    private void criarFilaClientes() {
        int tempoChegada = 0;
        tempoChegada = tempoChegada + randGenerator.nextInt(4);
        while(tempoChegada < duracaoSimulacao) {
            filaClientes.add(new Cliente(tempoChegada, randGenerator.nextInt(8)));
            tempoChegada = tempoChegada + randGenerator.nextInt(4);
        }
    }
    
    private void criarListaAtendentes (int numeroAtendentes) {
        for (int i = 0; i < numeroAtendentes; i++) {
            listaAtendentes.add(new Atendente(0));
        }
    }

    private void atenderCliente(Atendente atendente) {
        Cliente cliente = filaClientes.peek();
        atendente.atenderCliente(cliente.getDuracaoAtendimento());
        //System.out.printf("Cliente %d sendo atendido pelo Atendente %d\n",(cliente.getId()+1), (atendente.getId()+1));
        //System.out.printf("Atendente será liberado em %d\n",cliente.getDuracaoAtendimento());
        filaClientes.remove();
        System.out.printf("Faltam %d clientes para serem atendidos\n", filaClientes.size());
    }

    public void simular () {
        for(int tempoSimulacao = 0;tempoSimulacao < duracaoSimulacao; tempoSimulacao++) {
            for(Atendente atendente: listaAtendentes) {
                if(atendente.estaDisponivel(tempoSimulacao)) {
                    if(filaClientes.size() > 0) {
                        if(filaClientes.peek().getTempoDeChegada() <= tempoSimulacao) {
                            atenderCliente(atendente);
                        }
                    }
                }
            }
        }        
    }

    
}
