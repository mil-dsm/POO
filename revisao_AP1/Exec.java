package POO.revisao_AP1;

import java.util.Scanner; 

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaTexto = new Scanner(System.in);
		Produtos p = new Produtos();
		Cliente cliente = new Cliente();
		Mercantil m = new Mercantil();
		while(true) {
			System.out.println("1 - Cadastrar Produtos\n2 - Cadastrar Clientes\n3 - Criação de Mercantil\n4 - Compra\n5 - Venda\n0 - Sair");
            int num = entrada.nextInt();
            if (num == 0) { // Opção de saída
                break;
            }
			// Cadastrar produtos
			if(num == 1) {
				System.out.println("Digite nome, valor e data de validade:");
				String nomeProduto = entradaTexto.nextLine();
				p.setNome(nomeProduto);
				p.valor = entrada.nextFloat();
				p.dataValidade = entradaTexto.nextLine();
			}
			// Cadastrar clientes
			if(num == 2) {
				System.out.println("Digite nome e dinheiro:");
				String nomeCliente = entradaTexto.nextLine();
				cliente.setNome(nomeCliente);
				cliente.dinheiro = entrada.nextFloat();
			}
			// Criação de mercantil
			if(num == 3) {
				System.out.println("Digite o código promocional:");
                int codigo = entrada.nextInt();
				Mercantil.setCodigo(codigo); // Manipulação do método estático
			}
			// Compra de produtos
			if(num == 4) {
				if(p != null) {
					m.comprar(p);
					System.out.println("Sucesso ao comprar o produto.");
				} else {
					System.out.println("Erro ao comprar o produto.");
				}
			}
			// Venda de produtos
			if(num == 5) {
				if(p != null && cliente != null) {
					m.vender(p, cliente);
					System.out.println("Sucesso ao comprar o produto.");
				} else {
					System.out.println("Erro ao vender o produto.");
				}
			}
			entrada.close();
		    entradaTexto.close();
		}
	}
}