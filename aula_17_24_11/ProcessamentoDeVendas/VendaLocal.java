package POO.aula_17_24_11.ProcessamentoDeVendas;

public class VendaLocal extends Venda implements Transacionavel {
    static double impostoMunicipal;

    public VendaLocal(double valorBase, String data) {
        super(valorBase, data);
        impostoMunicipal = 0.05;
    }    

    @Override
    public double calcularValorFinal() {
        return (valorBase * (1 + impostoMunicipal));
    }
}