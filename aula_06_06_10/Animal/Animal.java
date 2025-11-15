package POO.aula_06_06_10.Animal;

public class Animal {
    String species;
    int age;
    String noise;
    
    public Animal(String species, String noise) {
        this.species = species;
        this.noise = noise;
        this.age = 0;
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