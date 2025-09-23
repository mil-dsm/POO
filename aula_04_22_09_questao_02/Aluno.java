package POO.aula_04_22_09_questao_02;

public class Aluno {
	String nome;
	Float nota;
	public void avaliarAluno(Aluno a) {
		if(a.nota >= 6)
			System.out.println("Aprovado.\n");
		else
			System.out.println("Reprovado.\n");
	}
}
