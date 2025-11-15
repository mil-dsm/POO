package POO.aula_12_05_11.Shapes;

public class Quadrado extends Forma {
    double lado;
    
    public Quadrado(double lado){
    	super("Quadrado");
        this.lado = lado;
        area = getArea();
        perimetro = getPerimetro();
    }
    
    public double getArea(){
    	return (lado * lado);
    }
    
    public double getPerimetro(){
    	return (4 * lado);
    }
}