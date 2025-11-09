package POO.aula_11_02_11;

public class ContaPoupanca extends Conta{
	double taxaDeJuros;
	
	public ContaPoupanca(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public double getTaxaDeJuros() {
		return (taxaDeJuros);
	}
	
	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void renderJuros() {
        saldo += saldo * taxaDeJuros;
    }
}
