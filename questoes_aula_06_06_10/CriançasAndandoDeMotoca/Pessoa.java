package POO.questoes_aula_06_06_10.CriançasAndandoDeMotoca;

public class Pessoa {
    int age;
    String name;

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ":" + age;
    }
}