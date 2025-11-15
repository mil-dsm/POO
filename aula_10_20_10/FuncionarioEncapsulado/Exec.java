package POO.aula_10_20_10.FuncionarioEncapsulado;

import java.util.Scanner;

public class Exec{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		Scanner entradaFloat = new Scanner(System.in);
	
		String nome;
		float salario;
		
		
 		Funcionario f2 = new Funcionario("Amelia", 1380);

		nome = entrada.nextLine();
		salario = entradaFloat.nextFloat();
		Funcionario f1 = new Funcionario(nome, salario);
		
		if(f1.tirarFerias(15)) {
			System.out.println("O funcinário "+ f1.getNome()+ " tirou "
					+f1.getQuantidadeDiasFerias() + " dias de férias");
		}else {
			System.out.println("O funcionário" + f1.getNome()+ " já está de férias.");
		}

		f2.setNome(entrada.nextLine());
		f2.setSalario(entradaFloat.nextFloat());
		
		if(f2.tirarFerias()) {
			System.out.println("O funcinário "+ f2.getNome()+ " tirou "
					+f2.getQuantidadeDiasFerias() + " dias de férias");
		}else {
			System.out.println("O funcionário" + f2.getNome()+ " já está de férias.");
		}
		
		f1.exibirBonus(); 
		f2.exibirBonus();
		

        entrada.close();
        entradaFloat.close();
		

	}
}