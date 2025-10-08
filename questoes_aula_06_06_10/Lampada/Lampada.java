package POO.questoes_aula_06_06_10.Lampada;

public class Lampada {
    boolean ligada = false;
    int contadorVezesLigada = 0;
    public void muda() {
        if(ligada)
            ligada = false;
        else {
            ligada = true;
            contadorVezesLigada++;
        }
    }
}