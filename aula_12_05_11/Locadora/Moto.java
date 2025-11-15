package POO.aula_12_05_11.Locadora;

public class Moto extends Veiculo {
	
	public Moto(String placa) {
		super(placa);
	}
	
    @Override
    public boolean alugar(String nomeLocatario, int idadeLocatario){
        if(disponivel && idadeLocatario >= 18 && idadeLocatario <= 50){
            this.nomeLocatario = nomeLocatario;
            this.idadeLocatario = idadeLocatario;
            disponivel = false;
            return (true);
        }
        return (false);
    }

    @Override
    public String toString(){
        return "Moto: Placa: " + placa + ", Disponivel: " + (disponivel == true ? "sim" : "nao") + 
        "Locatario: " + (disponivel == false ? (nomeLocatario + ":" + idadeLocatario) : "empty");
    }
}