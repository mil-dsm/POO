package POO.aula_12_05_11.Animal;

public class Passaro extends Animal{
	int alturaVoo;
	
	public int voar(int metros) {
		if(ageStage == 4) {
			System.out.println("Falha: Nao pode voar.");
			alturaVoo = 0;
		} else {
			alturaVoo += metros;
		}
		return alturaVoo;
	}
	
	public Passaro(String species) {
		super(species, "Piu");
		alturaVoo = 0;
	}
	
	public String toString() {
		return species + ":" + ageStage + ":" + noise + " (Altura: " + alturaVoo + "m)";
	}
}