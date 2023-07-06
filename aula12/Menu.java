import java.util.Scanner;

public class Menu {
    private static Menu instance;
    private Scanner in;

    private Menu() {
        in = new Scanner(System.in);
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

    public boolean getCabine() {
        System.out.println("A Cabine é estendida? S/N");
        return in.nextLine().equals("S");
    }

    public int getCapacidade() {
        System.out.println("Entre com a capacidade de Veículo: ");
        return Integer.parseInt(in.nextLine());
    }

    public int getNumeroDias() {
        System.out.println("Entre com o número de dias: ");
        return Integer.parseInt(in.nextLine());
    }

    public int getValorDiaria() {
        System.out.println("Entre com o valor da diária: ");
        return Integer.parseInt(in.nextLine());
    }

    public void mostrarOpcoes() {
        System.out.println("#### LOCADORA DE VEICULOS ####");
        System.out.println("1 - Gerar nota para veículo de passeio");
        System.out.println("2 - Gerar nota para veículo de carga");
        System.out.println("3 - Gerar nota para veículo de passageiros");
        System.out.println("4 - Sair");
    }

    public int getOpcao() {
        return Integer.parseInt(in.nextLine());
    }

    public void run() {
        mostrarOpcoes();
        int opcao = getOpcao();
        NotaFiscal nota;
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    nota = new VeiculoPasseio(getValorDiaria(), getNumeroDias());
                    break;
                case 2:
                    nota = new VeiculoCarga(getValorDiaria(), getNumeroDias(), getCabine());
                    break;
                case 3:
                    nota = new VeiculoPassageiro(getValorDiaria(), getNumeroDias(), getCapacidade());
                    break;
                default:
                    nota = null;
                    break;
            }
            showNota(nota.calculoValorNota());
        }
        opcao = getOpcao();
    }

    public void showNota(double valor) {
        System.out.println("===================== Nota Fiscal =============================");
        System.out.printf("= Valor a ser pago: R$ %s =\n", String.format("%.02f", valor));
        System.out.println("===============================================================");
    }
}
