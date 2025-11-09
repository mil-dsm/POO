package POO.aula_11_02_11;

public class ContaEspecial extends Conta{
	double limite;
	
	public ContaEspecial(double limite) {
		this.limite = limite;
	}
	
	public double getLimite() {
		return (limite);
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean saque(double valor) {
	    if (valor <= saldo + limite) {
	        saldo -= valor;
	        return true;
	    }
	    return false;
	}
}