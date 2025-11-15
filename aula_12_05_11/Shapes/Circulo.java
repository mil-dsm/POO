package POO.aula_12_05_11.Shapes;

public class Circulo extends Forma {
    double raio;
    
    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
        area = getArea();
        perimetro = getPerimetro();
    }
    
    public double getArea(){
    	return (3.14159 * raio * raio);
    }
    
    public double getPerimetro(){
    	return (2 * 3.14159 * raio);
    }
}