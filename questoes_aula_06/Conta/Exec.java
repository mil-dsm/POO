/*/*Crie um sistema para contas bancárias. Você deve criar duas classes: Correntista e ContaBancaria

1. Classe Correntista
A classe Correntista deve ser simples, contendo as informações da pessoa:

Atributos:

nome (String)

cpf (String)

Construtor:

Um construtor que recebe e inicializa o nome e o cpf.

2. Classe ContaBancaria
A classe ContaBancaria deve ter os seguintes elementos:

Atributos:

correntista (do tipo Correntista)

saldo (double)

contaEhEspecial (boolean)

Construtores (Recebe o objeto Correntista):

Um construtor que recebe apenas o objeto Correntista. O saldo deve ser inicializado em 0 e contaEhEspecial como false.

Um construtor que recebe o objeto Correntista e o saldo inicial. O contaEhEspecial deve ser false.

Um construtor que recebe o objeto Correntista, o saldo inicial e o status contaEhEspecial.

Métodos de Ação:

Um método depositar que recebe um valor (double) e AUMENTA o atributo saldo da conta.

Um método sacar que recebe um valor (double) e tenta DIMINUIR o atributo saldo.

Regra de Saque (Restrição): Se a conta for especial (contaEhEspecial for true), o saque é sempre permitido (o saldo pode se tornar negativo).

Se a conta NÃO for especial, o saque só é permitido se o saldo for maior ou igual ao valor do saque.

O método sacar deve retornar true se o saque foi realizado e false caso contrário.

Método de Saída:

Um método para representação da classe (toString()) que retorna uma String com todos os valores da conta.

>>>>>>>> INSERT composicao_normal

criar
Pedro Silva
12345678900
1000
N
depositar
500
mostrar
sacar
700
mostrar
sacar
900
mostrar
end
======== EXPECT
$criar
$Pedro Silva
$12345678900
$1000
$N
$depositar
$500
nome: Pedro Silva
saldo: 1500.0
ehEspecial: nao
$mostrar
nome: Pedro Silva
saldo: 1500.0
ehEspecial: nao
$sacar
$700
nome: Pedro Silva
saldo: 800.0
ehEspecial: nao
$mostrar
nome: Pedro Silva
saldo: 800.0
ehEspecial: nao
$sacar
$900
nome: Pedro Silva
saldo: 800.0
ehEspecial: nao
$mostrar
nome: Pedro Silva
saldo: 800.0
ehEspecial: nao
$end
$end
<<<<<<<< FINISH
*/

package POO.questoes_aula_06.Conta;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = null; 
        String opc = "";

        while (entrada.hasNextLine()) {
            opc = entrada.nextLine().trim();

            // 1. Ecoa o comando (Importante para o EXPECTED)
            System.out.println("$" + opc);

            if (opc.equals("criar")) {
                // Leitura dos 4 parâmetros para criar o Correntista e a Conta
                
                String nome = entrada.nextLine().trim();
                System.out.println("$" + nome);
                
                String cpf = entrada.nextLine().trim();
                System.out.println("$" + cpf);
                
                String saldoStr = entrada.nextLine().trim();
                System.out.println("$" + saldoStr);
                double saldo = Double.parseDouble(saldoStr);
                
                String especialStr = entrada.nextLine().trim();
                System.out.println("$" + especialStr);
                boolean ehEspecial = especialStr.equalsIgnoreCase("S");
                
                // CRIAÇÃO DOS OBJETOS (Composição)
                Correntista correntista = new Correntista(nome, cpf);
                
                // Usa o objeto correntista no construtor da ContaBancaria
                conta = new ContaBancaria(correntista, saldo, ehEspecial);
            }
            else if (conta == null) {
                System.out.println("ERRO: Conta ainda não foi criada. Use 'criar'.");
            }
            else if (opc.equals("mostrar")) {
                // Chama o toString() da ContaBancaria
                System.out.println(conta); 
            }
            else if (opc.equals("depositar")) {
                String valorStr = entrada.nextLine().trim();
                System.out.println("$" + valorStr);
                double valor = Double.parseDouble(valorStr);
                conta.depositar(valor);
                // Exibe o estado da conta após a operação para verificação do teste
                System.out.println(conta); 
            }
            else if (opc.equals("sacar")) {
                String valorStr = entrada.nextLine().trim();
                System.out.println("$" + valorStr);
                double valor = Double.parseDouble(valorStr);
                conta.sacar(valor);
                // Exibe o estado da conta após a operação para verificação do teste
                System.out.println(conta); 
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