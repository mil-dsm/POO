/*1. Classe Pessoa
Representa o cliente.

Atributos:

nome (String)

idade (int)

Construtor:

Recebe nome e idade e inicializa os atributos de instância de mesmo nome.

Métodos:

getNome(): Retorna o nome da pessoa.

getIdade(): Retorna a idade.

toString(): Retorna a string no formato: [nome]:[idade] (Ex: "Joao:25").

2. Classe Carro (Agregação)
Representa o veículo que pode ser alugado.

Atributos:

placa (String)

disponivel (boolean, inicia como true)

locatario (do tipo Pessoa, inicia como null)

Construtor:

Recebe apenas a placa.

Métodos de Ação:

alugar(Pessoa locatario):

Tenta alugar o carro para a Pessoa fornecida.

Restrições: Se o carro não estiver disponivel ou a Pessoa for menor de 18 anos (idade < 18), o aluguel falha.

Se o aluguel for bem-sucedido: define disponivel para false, atribui a Pessoa ao atributo locatario, e o método retorna true.

Em caso de falha, retorna false.

devolver():

Se o carro estiver indisponível (disponivel é false), define disponivel para true, define locatario para null, e o método retorna true.

Se o carro já estiver disponivel, retorna false.

Método de Saída:

toString(): Retorna o estado do carro. Se estiver disponível, o locatário deve ser empty. (Ex: Placa: ABC1234, Disponivel: sim, Locatario: (empty)) (Ex: Placa: XYZ9876, Disponivel: nao, Locatario: (Maria:30))

3. Classe Locadora (Utilitário Estático)
Esta classe não pode ser instanciada e deve gerenciar o estado global da locadora.

Atributo Estático:

totalCarrosAlugados (int, inicializado em 0)

Métodos Estáticos (static):

registrarAluguel(): Incrementa totalCarrosAlugados.

registrarDevolucao(): Decrementa totalCarrosAlugados.

getTotalAlugados(): Retorna o valor de totalCarrosAlugados.

Regra de Integração: O método Carro.alugar() deve chamar Locadora.registrarAluguel() em caso de sucesso. O método Carro.devolver() deve chamar Locadora.registrarDevolucao() em caso de sucesso.

TESTES

>>>>>>>> INSERT test_aluguel_idade_estatico
$criar_carro ABC1234
$total_alugados
$alugar Ana 17
$show
$alugar Bia 20
$show
$total_alugados
$devolver
$show
$total_alugados
$end
======== EXPECT
$criar_carro ABC1234
$total_alugados
Total: 0
$alugar Ana 17
aluguel: falha
$show
Placa: ABC1234, Disponivel: sim, Locatario: (empty)
$alugar Bia 20
aluguel: ok
$show
Placa: ABC1234, Disponivel: nao, Locatario: (Bia:20)
$total_alugados
Total: 1
$devolver
devolucao: ok
$show
Placa: ABC1234, Disponivel: sim, Locatario: (empty)
$total_alugados
Total: 0
$end
$end
<<<<<<<< FINISH

>>>>>>>> INSERT test_reuso_devolucao_dupla
$criar_carro XYZ9876
$alugar Carlos 35
$show
$alugar Dani 40
$show
$devolver
$devolver
$show
$end
======== EXPECT
$criar_carro XYZ9876
$alugar Carlos 35
aluguel: ok
$show
Placa: XYZ9876, Disponivel: nao, Locatario: (Carlos:35)
$alugar Dani 40
aluguel: falha
$show
Placa: XYZ9876, Disponivel: nao, Locatario: (Carlos:35)
$devolver
devolucao: ok
$devolver
devolucao: falha
$show
Placa: XYZ9876, Disponivel: sim, Locatario: (empty)
$end
$end
<<<<<<<< FINISH */

package POO.aula_07_06_10.AluguelDeCarros;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        Carro carro = null; 

        while (entrada.hasNextLine()) {
            String line = entrada.nextLine().trim();
            if (line.isEmpty()) continue;
            
            String[] par = line.split(" ");
            String cmd = par[0];

            System.out.println(line);

            if (cmd.equals("$criar_carro")) {
                // $criar_carro PLACA
                String placa = par[1];
                carro = new Carro(placa);
            }
            else if (carro == null) {
                System.out.println("fail: carro nao criado");
            }
            else if (cmd.equals("$alugar")) {
                // $alugar NOME IDADE
                String nome = par[1];
                int idade = Integer.parseInt(par[2]);
                Pessoa pessoa = new Pessoa(nome, idade);
                
                boolean sucesso = carro.alugar(pessoa);
                System.out.println(sucesso ? "aluguel: ok" : "aluguel: falha");
            }
            else if (cmd.equals("$devolver")) {
                // $devolver
                boolean sucesso = carro.devolver();
                System.out.println(sucesso ? "devolucao: ok" : "devolucao: falha");
            }
            else if (cmd.equals("$show")) {
                System.out.println(carro);
            }
            else if (cmd.equals("$total_alugados")) {
                // Deve chamar o método estático
                System.out.println("Total: " + Locadora.getTotalAlugados());
            }
            else if (cmd.equals("$end")) {
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