package POO.aula_17_24_11.AcademiaETreinos;

public abstract class Treino {
    int duracaoMinutos;
    int caloriasBase;

    public Treino(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
        caloriasBase = 100;
    }

    public abstract int calcularCaloriasQueimadas();

    public int obterTotalCalorias() {
        return (caloriasBase + calcularCaloriasQueimadas());
    }
}