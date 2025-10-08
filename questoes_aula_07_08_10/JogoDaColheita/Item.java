package POO.questoes_aula_07_08_10.JogoDaColheita;

public class Item {
    String nome;
    int valorVenda;

    public Item(String nome, int valorVenda) {
        this.nome = nome;
        this.valorVenda = valorVenda;
    }
    
    public String getNome() {
        return this.nome;
    }

    public int getValorVenda() {
        return this.valorVenda;
    }

    public String toString() {
        return this.nome + ":" + this.valorVenda;
    }
}