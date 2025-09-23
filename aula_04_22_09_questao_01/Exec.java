package POO.aula_04_22_09_questao_01;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		//Ler informações do funcionário 1
		f1.nome = entrada.nextLine();
		f1.salario = entrada.nextFloat();
		f1.exibirBonus(f1);
		//Ler informações do funcionário 2
		f2.nome = entrada.nextLine();
		f2.salario = entrada.nextFloat();
		f2.exibirBonus(f2);
		
		entrada.close();
	}
}