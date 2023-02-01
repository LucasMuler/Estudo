package vetores;
import java.util.Scanner;

import vetores.entities.Produto;

public class AplicacaoVetores2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		double media = 0;
		
		Produto[] listaProdutos = new Produto[n];
		
		for (int i = 0; i < n; i++) {
			String nome = sc.nextLine();
			double valor = sc.nextDouble();
			sc.nextLine();
			
			Produto p = new Produto(nome, valor);
			
			listaProdutos[i] = p;
			
			media += valor;
		}
		
		System.out.println("preco medio = " + media / 3);
		
		sc.close();
	}

}
