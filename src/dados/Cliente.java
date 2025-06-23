package dados;

import java.io.Serializable;

public abstract class Cliente implements Serializable {
    private int numero;
    private String nome;

    public Cliente(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() { return numero; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public abstract String getTipo();
}