package POO.aula_12_05_11;

public class Exec {
    public static void main(String args[]) {
        // Criação das três instâncias
        Gato mimosa = new Gato("Felino"); 
        Cachorro rex = new Cachorro("Pastor Alemão");
        Passaro piu = new Passaro("Canário");

        System.out.println("--- INICIAL ---");
        System.out.println(mimosa);
        System.out.println(rex);
        System.out.println(piu);

        // Teste de métodos específicos
        System.out.println("\n--- ACOES ---");
        System.out.println("Rex recebeu carinho: " + rex.receberCarinho());
        System.out.println("Rex recebeu carinho: " + rex.receberCarinho());
        
        // 1. CHAMA VOAR (Resultado: 10)
        System.out.println("Piu voou: " + piu.voar(10)); 
        
        // 2. SIMULA PERDA DE UMA VIDA (Vidas: 8)
        mimosa.perderVida(); 
        System.out.println(mimosa); // <-- Adiciona a linha faltando no output
        
        // Teste de Falha (Morte por Vidas: 8 chamadas restantes)
        System.out.println("\n--- MORTE MIMOSA ---");
        
        // Loop que faz o Gato morrer na última iteração
        for(int i = 0; i < 8; i++) {
            mimosa.perderVida(); // A última chamada deve imprimir o warning
        }
        
        System.out.println(mimosa); 
        System.out.println("Som da Mimosa: " + mimosa.makeNoise()); 
        
        // Piu (vivo) tenta voar no final (Altura: 10 + 5 = 15)
        System.out.println("Piu tenta voar morto: " + piu.voar(5)); 
    }
}