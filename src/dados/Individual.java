package dados;

public class Individual extends Cliente {
    public Individual(int numero, String nome) {
        super(numero, nome);
    }
    @Override
    public String getTipo() { return "Individual"; }
}