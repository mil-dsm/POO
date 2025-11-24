package POO.aula_17_24_11.ProcessamentoDeVendas;

public class VendaInternacional extends Venda implements Transacionavel {
    double taxaConversao;

    public VendaInternacional(double valorBase, String data) {
        super(valorBase, data);
        taxaConversao = 0.25;
    }

    @Override
    public double calcularValorFinal() {
        return (valorBase * taxaConversao);
    }
}