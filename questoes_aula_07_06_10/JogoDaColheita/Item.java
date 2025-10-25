package POO.questoes_aula_07_06_10.JogoDaColheita;

public class Item {
    String nome;
    int valorVenda;

    public Item(String nome, int valorVenda) {
        this.nome = nome;
        this.valorVenda = valorVenda;
    }
    
    public String getNome() {
        return nome;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public String toString() {
        return nome + ":" + valorVenda;
    }
}