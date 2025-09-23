package POO.aula_04_22_09_questao_04;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Produto p = new Produto();
		float precoMaisCaro = -1;
		String nomeMaisCaro = "";
		while(true) {
			//Ler novo produto
			System.out.println("Digite o nome e o preço do produto: ");
			p.nome = entrada.nextLine();
			p.preco = entrada.nextFloat();
			System.out.println("\n");
			//Calcular o produto mais caro
			if(p.preco > precoMaisCaro) {
				nomeMaisCaro = p.nome;
				precoMaisCaro = p.preco;
			}
			//Verificação
			System.out.println("Deseja continuar lendo produtos? Digite 1 para sim e 0 para não: ");
			int flag = entrada.nextInt();
			if(flag == 0) {
				System.out.println("\nO produto mais caro é: " + nomeMaisCaro);
				System.out.println("Com o preço de: " + precoMaisCaro);
				break;
			}
		}
		entrada.close();
	}
}
//Código deu erro