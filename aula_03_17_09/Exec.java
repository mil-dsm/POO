package POO.aula_03_17_09;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaTexto = new Scanner(System.in);
		
		EmpresaParticipante e1 = new EmpresaParticipante();
		Avaliador a1 = new Avaliador();
		
		System.out.println("=== INFORMÇÕES - EMPRESAS PARTICIPANTES ===\n\n");
		System.out.println("Empresa 1\n");
		System.out.println("Nome: ");
		e1.nome = entradaTexto.nextLine();
		System.out.println("Cidade: ");
		e1.cidade = entradaTexto.nextLine();
		
		System.out.println("\n\nProduto 1\n");
		System.out.println("Nome: ");
		e1.p1.nome = entradaTexto.nextLine();
		System.out.println("\nTipo: ");
		e1.p1.tipo = entradaTexto.nextLine();
		System.out.println("\nData de validade: ");
		e1.p1.dataValidade = entradaTexto.nextLine();
		
		System.out.println("\n\nProduto 2\n");
		System.out.println("Nome: ");
		e1.p2.nome = entradaTexto.nextLine();
		System.out.println("\nTipo: ");
		e1.p2.tipo = entradaTexto.nextLine();
		System.out.println("\nData de validade: ");
		e1.p2.dataValidade = entradaTexto.nextLine();
		
		System.out.println("\n\nProduto 3\n");
		System.out.println("Nome: ");
		e1.p3.nome = entradaTexto.nextLine();
		System.out.println("\nTipo: ");
		e1.p3.tipo = entradaTexto.nextLine();
		System.out.println("\nData de validade: ");
		e1.p3.dataValidade = entradaTexto.nextLine();
		
		System.out.println("=== INFORMAÇÔES SOBRE O AVALIADOR ===\n\n");
		System.out.println("Digite o nome do avaliador: ");
		a1.nome = entradaTexto.nextLine();
		System.out.println("\nDigite  experiência do avaliador: ");
		a1.experiencia = entradaTexto.nextLine();
		
		System.out.println("\n\n=== AVALIAÇÃO ===\n\nEmpresa 1.\n");
		System.out.println("Digite a nota do produto 1: ");
		a1.avaliar(e1.p1);
		System.out.println("\nDigite a nota do produto 2: ");
		a1.avaliar(e1.p2);
		System.out.println("\nDigite a nota do produto 3: ");
		a1.avaliar(e1.p3);
		
		entrada.close();
		entradaTexto.close();
		
		System.out.println("\n\n=== PLACARES E INFORMAÇÕES ===\n\n");
		System.out.println("Empresa " + e1.nome + ", cidade " + e1.cidade + "\n");
		System.out.println("Produto 1:\nNome: " + e1.p1.nome + "\nTipo: " + e1.p1.tipo + "\nData de validade: " + e1.p1.dataValidade + "\n");
		System.out.println("Produto 2:\nNome: " + e1.p2.nome + "\nTipo: " + e1.p2.tipo + "\nData de validade: " + e1.p2.dataValidade + "\n");
		System.out.println("Produto 3:\nNome: " + e1.p3.nome + "\nTipo: " + e1.p3.tipo + "\nData de validade: " + e1.p3.dataValidade + "\n");
		System.out.println("=== PLACARES E INFORMAÇÕES ===\n");
	}
}