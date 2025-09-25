package POO.aula_04_22_09.q4;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Produto p = new Produto();
		double precoMaisCaro = -1;
		String nomeMaisCaro = "";
		while(true) {
			//Ler novo produto
			System.out.println("Digite o nome e o preço do produto: ");
			p.nome = entrada.nextLine();
			p.preco = entrada.nextDouble();
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
				System.out.println("\nCom o preço de: " + precoMaisCaro);
				break;
			}
		}
		entrada.close();
	}
	
}

/*public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaLinha = new Scanner(System.in);
		
		Produto p = new Produto();
		Produto produtoMaisCaro = new Produto();
		
		for(int i=0; i<5; i++) {
			p.nome = entradaLinha.nextLine();
			p.preco = entrada.nextFloat();
			
			if(i==0) {
				produtoMaisCaro.nome = p.nome;
				produtoMaisCaro.preco = p.preco;
			}else if (p.preco > produtoMaisCaro.preco){
					 produtoMaisCaro.nome = p.nome;
					 produtoMaisCaro.preco = p.preco;
			}
		}
		
		System.out.println(produtoMaisCaro.nome + " " + produtoMaisCaro.preco);
}*/