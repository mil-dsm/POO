/*Considere que as características/comportamentos relevantes a todas as lâmpadas são as seguintes:

A lâmpada pode estar "ligada" ou "desligada".
A lâmpada começa com estado desligada.
Precisamos saber quantas vezes uma lâmpada foi ligada por meio de um contador de ligações da lâmpada.
O estado da lâmpada deve ser alterado de ligado para desligado e vice-verso por meio de um método chamado muda, que deve fazer a alteração no estado e atualizar o contador de ligações sempre que a lâmpada for ligada.
>>>>>>>> INSERT criação

======== EXPECT
true
2
<<<<<<<< FINISH

Arquivos requeridos
Exec.java
public class Exec {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        //Faça uma chamada ao método de mudar o estado da lâmpada aqui.
        //Faça uma chamada ao método de mudar o estado da lâmpada aqui.
        //Faça uma chamada ao método de mudar o estado da lâmpada aqui.
        System.out.println(l1.ligada); // Altere o nome do atributo para ficar igual ao de sua classe, caso necessário
        System.out.println(l1.contadorVezesLigada); // Altere o nome do atributo para ficar igual ao de sua classe, caso necessário
    }
} */

package POO.questoes_aula_06_06_10.Lampada;

public class Exec {
    public static void main(String args[]) {
        Lampada l1 = new Lampada();
        l1.muda();
        l1.muda();
        l1.muda();
        System.out.println(l1.ligada);
        System.out.println(l1.contadorVezesLigada);
    }
}