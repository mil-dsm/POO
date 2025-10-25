package POO.revisao_AP1;

public class Produtos {
	private String nome;  // Atributo de visibilidade privada
	public float valor;  // Atributo de visibilidade pública
	protected String dataValidade;  // Atributo de visibilidade padrão
	
	public Produtos() { // Construtor
		nome = null;
		valor = 0;
		dataValidade = null;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}