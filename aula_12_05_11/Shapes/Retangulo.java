package POO.aula_12_05_11.Shapes;

public class Retangulo extends Forma{
    double largura, altura;
    
    public Retangulo(double largura, double altura){
    	super("Retângulo");
        this.largura = largura;
        this.altura = altura;
        area = getArea();
        perimetro = getPerimetro();
    }
    
    public double getArea(){
    	return (largura * altura);
    }
    
    public double getPerimetro() {
    	return ((largura * 2) + (altura * 2));
    }
}