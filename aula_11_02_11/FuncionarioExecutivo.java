package POO.aula_11_02_11;

public class FuncionarioExecutivo extends Funcionario {
	double beneficio;
	int quantidadeFuncionarios;
	
	public FuncionarioExecutivo(String nome, String endereco, String cpf, int idade, String sexo, int matricula, String dataAdmissao, boolean estaDeFerias, double beneficio, int quantidadeFuncionarios) {
		super(nome, endereco, cpf, idade, sexo, matricula, dataAdmissao, estaDeFerias);
		this.beneficio = beneficio;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
}