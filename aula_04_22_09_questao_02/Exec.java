package POO.aula_04_22_09_questao_02;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Aluno a = new Aluno();
		System.out.println("Digite o nome e a nota do aluno:\n");
		a.nome = entrada.nextLine();
		a.nota = entrada.nextFloat();
		entrada.close();
		a.avaliarAluno(a);
	}
}
