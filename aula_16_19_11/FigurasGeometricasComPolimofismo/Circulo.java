package POO.aula_16_19_11.FigurasGeometricasComPolimofismo;

public class Circulo extends Figura implements Desenhavel{
	double raio;
	
	public Circulo(double raio, String cor) {
		super(cor);
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return (3.14159 * raio * raio);
	}
	
	@Override
	public double calcularPerimetro() {
		return (2 * 3.14159 * raio);
	}
	
	@Override
	public String desenhar() {
		return "Renderizando círculo " + cor + " de raio " + raio + ".";
	}
}