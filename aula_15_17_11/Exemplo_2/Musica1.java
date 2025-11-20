package POO.aula_15_17_11.Exemplo_2;

import java.util.Scanner;

public class Musica1 {
    public static Instrumento criarInstrumento(int i) {
        switch(i) {
            case 1:
                return new Flauta();
            case 2:
                return new Saxofone();
            case 3:
                return new Violao();
            default:
                return new Instrumento();
        }
    }

    public static void main (String args[]) {
        int opc = -1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("EXEMPLO 1:\nDigite o tipo de instrumento a ser tocado: \n1 - Flauta\n2 - Saxofone\n3 - Violão\n");
        opc = entrada.nextInt();

        Instrumento i = criarInstrumento(opc);
        i.tocar("DÓ");
        i.tocar("RÉ");
        i.tocar("MI");
        i.tocar("FÁ");
        i.tocar("SOL");
        i.tocar("LÁ");
        i.tocar("SI");
        entrada.close();
    }
}
