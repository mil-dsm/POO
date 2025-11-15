package POO.aula_07_06_10.AluguelDeCarros;

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
        // Maior de idade
        if(this.disponivel && locatario.getIdade() >= 18){

            // Aluguel realizado
            this.disponivel = false;
            this.locatario = locatario;

            // Contabilizando aluguel
            Locadora.registrarAluguel();
            // Outra forma:
            // Locadora l = new Locadora();
            // l.registrarAluguel();
            return (true);
        }
        return false;
    }

    public boolean devolver() {
        // Verificando se o carro está alugado
        if(!this.disponivel) {
            this.disponivel = true;
            this.locatario = null;

            // Integração com a classe estática
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