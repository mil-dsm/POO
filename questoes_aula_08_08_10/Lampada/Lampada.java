package POO.questoes_aula_08_08_10.Lampada;

public class Lampada {
    private boolean ligada = false;
    private int contadorVezesLigada = 0;
    public void muda() {
        if(ligada)
            ligada = false;
        else {
            ligada = true;
            contadorVezesLigada++;
        }
    }

    public boolean getEstaLigada() {
        return ligada;
    }

    public int getContadorVezesLigada() {
        return contadorVezesLigada;
    }
}
