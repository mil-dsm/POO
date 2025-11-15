package POO.aula_12_05_11.Locadora;

public class Carro extends Veiculo{
	int capacidadePortaMalas;
	
	public Carro(String placa) {
		super(placa);
	}

    @Override
    public String toString(){
        return "Carro: Placa: " + placa + ", Disponivel: " + (disponivel == true ? "sim" : "nao") + 
        "Locatario: " + (disponivel == false ? (nomeLocatario + ":" + idadeLocatario) : "empty");
    }
}