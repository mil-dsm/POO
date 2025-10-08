package POO.questoes_aula_07_08_10.AluguelDeCarros;

public class Carro {
    String placa;
    boolean disponivel;
    Pessoa locatario;

    public Carro(String placa) {
        this.placa = placa;
        this.disponivel = true;
        this.locatario = null;
    }

    public boolean alugar(Pessoa locatario) {
        if(this.disponivel && locatario.getIdade() >= 18){
            this.disponivel = false;
            this.locatario = locatario;
            Locadora.registrarAluguel();
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if(!this.disponivel) {
            this.disponivel = true;
            this.locatario = null;
            Locadora.registrarDevolucao();
            return true;
        }
        return false;
    }

    public String toString() {
        if(this.disponivel) {
            return "Placa: " + this.placa + ", Disponivel: sim, Locatario: (empty)";
        } else {
            return "Placa: " + this.placa + ", Disponivel: nao, Locatario: (" + this.locatario.toString() + ")";
        }
    }
}