package POO.aula_04_22_09.q3;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaFlag = new Scanner(System.in);
		int pedidosEmPreparacao = 0;
		int pedidosEmTransporte = 0;
		int pedidosEntregues = 0;
		while(true) {
			Pedido p = new Pedido();
			System.out.println("Digite o valor dos status do pedido: ");
			p.valor = entrada.nextInt();
			System.out.println("\n");
			p.exibirStatus(p);
			if(p.valor == 1)
				pedidosEmPreparacao++;
			else if(p.valor == 2)
				pedidosEmTransporte++;
			else if(p.valor == 3)
				pedidosEntregues++;
			System.out.println("Pedidos em preparação: " + pedidosEmPreparacao + "\nPedidos em transporte: " + pedidosEmTransporte + "\nPedidos entregues: " + pedidosEntregues + "\n");
			System.out.println("Deseja continuar lendo produtos? Digite 1 para sim e 0 para não: ");
			int flag = entradaFlag.nextInt();
			System.out.println("\n");
			if(flag == 0)
				break;
		}
		entrada.close();
		entradaFlag.close();
	}
}

//Resposta (professor):
/*public class Exec {

	public static void main(String[] args) {
		int qtdPreparacao = 0;
		int qtdTransporte = 0;
		int qtdEntregues = 0;
		int sair;
		
		Scanner entrada = new Scanner(System.in);
		//Scanner entradaLinha = new Scanner(System.in);
		do {
			Pedido p = new Pedido();
			p.valor = entrada.nextFloat();
			p.status = entrada.nextInt();
			
			if(p.status == 1) {
				qtdPreparacao++;
			}else {
				if(p.status == 2) {
					qtdTransporte++;
				}else {
					if(p.status == 3)
						qtdEntregues++;
				}
			}
			
			sair = entrada.nextInt();
		}while(sair != 1);
		
		System.out.println(qtdPreparacao + " " + qtdTransporte + " " + qtdEntregues);

	}

}*/