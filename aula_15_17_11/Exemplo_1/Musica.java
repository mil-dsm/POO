package POO.aula_15_17_11.Exemplo_1; 

// Classe de implementação de instrumentos
// A generalização e especificação, logo, o exemplo possui herança

public class Musica {
    public static void main (String args[]) {
        // Instrumento i1 = new Instrumento();
        // Violao v1 = new Violao();
        Flauta f1 = new Flauta();
        // Saxofone s1 = new Saxofone();

        /* Ligação Precoce */
        // Em tempo de compilação sabemos que a chamada do método tocas
        // na linha 20 executará de acordo com o código de instrumento.
        // O tempo de compilação e compilador já liga a chamada do método
        // ao código que vai executar, ou seja, ele sabe que o método vai
        // ser executado em tempo de compilação
        Instrumento i2 = new Instrumento(); // Traz uma referencia e um objeto de tipos diferentes
        i2.tocar("Dó");
        Instrumento f2 = new Flauta();
        f2.tocar("Dó");
        f1.teste(); // Não é possível pois não possui um método como esse
        // Isso ainda é possível se fizer um casting
    }
}
