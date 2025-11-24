package POO.aula_16_19_11.EncomendaComPolimorfismo;

public class Pacote extends Encomenda{
	double largura;
	double altura;
	double profundidade;
	
	public Pacote(String codigo, double peso, double largura, double altura, double profundidade) {
		super(codigo, peso);
		this.largura = largura;
		this.altura = altura;
		this.profundidade = profundidade;
	}
	
	@Override
	public double calcularCustoEnvio() {
		return peso * 12 * ((largura > 10 || altura > 10 || profundidade > 10) ? 1.18 : 1);
	}
	
	@Override
	public String getStatus() {
		return "Entregue ao destinatario";
	}
}