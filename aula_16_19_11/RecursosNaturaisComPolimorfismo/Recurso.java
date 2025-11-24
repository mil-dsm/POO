package POO.aula_16_19_11.RecursosNaturaisComPolimorfismo;

public abstract class Recurso {
	protected String nome;
	protected double peso;
	
	public Recurso(String nome, double peso) {
		this.nome= nome;
		this.peso = peso;
	}
	
	public void inspecionar() {
		System.out.println("Inspecionando " + nome + ", Peso: " + peso + " kg.");
	}
	
	public abstract double processarRecurso(double precoMercado);
}