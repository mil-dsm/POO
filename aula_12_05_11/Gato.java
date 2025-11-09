package POO.aula_12_05_11;

public class Gato extends Animal{
	int lives;
	
	public Gato(String species) {
		super(species, "Miau");
		lives = 9;
	}
	
	public int perderVida() {
		this.lives--;
		if(lives < 1) {
			ageStage = 4;
		}
		return (lives);
	}
	
	public String toString() {
		return species + ":" + ageStage + ":" + noise + " (Vidas: " + lives + ")";
	}
}