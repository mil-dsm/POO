package POO.aula_09_15_10.AnimalEncapsulado;

public class Animal {
	private String species;
    private int age;
    private String noise;
    
    public String getSpecies() {
    	return species;
    }
    
    public void setSpecies(String species) {
    	this.species = species;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setAge(int age) {
    	this.age = age;
    }
    
    public String getNoise() {
    	return noise;
    }
    
    public void setNoise(String noise) {
    	this.noise = noise;
    }

    public String toString() {
        return species + " " + age + " " + noise;
    }

    public void ageBy(int increment) {
        age += increment;
        if(age > 4)
            age = 4;
        if(age == 4)
            System.out.println("warning: " + species + " morreu");
    }

    public String makeNoise() {
        if(age == 0)
            return "---";
        else if(age == 4)
            return "RIP";
        else
            return noise;
    }
}