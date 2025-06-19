package dados;

public class JogoEletronico extends Jogo {
    private TipoEletronico tipo;
    private String plataforma;

    public JogoEletronico(int codigo, String nome, double valorBase, TipoEletronico tipo, String plataforma) {
        setCodigo(codigo);
        setNome(nome);
        setValorBase(valorBase);
        this.tipo = tipo;
        this.plataforma = plataforma;
    }

    public TipoEletronico getTipo() { return tipo; }
    public void setTipo(TipoEletronico tipo) { this.tipo = tipo; }
    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    @Override
    public double calculaAluguel() {
        if (tipo == TipoEletronico.SIMULACAO) {
            return getValorBase() * 1.1;
        }
        return getValorBase();
    }

    @Override
    public String toString() {
        return super.toString() + " [Eletrônico: " + tipo + ", Plataforma: " + plataforma + "]";
    }
}