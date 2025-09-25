package POO.aula_04_22_09.q1;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		Scanner entrada = new Scanner(System.in);
		Scanner entradaLinha = new Scanner(System.in);
		
		f1.nome = entradaLinha.nextLine();
		f1.salario = entrada.nextFloat();
		
		f2.nome = entradaLinha.nextLine();
		f2.salario = entrada.nextFloat();

		f1.exibirBonus();
		f2.exibirBonus();
		
		entrada.close();
		entradaLinha.close();
	}
}