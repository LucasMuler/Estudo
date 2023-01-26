package ProjetoSistemaLoja.Produto;

public class Produto {

	String nome;
	double preco;
	int quantidade;
	double valorEstoque;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		valorEstoque = this.quantidade * this.preco;

		System.out.println("informacoes sobre o produto: " + nome + ", R$" + preco + ", Total R$" + valorEstoque);
		System.out.println("--------------------------");
	}

	public int getvalorTotalNoEstoque() {
		return quantidade;
	}

	public double valorTotalDoEstoque() {
		return valorEstoque;
	}

	public void setadicionaProdutosNoEstoque(int quantidade) {
		valorEstoque = valorEstoque + (quantidade * this.preco);
		this.quantidade = this.quantidade + quantidade;

		System.out.println("atualizacao sobre o produto: " + nome + ", R$" + preco + ", Total R$" + valorEstoque);
	}

	public void setremoveProdutosNoEstoque(int quantidade) {
		valorEstoque = valorEstoque - (quantidade * this.preco);
		this.quantidade = this.quantidade - quantidade;

		System.out.println("atualizacao sobre o produto: " + nome + ", R$" + preco + ", Total R$" + valorEstoque);
	}

}
