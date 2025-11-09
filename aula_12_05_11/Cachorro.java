package POO.aula_12_05_11;

public class Cachorro extends Animal{
	int nivelLealdade;
	
	public String receberCarinho() {
		nivelLealdade++;
		return "Cachorro " + species + " ficou mais leal. Lealdade: " + nivelLealdade;
	}
	
	public Cachorro(String species) {
		super(species, "AuAu");
		nivelLealdade = 1;
	}
	
	public String toString() {
		return species + ":" + ageStage + ":" + noise + " (Lealdade: " + nivelLealdade + ")";
	}
}