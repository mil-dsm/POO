package POO.aula_04_22_09.q5;

import java.util.Scanner;

public class Exec {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		ContaBancaria x = new ContaBancaria();
		System.out.println("Titular: ");
		x.titular = entrada.nextLine();
		System.out.println("\nSaldo: ");
		x.saldo = entrada.nextDouble();
		while(true) {
			System.out.println("Saque: ");
			double y = entrada.nextDouble();
			if(y > x.saldo) {
				System.out.println("ERROR.\n");
				continue;
			}
			x.saldo -= y;
			System.out.println("Saldo disponível: " + x.saldo + "\n");
			System.out.println("Deseja continuar com os saques? Digite 1 para sim e 0 para não: ");
			int flag = entrada.nextInt();
			if(flag == 0)
				break;
		}
		entrada.close();
	}
}
//Resposta (professor):
/*public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		int saida = 0;
		float valorSaque;
		
		Scanner entrada = new Scanner(System.in);
		Scanner entradaLinha = new Scanner(System.in);
		
		
		c.titular = entradaLinha.nextLine();
		c.saldo = entrada.nextFloat();		
		
		do {
			valorSaque = entrada.nextFloat();
			if(c.saldo >= valorSaque)
				c.saque(valorSaque);
			else
				System.out.println("Erro ao sacar");
			saida = entrada.nextInt();
		}while(saida != 1);
		
}*/