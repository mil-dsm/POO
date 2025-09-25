package POO.aula_04_22_09.q2;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Scanner entrada = new Scanner(System.in);
		Scanner entradaLinha = new Scanner(System.in);
		a1.nota = entrada.nextFloat();
		a1.nome = entradaLinha.nextLine();
		a2.nota = entrada.nextFloat();
		a2.nome = entradaLinha.nextLine();
		a1.avaliarAluno();
		a2.avaliarAluno();
		entrada.close();
		entradaLinha.close();
	}

	/*public static void main(String args[]) {

		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		Scanner entrada = new Scanner(System.in);
		Scanner entradaLinha = new Scanner(System.in);
		
		a1.nota = entrada.nextFloat();
		a1.nome = entradaLinha.nextLine();

		a2.nota = entrada.nextFloat();
		a2.nome = entradaLinha.nextLine();
		
		
		System.out.println(a1.avaliarAluno());
		System.out.println(a2.avaliarAluno());
		
		entrada.close();
		entradaLinha.close();
	}*/
}