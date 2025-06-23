package dados;

public class JogoMesa extends Jogo {
    public enum Tipo { TABULEIRO, CARTA }
    private Tipo tipo;
    private int numeroPecas;

    public JogoMesa(int codigo, String nome, double valorBase, Tipo tipo, int numeroPecas) {
        super(codigo, nome, valorBase);
        this.tipo = tipo;
        this.numeroPecas = numeroPecas;
    }

    public Tipo getTipo() { return tipo; }
    public int getNumeroPecas() { return numeroPecas; }

    @Override
    public double calculaAluguel() {
        return getValorBase() + numeroPecas * 0.1;
    }
}