package ProjetoSistemaLoja.entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;
	private double valorEstoque;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		valorEstoque = this.quantidade * this.preco;

	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/*
	 * este é um construtor que não necessita de nenhum item de quantidade. 
	 */
	

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0;
	}

	public double valorTotalDoEstoque() {
		return valorEstoque;
	}

	public void setadicionaProdutosNoEstoque(int quantidade) {
		this.quantidade += quantidade;
		valorEstoque = this.quantidade * this.preco;
	}

	public void setremoveProdutosNoEstoque(int quantidade) {
		this.quantidade -= quantidade;
		valorEstoque = this.quantidade * this.preco;
	}

	public String toString() {
		return nome + ", R$" + preco + ", Total R$" + valorEstoque;
	}

}
