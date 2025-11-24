package POO.aula_17_24_11.AcademiaETreinos;

public class Musculacao extends Treino {
    double pesoTotalLevantado;

    public Musculacao(int duracaoMinutos, double pesoTotalLevantado) {
        super(duracaoMinutos);
        this.pesoTotalLevantado = pesoTotalLevantado;
    }

    public int calcularCaloriasQueimadas() {
        return (int)(pesoTotalLevantado / 10);
    }
}