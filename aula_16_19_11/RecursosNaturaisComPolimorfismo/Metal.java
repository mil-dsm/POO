package POO.aula_16_19_11.RecursosNaturaisComPolimorfismo;

public class Metal extends Recurso{
	int pureza;
	
	public Metal(String nome, double preco, int pureza) {
		super(nome, preco);
		this.pureza = pureza;
	}
	
	public double processarRecurso(double precoMercado) {
		return (peso * pureza * precoMercado) / 100;
	}
}