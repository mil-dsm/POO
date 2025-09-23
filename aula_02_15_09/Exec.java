package POO.aula_02_15_09;

import java.util.Scanner; //Em JAVA, a convenção é que classes DEVEM iniciar com letra maiúscula

public class Exec {
	public static void main(String args[]) {
		Carro c1 = new Carro();
		Scanner entrada = new Scanner(System.in);
		Scanner entradaTexto = new Scanner(System.in);

		System.out.println("Digite os dados do carro:\n (Marca, Modelo, Cor, Ano, Chassi, Placa, Velocidade, Volume do Som, Estado dos Farois, Estado dos Parabrisas)\n");
		//c1.marca = "Volkswagen";
		//c1.modelo = "Fusca";
		//c1.cor = "Bege Ipanema";
		//c1.ano = 1979;
		//c1.numeroChassi = "9BH0123O9887";
		//c1.placa = "OIG-2A75";
		//c1.velocidade = 0;
		//c1.volumeSom = 0;
		//c1.faroisLigados = false;
		//c1.limpadorParabrisaLigado = false;

		c1.marca = entradaTexto.nextLine();
		c1.modelo = entradaTexto.nextLine();
		c1.cor = entradaTexto.nextLine();
		c1.ano = entrada.nextInt();
		c1.numeroChassi = entradaTexto.nextLine();
		c1.placa = entradaTexto.nextLine();
		c1.velocidade = entrada.nextInt();
		c1.volumeSom = entrada.nextInt();
		c1.faroisLigados = entrada.nextBoolean();
		c1.limpadorParabrisaLigado = entrada.nextBoolean();

		entrada.close();
		entradaTexto.close();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c1.aumentarVolumeSom();
		c1.aumentarVolumeSom();

		c1.acionarLimpador();
		
		c1.acenderFarois();

		System.out.println("A velocidade atual do carro é " + c1.velocidade + ".\n");
		System.out.println("O volume atual do som é " + c1.volumeSom + ".\n");
		if(c1.limpadorParabrisaLigado == true)
			System.out.println("O limpador de parabrisa está ligado.\n");
		else
			System.out.println("O limpador de parabrisa está desligado.\n");
		if(c1.faroisLigados == true)
			System.out.println("Os faróis estão ligados.\n");
		else
			System.out.println("Os faróis estão desligados.\n");
	}

}