package POO.Revisao_AP1;
import java.util.Scanner;

public class Exec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Mercantil mercantil = null;
        Cliente cliente = null;
        Produto p1 = null;
        Produto p2 = null;
        Produto p3 = null;
        Produto p4 = null;
        Produto p5 = null;

        int opcao = -1;

        while (opcao != 0) {
            
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar 5 produtos");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Criar mercantil");
            System.out.println("4 - Mercantil comprar os 5 produtos");
            System.out.println("5 - Mercantil vender (Produto 1) para cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Cadastro de 5 produtos (nome valor data):");
                    System.out.print("Produto 1: ");
                    p1 = new Produto(scanner.next(), scanner.nextDouble(), scanner.next());
                    System.out.print("Produto 2: ");
                    p2 = new Produto(scanner.next(), scanner.nextDouble(), scanner.next());
                    System.out.print("Produto 3: ");
                    p3 = new Produto(scanner.next(), scanner.nextDouble(), scanner.next());
                    System.out.print("Produto 4: ");
                    p4 = new Produto(scanner.next(), scanner.nextDouble(), scanner.next());
                    System.out.print("Produto 5: ");
                    p5 = new Produto(scanner.next(), scanner.nextDouble(), scanner.next());
                    System.out.println("5 Produtos cadastrados.");
                    break;
                case 2:
                    System.out.println("Cadastro de cliente (nome dinheiro):");
                    cliente = new Cliente(scanner.next(), scanner.nextDouble());
                    System.out.println("Cliente cadastrado.");
                    break;
                case 3:
                    System.out.println("Criar mercantil:");
                    mercantil = new Mercantil();
                    System.out.println("Mercantil criado.");
                    break;
                case 4:
                    System.out.println("Mercantil comprando produtos...");
                    // Lembrem-se de checar se o 'mercantil' e os 5 produtos estao instanciados antes de usar essa opcao, na prova coloquem os if necessarios pra isso
                    if (mercantil == null) {
                        System.out.println("Erro: mercantil ainda não foi criada.");
                        break;
                    }
                    if(p1 == null || p2 == null || p3 == null || p4 == null || p5 == null){
                        System.out.println("Erro: falta cadastrar algum produto.");
                        break;
                    }
                    // Usando os metodos de compra da classe Mercantil
                    mercantil.compra(p1, p2, p3); // Usa a sobrecarga para 3
                    mercantil.compra(p4);         // Usa a normal, mas vc poderia substituir esses 2 ultimos por mercantil.compra(p4, p5);
                    mercantil.compra(p5);     

                    System.out.println("Produtos comprados!");
                    System.out.println(mercantil.toString()); 
                    break;
                case 5:
                    System.out.println("Vender Produto 1 para o cliente...");
                    // Lembrem-se de checar se 'mercantil', 'p1' e 'cliente' 
                    // estao instanciados antes de usar essa opcao!
                    if(mercantil == null || p1 == null || cliente == null){
                        System.out.println("Erro: algo não está instanciado");
                        break;
                    }
                    boolean vendeu = mercantil.venda(p1, cliente);
                    if (vendeu) {
                        System.out.println("Venda de '" + p1.nome + "' realizada!");
                        System.out.println("Dinheiro restante do cliente: " + cliente.getDinheiro());
                    } else {
                        System.out.println("Venda falhou. (Cliente sem dinheiro?)");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }
        
        scanner.close();
    }
}