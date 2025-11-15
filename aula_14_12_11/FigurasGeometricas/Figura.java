package POO.aula_14_12_11.FigurasGeometricas;

public abstract class Figura {
	String cor;
	
	public Figura(String cor) {
		this.cor = cor;
	}
	
	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public String apresentarDados() {
		return "A figura " + cor + " tem área " + calcularArea() + " e perímetro " + calcularPerimetro() + ".";
	}
}