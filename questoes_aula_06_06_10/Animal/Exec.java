/*Animal que nasce, cresce, morre
cover
cover
Intro
O objetivo dessa atividade é implementar um animal que passa pelas diversas fases de crescimento até a morte.

Descrição
O animal tem uma espécie species, um estágio age de vida e um barulho noise que ele faz.
O construtor do animal
Recebe a espécie e o barulho e inicia o estágio com 0.
Animal tem um método chamado toString que deve retornar os dados do animal no formato
{species}:{age}:{noise}.
Os estágios pelos quais o animal passa são:
0: Filhote
1: Criança
2: Adulto
3: Idoso
4: Morto
Ao envelhecer no método ageBy, o animal avança estágios na sua vida de acordo com o parâmetro increment.
Ao morrer ou tentar envelhecer após a morte do aninal, deve ser exibida a mensagem de aviso:
warning: {species} morreu.
Como essa é uma mensagem de erro, você pode imprimir diretamente no método ageBy.
Ao fazer barulho, o animal emite o som característico da sua espécie, com as seguintes restrições:
Se for filhote, emite um “—”.
Se estiver morto, emite um “RIP”.
Como não são mensagens de erro, o barulho do animal deve ser retornado no método makeSound e impresso na main.
Shell
Primeira simulação
#TEST_CASE iniciando

$init gato miau
$show
gato:0:miau

$init cachorro auau
$show
cachorro:0:auau

$init galinha cocorico
$show
galinha:0:cocorico

$end
Segunda simulação
#TEST_CASE grow

$init vaca muu
$show
vaca:0:muu

$grow 2
$show
vaca:2:muu
$grow 2
warning: vaca morreu
$show
vaca:4:muu
$grow 3
warning: vaca morreu
$show
vaca:4:muu

$end
Terceira simulação
#TEST_CASE noise

$init cabra beeh

$noise
---

$grow 1
$noise
beeh
$grow 3
warning: cabra morreu

$noise
RIP

$end
Quarta simulação
#TEST_CASE extra

$init passaro piupiu

$show
passaro:0:piupiu

$noise
---

$grow 1
$noise
piupiu

$grow 2
$noise
piupiu

$grow 1
warning: passaro morreu

$noise
RIP

$end
*/

package POO.questoes_aula_06_06_10.Animal;

import java.util.Scanner;

public class Exec {

    public static void main(String[] _args) {
        Animal animal = new Animal("", "");

        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")  ) { 
                break;
            }
            else if (cmd.equals("init") ) {
                var species = par[1];
                var noise = par[2];
                animal = new Animal(species, noise);
            } 
            else if (cmd.equals("show")) {
                System.out.println(animal);
            } 
            else if (cmd.equals("noise")) {
                System.out.println(animal.makeNoise());
            } 
            else if (cmd.equals("grow") ) {
                var increment = Integer.parseInt(par[1]);
                animal.ageBy(increment);
            }  
            else {
                System.out.println("fail: comando invalido\n");
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);
}
