package POO.questoes_aula_07_06_10.AluguelDeCarros;

public class Locadora {
    static int totalCarrosAlugados = 0;

    static void registrarAluguel() {
        totalCarrosAlugados++;
    }

    static void registrarDevolucao() {
        totalCarrosAlugados--;
    }

    static int getTotalAlugados() {
        return totalCarrosAlugados;
    }
}