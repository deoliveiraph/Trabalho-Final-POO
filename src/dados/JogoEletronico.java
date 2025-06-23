package dados;

public class JogoEletronico extends Jogo {
    public enum Categoria { AVENTURA, ESTRATEGIA, SIMULACAO }
    private Categoria categoria;

    public JogoEletronico(int codigo, String nome, double valorBase, Categoria categoria) {
        super(codigo, nome, valorBase);
        this.categoria = categoria;
    }

    public Categoria getCategoria() { return categoria; }

    @Override
    public double calculaAluguel() {
        return getValorBase() * 1.5;
    }
}