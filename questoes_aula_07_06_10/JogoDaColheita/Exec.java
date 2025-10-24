/*1. Classe Item (Para Inventário)
Atributos:

nome (String)

valorVenda (int)

Construtor:

Recebe o nome e o valorVenda e os inicializa.

Métodos:

getNome(): Retorna o nome do item.

getValorVenda(): Retorna o valor de venda do item.

toString(): Retorna o item no formato: [nome]:[valorVenda] (Ex: "Cenoura:10").

2. Classe Fazendeiro
Esta classe gerencia o estado e as ações do jogador.

Atributos de Estado:

nome (String)

dinheiro (int, inicializado em 100)

Atributo de Inventário (Composição Fixa de 3):

item1 (do tipo Item, inicializado como null)

item2 (do tipo Item, inicializado como null)

item3 (do tipo Item, inicializado como null)

Construtor:

Recebe apenas o nome. Inicializa dinheiro em 100 e todos os atributos de item (item1, item2, item3) como null.

Métodos de Ação:

colher(Item item): Adiciona o item recebido ao primeiro slot vazio (null) do inventário (na ordem: item1, item2, item3).

Se houver um slot disponível (null), ele é preenchido, e o método retorna true.

Se todos os slots estiverem ocupados, o método retorna false.

vender(String nomeItem): Vende um item específico do inventário.

Procura o primeiro Item com o nome correspondente (verificando item1, item2, e item3).

Se o item for encontrado:

Adiciona o valorVenda do item encontrado ao dinheiro.

O atributo do item (item1, item2, ou item3) deve ser setado para null (marcando o slot como vazio).

Retorna true.

Se o item não for encontrado, o dinheiro e o inventário não mudam. Retorna false.

Método de Saída:

toString(): Retorna o estado do fazendeiro no formato, incluindo o inventário. Os slots vazios devem ser representados pela palavra empty (sem aspas).

Nome: [nome]
Dinheiro: [dinheiro]
Inventario: [item1.toString(), item2.toString(), item3.toString()]
(Se um slot for null, use empty. Ex: Nome: Alice, Dinheiro: 120, Inventario: [Cenoura:10, empty, Tomate:15])

TESTES

>>>>>>>> INSERT test_limite_slot_atributos
$criar Bob
$colher Cenoura 10
$colher Tomate 15
$colher Abobora 20
$colher Alface 5
$show
$vender Tomate
$show
$colher Milho 30
$show
$end
======== EXPECT
$criar Bob
$colher Cenoura 10
colheita: ok
$colher Tomate 15
colheita: ok
$colher Abobora 20
colheita: ok
$colher Alface 5
colheita: inventario cheio
$show
Nome: Bob, Dinheiro: 100, Inventario: [Cenoura:10, Tomate:15, Abobora:20]
$vender Tomate
venda: ok
$show
Nome: Bob, Dinheiro: 115, Inventario: [Cenoura:10, empty, Abobora:20]
$colher Milho 30
colheita: ok
$show
Nome: Bob, Dinheiro: 115, Inventario: [Cenoura:10, Milho:30, Abobora:20]
$end
$end
<<<<<<<< FINISH

>>>>>>>> INSERT test_venda_seletiva_atributos
$criar Clara
$colher Pimenta 5
$colher Pimenta 5
$show
$vender Brocolis
$show
$vender Pimenta
$show
$vender Pimenta
$show
$vender Pimenta
$show
$end
======== EXPECT
$criar Clara
$colher Pimenta 5
colheita: ok
$colher Pimenta 5
colheita: ok
$show
Nome: Clara, Dinheiro: 100, Inventario: [Pimenta:5, Pimenta:5, empty]
$vender Brocolis
venda: item nao encontrado
$show
Nome: Clara, Dinheiro: 100, Inventario: [Pimenta:5, Pimenta:5, empty]
$vender Pimenta
venda: ok
$show
Nome: Clara, Dinheiro: 105, Inventario: [empty, Pimenta:5, empty]
$vender Pimenta
venda: ok
$show
Nome: Clara, Dinheiro: 110, Inventario: [empty, empty, empty]
$vender Pimenta
venda: item nao encontrado
$show
Nome: Clara, Dinheiro: 110, Inventario: [empty, empty, empty]
$end
$end
<<<<<<<< FINISH */

package POO.questoes_aula_07_08_10.JogoDaColheita;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        Fazendeiro fazendeiro = null; 

        while (entrada.hasNextLine()) {
            String line = entrada.nextLine().trim();
            if (line.isEmpty()) continue;
            
            String[] par = line.split(" ");
            String cmd = par[0];

            System.out.println(line);

            if (cmd.equals("$criar")) {
                
                String nome = par[1];
                //INSTANCIE O FAZENDEIRO AQUI E ATRIBUA A REFERÊNCIA fazendeiro
                fazendeiro = new Fazendeiro(nome);
            }
            else if (fazendeiro == null) {
                System.out.println("fail: fazendeiro nao criado");
            }
            else if (cmd.equals("$show")) {
                System.out.println(fazendeiro);
            }
            else if (cmd.equals("$colher")) {
                
                String nomeItem = par[1];
                int valor = Integer.parseInt(par[2]);
                // INSTANCIE UM ITEM PASSANDO NOMEITEM E VALOR PARA ELE. CHAME A REFERÊNCIA DE item 
                Item item = new Item(nomeItem, valor);
                boolean sucesso = fazendeiro.colher(item);
                System.out.println(sucesso ? "colheita: ok" : "colheita: inventario cheio");
            }
            else if (cmd.equals("$vender")) {
                String nomeItem = par[1];
                boolean sucesso = fazendeiro.vender(nomeItem); //COMPLEMENTE ESTA LINHA FAZENDO UMA CHAMADA A VENDER, PASSANDO NOMEITEM
                System.out.println(sucesso ? "venda: ok" : "venda: item nao encontrado");
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