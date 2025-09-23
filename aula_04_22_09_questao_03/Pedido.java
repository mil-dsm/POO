package POO.aula_04_22_09_questao_03;

public class Pedido {
	int valor;
	int status;
	
	public void exibirStatus(Pedido p) {
		switch(p.valor) {
			case 1:
				System.out.println("Em preparação.\n");
				break;
			case 2:
				System.out.println("Em transporte.\n");
				break;
			case 3:
				System.out.println("Entregue.\n");
				break;
			default:
				System.out.println("Status inválido.\n");
				break;
		}
	}
}