package POO.aula_04_22_09.q2;

public class Aluno {
	String nome;
	Float nota;

	public void avaliarAluno() {
		if(nota >= 6)
			System.out.println("Aprovado.\n");
		else
			System.out.println("Reprovado.\n");
	}
}

/*public class Aluno {
	String nome;
	float nota;
	
	public String avaliarAluno(){
		if(nota >= 6){
		   return "Aprovado";
		} else {
		   return "Reprovado";
		}	
	}

}*/