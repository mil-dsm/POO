package POO.aula_15_17_11.Exemplo_3;

// Classe de implementação de instrumentos
// A generalização e especificação, logo, o exemplo possui herança
import java.util.Scanner;

public class Musica2 {
    public static void fazTocar(Instrumento i) {
        i.tocar("DÓ");
        i.tocar("RÉ");
        i.tocar("MI");
        i.tocar("FÁ");
        i.tocar("SOL");
        i.tocar("LÁ");
        i.tocar("SI");
    }

    public static void main (String args[]) {
        int opc = -1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nEXEMPLO 2:\nDigite o tipo de instrumento a ser tocado: \n1 - Flauta\n2 - Saxofone\n3 - Violão\n");
        opc = entrada.nextInt();
        switch(opc) {
            case 1:
                fazTocar(new Flauta());
                break;
            case 2:
                fazTocar(new Flauta());
                break;
            case 3:
                fazTocar(new Flauta());
                break;
            default:
                fazTocar(new Flauta());
                break;
        }
        entrada.close();
    }
}
