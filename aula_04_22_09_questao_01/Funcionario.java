package POO.aula_04_22_09_questao_01;

public class Funcionario {
	String nome;
	float salario;
	public void exibirBonus(Funcionario f) {
		if(f.salario < 5000) 
			System.out.println("Bônus de R$ 500,00.\n");
		else
			System.out.println("Sem Bônus.\n");
	}
}