package POO.revisao_AP1;

public class Mercantil {
	public Produtos p1 = new Produtos(); // Atributo de visibilidade pública
	private Produtos p2 = new Produtos(); // Atributo de visibilidade privada
	protected Produtos p3 = new Produtos(); // Atributo de visibilidade protegida
	Produtos p4 = new Produtos(); // Atributos de visibilidade padrão
	Produtos p5 = new Produtos();

	static int codigo; // Atributo de visibilidade estática
	
	static int getCodigo() {
		return (codigo);
	}
	
	static void setCodigo(int num) {
		codigo = num;
	}
	
	// Método sobrecarregado de compra de apenas um produto
	public boolean comprar(Produtos p) {
		if(p1 == null) {
			p1 = p;
		} else if(p2 == null) {
			p2 = p;
		} else if(p3 == null) {
			p3 = p;
		} else if(p4 == null) {
			p4 = p;
		} else if(p5 == null) {
			p5 = p;
		} else {
			return (false);
		}
		return (true);
	}
	// Método sobrecarregado de compra de dois produtos
	public boolean comprar(Produtos p1, Produtos p2) {
		comprar(p1);
		comprar(p2);
		if(comprar(p1) == false) {
			System.out.println("Erro na compra do produto " + p1.getNome());
			return (false);
		}
		if(comprar(p2) == false) {
			System.out.println("Erro ao comprar o produto " + p2.getNome());
			return (false);
		}
		return (true);
	}
	// Método sobrecarregado de compra de três produtos
	public boolean comprar(Produtos p1, Produtos p2, Produtos p3) {
		comprar(p1);
		comprar(p2);
		comprar(p3);
		if(comprar(p1) == false) {
			System.out.println("Erro na compra do produto " + p1.getNome());
			return (false);
		}
		if(comprar(p2) == false) {
			System.out.println("Erro ao comprar o produto " + p2.getNome());
			return (false);
		}
		if(comprar(p3) == false) {
			System.out.println("Erro ao comprar o produto " + p3.getNome());
			return false;
		}
		return (true);
	}
	// Método de compra de produtos
	// Entrada: parâmetros de Produtos p e Cliente c
	// Saída: (true) caso a oprração for um sucesso, (false) caso contrário
	public boolean vender(Produtos p, Cliente c) {
		if(c.dinheiro >= p.valor) {
			c.dinheiro -= p.valor;
			p = null;
			return (true);
		}
		return (false);
	}
}