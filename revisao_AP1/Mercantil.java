package POO.Revisao_AP1;

public class Mercantil {
    public Produto p1 = new Produto();
    public Produto p2 = new Produto();
    public Produto p3 = new Produto();
    public Produto p4 = new Produto();
    public Produto p5 = new Produto();
    private int codigoPromocional;

    public Mercantil(){
        codigoPromocional = 0;
    }
    
    public int getCodigoPromocional(){
        return (codigoPromocional);
    }

    public void setCodigoPromocional(int codigoPromocional){
        this.codigoPromocional = codigoPromocional;
    }

    public boolean compra(Produto p){
        if(p1 == null){
            p1 = p;
            return true;
        } else if(p2 == null){
            p2 = p;
            return true;
        } else if(p3 == null){
            p3 = p;
            return true;
        } else if(p4 == null){
            p4 = p;
            return true;
        } else if(p5 == null){
            p5 = p;
            return true;
        } else{
            return false;
        }
    }

    public boolean compra(Produto produto1, Produto produto2){
        boolean v1 = compra(produto1);
        boolean v2 = compra(produto2);
        return v1 && v2;
    }

    public boolean compra (Produto produto1, Produto produto2, Produto produto3){
        boolean v1 = compra(produto1);
        boolean v2 = compra(produto2);
        boolean v3 = compra(produto3);
        return v1 && v2 && v3;
    }

    public boolean venda(Produto p, Cliente c){
        if(c.getDinheiro() >= p.getValor()){
            c.setDinheiro(c.getDinheiro() - p.getValor());
            if(p == p1){
                p1 = null;
            }
            if(p == p2){
                p2 = null;
            }
            if(p == p3){
                p3 = null;
            }
            if(p == p4){
                p4 = null;
            }
            else if(p == p5){
                p5 = null;
            }
            return (true);
        } else{
            return (false);
        }
    }

    public String toString(){
        return "p1 = " + (p1 != null ? p1.nome : "vazio") +
       " p2 = " + (p2 != null ? p2.nome : "vazio") +
       " p3 = " + (p3 != null ? p3.nome : "vazio") +
       " p4 = " + (p4 != null ? p4.nome : "vazio") +
       " p5 = " + (p5 != null ? p5.nome : "vazio");
    }
}