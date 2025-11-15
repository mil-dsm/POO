package POO.aula_14_12_11.FigurasGeometricas;

public class Retangulo extends Figura implements Desenhavel{
	double largura;
	double altura;
	
	public Retangulo(double largura, double altura, String cor) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return (largura * altura);
	}
	
	@Override
	public double calcularPerimetro() {
		return (largura + largura + altura +  altura);
	}
	
	@Override
	public String desenhar() {
		return "Renderizando retângulo " + cor + " de " + largura + "x" + altura + ".";
	}
}