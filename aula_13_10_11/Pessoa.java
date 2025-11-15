package POO.aula_13_10_11;

public class Pessoa {
	String nome;
	String endereco;
	int idade;
	String cpf;
	char sexo;
	
	public Pessoa(String nome, String endereco, int idade, String cpf, char sexo) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	public String andar(Pessoa p) {
		return "Pessoa " + nome + " está andando.";
	}
	
	public String imprimirValores() {
		return "Pessoa: " + nome + ", Idade: " + idade + ", CPF: " + cpf;
	}
}