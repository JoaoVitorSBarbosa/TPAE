public class SeguroCasa extends SeguroResidencial{
    private boolean estaEmCondominio;
    public SeguroCasa(int tamanho, boolean estaEmCondominio) {
        super(tamanho);
        this.estaEmCondominio = estaEmCondominio;
    }
    @Override
    public int calculaPremio() {
        return estaEmCondominio ? getTamanho() * 5 : getTamanho() * 7;
    }
    @Override
    public String toString() {
        return super.toString() + "\nCondomio: " + (estaEmCondominio ? "Sim" : "Não");
    }
}
