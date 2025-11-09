package POO.aula_11_02_11;

public class Funcionario extends Pessoa {
	int matricula;
	double salario;
	String dataAdmissao;
	boolean estaDeFerias;
	
	public Funcionario(String nome, String endereco, String cpf, int idade, String sexo, int matricula, String dataAdmissao, boolean estaDeFerias) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.matricula = matricula;
		this.dataAdmissao = dataAdmissao;
		this.estaDeFerias = estaDeFerias;
	}
	
	public boolean tirarFerias() {
		if(!estaDeFerias) {
			estaDeFerias = true;
			return true;
		}
		return false;
	}
}