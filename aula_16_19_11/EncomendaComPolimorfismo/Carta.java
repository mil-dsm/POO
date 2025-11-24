package POO.aula_16_19_11.EncomendaComPolimorfismo;

public class Carta extends Encomenda{
	boolean urgente;
	
	public Carta(String codigo, double peso, boolean urgente) {
		super(codigo, peso);
		this.urgente = urgente;
	}
	
	@Override
	public double calcularCustoEnvio() {
		return peso * 5 * ((urgente == true) ? 1.2 : 1);
	}
	
	@Override
	public String getStatus() {
		return ((urgente == true) ? "Em trânsito urgente" : "Aguardando classificação");
	}
}