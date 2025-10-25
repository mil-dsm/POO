package POO.revisao_AP1;

public class Cliente {
	private String nome; // Atributo de visibilidade privada
	public float dinheiro;  // Atributo de visibilidade pública
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}