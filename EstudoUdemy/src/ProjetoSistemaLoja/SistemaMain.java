package ProjetoSistemaLoja;

import java.util.Scanner;

import ProjetoSistemaLoja.entities.Produto;

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
		System.out.println("informacoes sobre o produto: " + p1);
		
		System.out.println();
		
		System.out.println("Coloque a quantidade de itens que devem ser acidionadas no estoque: ");
		int x = sc.nextInt();
		p1.setadicionaProdutosNoEstoque(x);
		System.out.println("atualizacao sobre o produto: " + p1);
		
		System.out.println("Coloque a quantidade de itens que devem ser removidos no estoque: ");
		x = sc.nextInt();
		p1.setremoveProdutosNoEstoque(x);
		System.out.println("atualizacao sobre o produto: " + p1);
		
		sc.close();
	}

}
