package POO.aula_09_15_10.ContaBancariaEncapsulada;

public class ContaBancaria {
    private Correntista correntista;
    private double saldo;
    private boolean contaEhEspecial;

    // getCorrentista()
    public Correntista getCorrentista(){
        return this.correntista;
    }
    // setCorrentista()
    public void setCorrentista(Correntista correntista){
        this.correntista = correntista;
    }
    // getSaldo()
    public double getSaldo(){
        return this.saldo;
    }
    // setSaldo()
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    // getContaEhEspecial()
    public boolean getContaEhEspecial(){
        return this.contaEhEspecial;
    }
    // setContaEhEspecial
    public void setContaEhEspecial(boolean contaEhEspecial){
        this.contaEhEspecial = contaEhEspecial;
    }
    
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public boolean sacar(double valor) {
        if(getContaEhEspecial() == true)
            setSaldo(getSaldo() - valor);
        else if(getSaldo() >= valor)
            setSaldo(getSaldo() - valor);
        else
            return false;
        return true;
    }

    public String toString() {
        
        String statusEspecial = "nao";
        if(getContaEhEspecial()) 
          statusEspecial = "sim";
          
        return "nome: " + this.correntista.getNome() + "\n"
             + "saldo: " + this.getSaldo() + "\n"
             + "ehEspecial: " + statusEspecial;
    }
}