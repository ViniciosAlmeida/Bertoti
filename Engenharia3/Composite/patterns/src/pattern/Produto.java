package pattern;

public class Produto {
	private String nome;
	private int preço;
	
	
	public Produto(String nome, int preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}
}
