package POO.aula_16_19_11.RecursosNaturaisComPolimorfismo;

public class Madeira extends Recurso implements Combustivel{
	String tipo;
	
	public Madeira(String nome, double peso, String tipo) {
		super(nome, peso);
		this.tipo = tipo;
	}
	
	public double processarRecurso(double precoMercado){
		return peso * precoMercado * 2.5;
	}
	
	public String queimar() {
		return "Madeira " + tipo + " está queimando lentamente. Gerando " + (peso * 4) + " de energia.";
	}
}