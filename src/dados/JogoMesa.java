package dados;

public class JogoMesa extends Jogo {

    private TipoMesa tipo;
    private int numeroPecas;

    public JogoMesa(int codigo, String nome, double valorBase, TipoMesa tipo, int numeroPecas) {
        setCodigo(codigo);
        setNome(nome);
        setValorBase(valorBase);
        this.tipo = tipo;
        this.numeroPecas = numeroPecas;
    }

    public TipoMesa getTipo() { return tipo; }
    public void setTipo(TipoMesa tipo) { this.tipo = tipo; }
    public int getNumeroPecas() { return numeroPecas; }
    public void setNumeroPecas(int numeroPecas) { this.numeroPecas = numeroPecas; }

    @Override
    public double calculaAluguel() {
        if (tipo == TipoMesa.TABULEIRO) {
            return getValorBase() + numeroPecas * 1.0;
        }
        return getValorBase();
    }

    @Override
    public String toString() {
        return super.toString() + " [Mesa: " + tipo + ", Peças: " + numeroPecas + "]";
    }
}