package POO.aula_17_24_11.ProcessamentoDeVendas;

public abstract class Venda {
    protected double valorBase;
    protected String data;

    public Venda(double valorBase, String data) {
        this.valorBase = valorBase;
        this.data = data;
    }

    public abstract double calcularValorFinal();

    public String toString() {
        return (data + "," + valorBase);
    }
}