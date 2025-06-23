package dados;

import java.io.Serializable;
import java.util.Date;

public class Aluguel implements Serializable {
    private int identificador;
    private Date dataInicial;
    private int periodo;
    private Cliente cliente;
    private Jogo jogo;

    public Aluguel(int identificador, Date dataInicial, int periodo, Cliente cliente, Jogo jogo) {
        this.identificador = identificador;
        this.dataInicial = dataInicial;
        this.periodo = periodo;
        this.cliente = cliente;
        this.jogo = jogo;
    }

    public int getIdentificador() { return identificador; }
    public Date getDataInicial() { return dataInicial; }
    public int getPeriodo() { return periodo; }
    public Cliente getCliente() { return cliente; }
    public Jogo getJogo() { return jogo; }

    public double calculaValorFinal() {
        return jogo.calculaAluguel() * periodo;
    }
}