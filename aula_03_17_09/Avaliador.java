package POO.aula_03_17_09;

import java.util.Scanner;

public class Avaliador {
	String nome;
	String experiencia;
	Scanner entrada = new Scanner(System.in);
	
	public void avaliar(Produto p) {
		p.nota = entrada.nextInt();
	}

}
