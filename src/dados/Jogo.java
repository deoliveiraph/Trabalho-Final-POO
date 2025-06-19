package dados;

public abstract class Jogo {
    private int codigo;
    private String nome;
    private double valorBase;

    public abstract double calculaAluguel();

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getValorBase() { return valorBase; }
    public void setValorBase(double valorBase) { this.valorBase = valorBase; }

    @Override
    public String toString() {
        return "dados.Jogo{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valorBase=" + valorBase +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Jogo jogo = (Jogo) obj;
        return codigo == jogo.codigo;
    }
}