package POO.aula_04_22_09.q3;

public class Pedido {
	int valor;
	
	public void exibirStatus(Pedido p) {
		switch(valor) {
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