package POO.questoes_aula_06.Conta;

public class ContaBancaria {
    Correntista correntista;
    double saldo;
    boolean contaEhEspecial;

    public ContaBancaria(Correntista correntista) {
        this.correntista = correntista;
        this.saldo = 0;
        this.contaEhEspecial = false;
    }

    public ContaBancaria(Correntista correntista, double saldo) {
        this.correntista = correntista;
        this.saldo = saldo;
        this.contaEhEspecial = false;
    }

    public ContaBancaria(Correntista correntista, double saldo, boolean contaEhEspecial) {
        this.correntista = correntista;
        this.saldo = saldo;
        this.contaEhEspecial = contaEhEspecial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if(contaEhEspecial == true)
            saldo -= valor;
        else if(saldo >= valor)
            saldo -= valor;
        else
            return false;
        return true;
    }

    public String toString() {
        return "nome: " + correntista.nome + "\nsaldo: " + saldo + "\nehEspecial: " + (contaEhEspecial ? "sim" : "nao");
    }
}