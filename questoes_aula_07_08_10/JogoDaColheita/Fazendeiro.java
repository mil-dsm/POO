package POO.questoes_aula_07_08_10.JogoDaColheita;

public class Fazendeiro {
    String nome;
    int dinheiro;

    Item item1;
    Item item2;
    Item item3;

    public Fazendeiro(String nome) {
        this.nome = nome;
        this.dinheiro = 100;
        this.item1 = null;
        this.item2 = null;
        this.item3 = null;
    }

    public boolean colher(Item item) {
        if(this.item1 == null) {
            this.item1 = item;
            return true;
        } else if(this.item2 == null) {
            this.item2 = item;
            return true;
        } else if(this.item3 == null) {
            this.item3 = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean vender(String nomeItem) {
        if(this.item1 != null && this.item1.nome.equals(nomeItem)) {
            this.dinheiro += this.item1.valorVenda;
            this.item1 = null;
            return true;
        } else if(this.item2 != null && this.item2.nome.equals(nomeItem)) {
            this.dinheiro += this.item2.valorVenda;
            this.item2 = null;
            return true;
        } else if(this.item3 != null && this.item3.nome.equals(nomeItem)) {
            this.dinheiro += this.item3.valorVenda;
            this.item3 = null;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String inv1;
        String inv2;
        String inv3;

        if(this.item1 == null) {
            inv1 = "empty";
        } else {
            inv1 = this.item1.toString();
        }
        if(this.item2 == null) {
            inv2 = "empty";
        } else {
            inv2 = this.item2.toString();
        }
        if(this.item3 == null) {
            inv3 = "empty";
        } else {
            inv3 = this.item3.toString();
        }
        return "Nome: " + this.nome + ", Dinheiro: " + this.dinheiro + ", Inventario: [" + inv1 + ", " + inv2 + ", " + inv3 + "]";
    }
}