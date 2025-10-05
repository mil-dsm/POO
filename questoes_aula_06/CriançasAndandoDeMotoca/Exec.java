package POO.questoes_aula_06.CriançasAndandoDeMotoca;

import java.util.*;

public class Exec {

    // Inicializa o scanner de forma estática
    static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        // CRIE SUA MOTO AQUI
         Moto m1 = null;
        Pessoa p1 = null;
        
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            } else if (cmd.equals("init")) {
                int power = par.length > 1 ? Integer.parseInt(par[1]) : 1;
                // CRIE SUA MOTO AQUI passando a potência recebida em power
                m1 = new Moto(power);
            } else if (cmd.equals("show")) {
                // MOSTRE SUA MOTO AQUI - use o método toString
                System.out.println(m1);
            } else if (cmd.equals("enter")) {
                // $enter name age
                var name = par[1];
                var age = Integer.parseInt(par[2]);
                
                // CRIE UM OBJETO PESSOA AQUI
                p1 = new Pessoa(name, age);
                 // DEPOIS INSIRA NA MOTO
                m1.inserir(p1);
            } else if (cmd.equals("leave")) {
                // RETIRE A PESSOA DA MOTO
                Pessoa p = m1.remover();
                 
                if (p != null) { 
                    // Imprime a Pessoa removida (ex: heitor:6)
                    // MOSTRE A PESSOA RETIRADA AQUI  - use o método toString
                    System.out.println(p);
                }
            } else if (cmd.equals("buy")) {
                // $buy time
                var time = Integer.parseInt(par[1]);
                // COMPRE TEMPO
                m1.buyTime(time);
            } else if (cmd.equals("drive")) {
                // $drive time
                var time = Integer.parseInt(par[1]);
                // DIRIJA A MOTO
                m1.drive(time);
            } else if (cmd.equals("honk")) {
                // $honk
                // BUZINE a moto
                m1.honk();
            } else {
                System.out.println("fail: comando invalido");
            }
        }
    }
}