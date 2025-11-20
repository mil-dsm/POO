package POO.aula_09_15_10.ContaBancariaEncapsulada;

import java.util.Scanner;

public class Exec {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(); 

        String nome = entrada.nextLine();
        String cpf = entrada.nextLine();
        
        String saldoStr = entrada.nextLine();
        double saldo = Double.parseDouble(saldoStr);
        String especialStr = entrada.nextLine();
        
        boolean ehEspecial = false;
        if(especialStr.equals("S"))
            ehEspecial = true;
        
        Correntista correntista = new Correntista();
        correntista.setNome(nome);
        correntista.setCpf(cpf);
        
        conta.setCorrentista(correntista);
        conta.setSaldo(saldo);
        conta.setContaEhEspecial(ehEspecial);
        String valorStr = entrada.nextLine();
        
        double valor = Double.parseDouble(valorStr);
        conta.depositar(valor);
        System.out.println(conta); 
        
        valorStr = entrada.nextLine();
        valor = Double.parseDouble(valorStr);
        conta.sacar(valor);
        System.out.println(conta); 
        
        entrada.close();
    }
}