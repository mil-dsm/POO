package POO.aula_17_24_11.AcademiaETreinos;

public class Corrida extends Treino {
    double distanciaKm;

    public Corrida(int duracaoMinutos, double distanciaKm) {
        super(duracaoMinutos);
        this.distanciaKm = distanciaKm;
    }

    @Override
    public int calcularCaloriasQueimadas() {
        return (int)(distanciaKm * 50);
    }
}