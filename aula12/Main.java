package aula12;

public class Main {
    public static void main (String[] args) {
        Menu menu = Menu.getInstance();
        int opcao = menu.run();
        NotaFiscal nota;
        nota = null;
        while(opcao != 4) {
            opcao = menu.run();
            switch (opcao) {
                case 1:
                    nota = new VeiculoPasseio(menu.getValorDiaria(), menu.getNumeroDias());
                    break;
                case 2:
                    nota = new VeiculoCarga(menu.getValorDiaria(), menu.getNumeroDias(), menu.getCabine());
                    break;
                case 3:
                    nota = new VeiculoPassageiro(menu.getValorDiaria(), menu.getNumeroDias(), menu.getCapacidade());
                    break;
            }
            if(nota != null) {
                menu.showNota(nota.calculoValorNota());
            }
        }   
    }
};