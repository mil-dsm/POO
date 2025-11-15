package POO.aula_13_10_11;

public class Paciente extends Pessoa{
	String doenca;
	String medicacao;
	
	public Paciente(String nome, String endereco, int idade, String cpf, char sexo, String doenca, String medicacao) {
		super(nome, endereco, idade, cpf, sexo);
		this.doenca = doenca;
		this.medicacao = medicacao;
	}
	
	public String sentirDor() {
		return "Paciente " + nome + " está sentindo dor devido a " + doenca + "." ;
	}
	
	public String terAlta() {
		return "Paciente " + nome + " recebeu alta.";
	}
	
	public String imprimirValores() {
		return super.imprimirValores() + ", Doenca: " + doenca + ", Medicacao: " + medicacao;
	}
}