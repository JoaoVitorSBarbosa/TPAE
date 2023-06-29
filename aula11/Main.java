import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<Segurados> listaSegurados = new ArrayList<>(); 
        listaSegurados.add(new SeguroCasa(100, false));
        listaSegurados.add(new SeguroCasa(100, true));

        listaSegurados.add(new SeguroApartamento(100, 4));
        listaSegurados.add(new SeguroApartamento(100, 10));

        listaSegurados.add(new SeguroVida(58, false));
        listaSegurados.add(new SeguroVida(70, false));
        listaSegurados.add(new SeguroVida(70, true));

        for(Segurados segurado: listaSegurados) {
            System.out.println(segurado.toString());
        }
    } 
};