package dados;

public class Empresarial extends Cliente {
    public Empresarial(int numero, String nome) {
        super(numero, nome);
    }
    @Override
    public String getTipo() { return "Empresarial"; }
}