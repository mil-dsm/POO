package POO.aula_12_05_11;

public class Animal {
    protected String species;
    protected int ageStage;
    protected String noise;
    
    public Animal(String species, String noise) {
        this.species = species;
        this.noise = noise;
        this.ageStage = 0;
    }

    public String toString() {
        return species + ":" + ageStage + ":" + noise;
    }

    public void ageBy(int increment) {
        ageStage += increment;
        if(ageStage > 4)
            ageStage = 4;
        if(ageStage == 4)
            System.out.println("warning: " + species + " morreu");
    }

    public String makeNoise() {
        if(ageStage == 0)
            return "-";
        else if(ageStage == 4)
            return "RIP";
        else
            return noise;
    }
}