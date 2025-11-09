package POO.aula_11_02_11;

public class ContaCorrente extends Conta{
	protected double imposto;
	
	public ContaCorrente(double imposto) {
		this.imposto = imposto;
	}
	
	public double getImposto() {
		return (imposto);
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
}