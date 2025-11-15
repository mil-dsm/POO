package POO.aula_06_06_10.Toalha;

public class Toalha {
    String cor;
    char tamanho;
    int umidade;

    public void mostrar() {
        System.out.println(cor + " " + tamanho + " " +umidade);
    }
    public void enxugar(int q) {
        umidade += q;
        if (umidade > getMaxUmidade()) {
            umidade = getMaxUmidade();
        }
    }
    public void torcer() {
        umidade = 0;
    }
    public int getMaxUmidade() {
        if(tamanho == 'P')
            return 10;
        else if(tamanho == 'M')
            return 20;
        else 
            return 30;
    }
    public boolean estaSeca() {
        if(umidade == 0)
            return true;
        else
            return false;
    }
}