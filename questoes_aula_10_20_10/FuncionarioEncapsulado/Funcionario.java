package POO.questoes_aula_10_20_10.FuncionarioEncapsulado;

public class Funcionario{
	private String nome;
	private float salario;
	private boolean estaDeFerias;
	private int quantidadeDiasFerias;

	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void exibirBonus(){
		if(salario<5000){
			System.out.println("Bonus de 500");
		}else{
			System.out.println("Sem Bonus");
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public boolean tirarFerias() {
		if(estaDeFerias == false) {
			quantidadeDiasFerias = 30;
			estaDeFerias = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tirarFerias(int quantidadeDiasFerias) {
		if(estaDeFerias == false) {
			this.quantidadeDiasFerias = quantidadeDiasFerias;
			estaDeFerias = true;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean voltarAoTrabalho() {
		if(estaDeFerias == true) {
			quantidadeDiasFerias = 0;
			estaDeFerias = false;
			return (true);
		}else {
			return (false);
		}
	}
	
	public boolean getEstaDeFerias() {
		return (this.estaDeFerias);
	}
	
	public int getQuantidadeDiasFerias() {
		return (this.quantidadeDiasFerias);
	}
}

// Resposta (professor):
/* package aula_2025_10_20;

public class Funcionario{
	private String nome;
	private float salario;
	private boolean estaDeFerias;
	private int quantidadeDiasFerias;

	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public boolean tirarFerias() {
		if(estaDeFerias == false) {
			estaDeFerias = true;
			quantidadeDiasFerias = 30;
			return(true);
		}else {
			return(false);
		}
	}
	
	public boolean tirarFerias(int quantidadeDiasFerias) {
		if(estaDeFerias == false) {
			estaDeFerias = true;
			this.quantidadeDiasFerias = quantidadeDiasFerias;
			return(true);
		}else {
			return(false);
		}
	}
	
	public boolean voltarAoTrabalho() {
		if(getEstaDeFerias() == true) {
			estaDeFerias = false;
			quantidadeDiasFerias = 0;
			return(true);
		}else {
			return(false);
		}
	}
	
	public void exibirBonus(){
		if(salario<5000){
			System.out.println("Bonus de 500");
		}else{
			System.out.println("Sem Bonus");
		}

	}
	
	public boolean getEstaDeFerias() {
		return(this.estaDeFerias);
	}
	
	public int getQuantidadeDiasFerias() {
		return(this.quantidadeDiasFerias);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}	
}*/