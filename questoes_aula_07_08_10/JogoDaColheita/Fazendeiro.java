package POO.questoes_aula_07_08_10.JogoDaColheita;

public class Fazendeiro {
    String nome;
    int dinheiro;

    Item item1;
    Item item2;
    Item item3;

    public Fazendeiro(String nome) {
        this.nome = nome;
        dinheiro = 100;
        item1 = null;
        item2 = null;
        item3 = null;
    }

    public boolean colher(Item item) {
        if(item1 == null) {
            item1 = item;
            return true;
        } else if(item2 == null) {
            item2 = item;
            return true;
        } else if(item3 == null) {
            item3 = item;
            return true;
        }
        return false; // Inventário cheio
    }

    public boolean vender(String nomeItem) {
        if(item1 != null && item1.nome.equals(nomeItem)) {
            dinheiro += item1.getValorVenda();
            item1 = null;
            return true;
        } else if(item2 != null && item2.nome.equals(nomeItem)) {
            dinheiro += item2.getValorVenda();
            item2 = null;
            return true;
        } else if(item3 != null && item3.nome.equals(nomeItem)) {
            dinheiro += item3.getValorVenda();
            this.item3 = null;
            return true;
        }
        return false; // Item não encontrado
    }

    public String toString() {
        String i1;
        String i2;
        String i3;

        // Montando a string dos itens
        if(item1 == null) {
            i1 = "empty";
        } else {
            i1 = item1.toString();
        }
        if(item2 == null) {
            i2 = "empty";
        } else { 
            i2 = item2.toString();
        }
        if(item3 == null) {
            i3 = "empty";
        } else {
            i3 = item3.toString();
        }
        return "Nome: " + nome + ", Dinheiro: " + dinheiro + ", Inventario: [" + i1 + ", " + i2 + ", " + i3 + "]";
    }
}