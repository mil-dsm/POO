package POO.aula_02_15_09;

public class Carro {
	String marca;
	String modelo;
	int ano;
	String numeroChassi;
	String placa;
	String cor;
	int velocidade;
	int volumeSom;
	boolean limpadorParabrisaLigado;
	boolean faroisLigados;
	
	public void acelerar() {
		velocidade = velocidade + 1;
	}
	public void desacelerar() {
		velocidade = velocidade - 1;
	}
	// Aumentar volume do som
	public void aumentarVolumeSom() {
        volumeSom++;
    }
	// baixar volume do som
	public void baixarVolumeSom() {
        volumeSom--;
    }
	// Acionar limpador
	public void acionarLimpador() {
        limpadorParabrisaLigado = true;
    }
	// Desligar limpador
    public void desligarLimpador() {
        limpadorParabrisaLigado = false;
    }
	// Acionar faróis 
	public void acenderFarois() {
        faroisLigados = true;
    }
	// Desligar faróis
    public void desligarFarois() {
        faroisLigados = false;
    }
}