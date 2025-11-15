/*Esta é uma variação da questão da toalha que já fizemos. Altere seu código para encapsular a classe Toalha. DICA: Utilize o código que você já tem e faça somente as alterações para que Toalha se torne encapsulada. 

O enunciado segue a baixo.

Crie uma classe Toalha. A classe Toalha deve ter:

Os atributos cor , tamanho e umidade
Um método mostrar, que mostra todos os valores dos atributos da toalha (cor, tamanho e umidade).
Um método enxugar que recebe um valor inteiro quantidade e AUMENTA o atributo umidade da toalha.
Um método torcer que zera o atributo umidade da toalha.
Um método para retornar o máximo de umidade getMaxUmidade que não recebe parâmetros retorna o valor máximo de umidade que essa toalha pode ter.
O máximo de umidade que uma toalha pode ter é de acordo com o tamanho dela:
P -> 10
M -> 20
G -> 30
Um método que retorna se a toalha esta seca ou não chamado estaSeca, que retorna true se a umidade da toalha for 0 e false caso contrário.
Utilize a classe de execução do arquivo abaixo e complemente-a.

>>>>>>>> INSERT criação
criar
azul
P
mostrar
end
======== EXPECT
$criar
$azul
$P
$mostrar
azul P 0
$end
$end
<<<<<<<< FINISH */

package POO.aula_08_08_10.ToalhaEncapsulada;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        Toalha t1 = new Toalha();
        String opc = "";

        while (entrada.hasNextLine()) {
            opc = entrada.nextLine().trim();

            System.out.println("$" + opc);

            if (opc.equals("criar")) {
                String cor = entrada.nextLine().trim();
                System.out.println("$" + cor);

                String tamanho = entrada.nextLine().trim();
                System.out.println("$" + tamanho);

                t1.setCor(cor);
                t1.setTamanho(tamanho.charAt(0));
            }
            else if (opc.equals("mostrar")) {
                t1.mostrar();
            }
            else if (opc.equals("enxugar")) {
                String qtdStr = entrada.nextLine().trim();
                System.out.println("$" + qtdStr);
                int qtd = Integer.parseInt(qtdStr);
                t1.enxugar(qtd);
               t1.mostrar();
            }
            else if (opc.equals("seca")) {
                if(t1.estaSeca())
                    System.out.println("SIM");
                else
                    System.out.println("NAO");
            }
            else if (opc.equals("torcer")) {
                t1.torcer();
                t1.mostrar();
            }
            else if (opc.equals("end") || opc.equals("sair")) {
                System.out.println("$end");
                break; 
            }
            else {
                System.out.println("comando invalido");
            }
        }
        entrada.close();
    }
}