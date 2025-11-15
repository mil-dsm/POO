package POO.aula_08_08_10.ToalhaEncapsulada;

public class Toalha {
    private String cor;
    private char tamanho;
    private int umidade;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public int getUmidade() {
        return umidade;
    }

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

/*public class Toalha {
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
} */