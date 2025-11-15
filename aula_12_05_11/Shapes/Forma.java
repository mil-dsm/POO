package POO.aula_12_05_11.Shapes;

public class Forma {
    String nome;
    double area;
    double perimetro;
    
    public Forma(String nome){
        this.nome = nome;
    }
    
    public String toString() {
        return nome + ": A=" + area + ", P=" + perimetro;
    }
}