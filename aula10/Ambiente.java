import java.util.HashMap;

/**
 * Classe Ambiente - um ambiente em um jogo adventure.
 *
 * Esta classe eh parte da aplicacao "World of Zuul".
 * "World of Zuul" eh um jogo de aventura muito simples, baseado em texto.
 *
 * Um "Ambiente" representa uma localizacao no cenario do jogo. Ele eh
 * conectado aos outros ambientes atraves de saidas. As saidas sao
 * nomeadas como norte, sul, leste e oeste. Para cada direcao, o ambiente
 * guarda uma referencia para o ambiente vizinho, ou null se nao ha
 * saida naquela direcao.
 * 
 * @author Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 */
public class Ambiente {
    private HashMap<String, Ambiente> saidas;
    private String descricao;
    private static final String direcoes[] = { "norte" , "leste", "sul", "oeste" };

    /**
     * Cria um ambiente com a "descricao" passada. Inicialmente, ele
     * nao tem saidas. "descricao" eh algo como "uma cozinha" ou
     * "
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "um jardim aberto".
     * 
     * @param descricao A descricao do ambiente.
     */
    public Ambiente(String descricao) {
        this.descricao = descricao;
        saidas = new HashMap<String,Ambiente>();
    }

    private void ajustarDescricao() {
        descricao += ("\nSaidas: ");
        for(String direcao: saidas.keySet()) {
            descricao += direcao + " ";
        }
        descricao += "\n";
    }

    /**
     * Define as saidas do ambiente. Cada direcao ou leva a um
     * outro ambiente ou eh null (nenhuma saida para la).
     * 
     * @param norte A saida norte.
     * @param leste A saida leste.
     * @param sul   A saida sul.
     * @param oeste A saida oeste.
     */
    public void ajustarSaidas(Ambiente[] ambientes) {
        for(int i = 0; i < ambientes.length; i++ ) {
            saidas.put(direcoes[i], ambientes[i]);
            ajustarDescricao();
        }
    }
    public Ambiente getAmbiente(String direcao) {
        return saidas.get(direcao);
    }
    /**
     * @return A descricao do ambiente.
     */
    public String getDescricao() {
        return descricao;
    }

}
