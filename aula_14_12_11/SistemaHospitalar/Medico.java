package POO.aula_14_12_11.SistemaHospitalar;

public class Medico extends Pessoa{
	String crm;
	double salario;
	String especializacao;
	
	public Medico(String nome, String endereco, int idade, String cpf, char sexo, String crm, double salario, String especializacao) {
		super(nome, endereco, idade, cpf, sexo);
		this.crm = crm;
		this.salario = salario;
		this.especializacao = especializacao;
	}
	
	public String darPlantao() {
		return "Médico " + nome + " de " + especializacao + " está em plantão.";
	}
	
	@Override
	public String imprimirValores() {
		return super.imprimirValores() + ", CRM: " + crm + ", Salario: " + salario;
	}
}