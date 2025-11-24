package POO.aula_16_19_11.FigurasGeometricasComPolimofismo;

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