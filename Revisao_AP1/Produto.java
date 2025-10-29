package POO.Revisao_AP1;

public class Produto {
    public String nome;
    private double valor;
    protected String dataValidade;

    public Produto(){
        this.nome = null;
        this.valor = 0;
        this.dataValidade = null;
    }

    public Produto(String nome, double valor, String dataValidade){
        this.nome = nome;
        this.valor = valor;
        this.dataValidade = dataValidade;
    }

    public double getValor(){
        return (this.valor);
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}