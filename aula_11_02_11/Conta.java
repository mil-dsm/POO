package POO.aula_11_02_11;

public class Conta {
	protected double saldo;
	protected int numero;
	protected int agencia;
	protected String titular;
	
	public boolean saque(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return (true);
		}
		return (false);
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public double getSaldo() {
		return (this.saldo);
	}
}