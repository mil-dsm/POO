package POO.aula_16_19_11.EncomendaComPolimorfismo;

import java.util.Scanner;

public class Exec {
    
    public static void main(String args[]) {
        
        Scanner entrada = new Scanner(System.in);
        int opc = entrada.nextInt();

        Encomenda e = null;
        
        switch (opc) {
            case 1:
                String codCarta = entrada.next();
                double pesoCarta = entrada.nextDouble();
                boolean urg = entrada.nextBoolean();
                e = new Carta(codCarta, pesoCarta, urg);
                break;
            case 2:
                // Pacote: codigo, peso, largura, altura, profundidade
                String codPacote = entrada.next();
                double pesoPacote = entrada.nextDouble();
                double larg = entrada.nextDouble();
                double alt = entrada.nextDouble();
                double prof = entrada.nextDouble();
                e = new Pacote(codPacote, pesoPacote, larg, alt, prof);
                break;
        }
        
        if (e != null) {
            double custoFinal = e.calcularCustoEnvio(); 
            System.out.println(e.toString()); 
            System.out.println("Custo de Envio: " + custoFinal); 
        }

        entrada.close();
    }
}