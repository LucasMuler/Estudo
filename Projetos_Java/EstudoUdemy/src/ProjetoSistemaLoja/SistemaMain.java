package ProjetoSistemaLoja;

import java.util.Scanner;

import ProjetoSistemaLoja.Produto.Produto;

public class SistemaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preencha as seguintes informacoes:");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preco: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade no estoque");
		int quantidade = sc.nextInt();
		
		Produto p1 = new Produto(nome, preco, quantidade);
		
		p1.setadicionaProdutosNoEstoque(5);
		
		p1.setremoveProdutosNoEstoque(3);
		sc.close();
	}

}
