package POO.Revisao_AP1;

public class Cliente {
    public String nome;
    private double dinheiro;

    public Cliente(String nome, double dinheiro){
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public double getDinheiro(){
        return (this.dinheiro);
    }

    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }
}