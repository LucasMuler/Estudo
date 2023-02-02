package vetores;

import java.util.Scanner;

import vetores.entities.Pessoas;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas?");
		
		int n = sc.nextInt();
		sc.nextLine();
		Pessoas[] listaDePessoas = new Pessoas[n];
		double alturaMedia = 0;
		int idadeMedia = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.println("Nome:");
			String nome = sc.nextLine();
			System.out.println("Idade:");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			listaDePessoas[i] = new Pessoas(nome, idade, altura);
			
			alturaMedia += altura;
			
			if (idade < 16 ) {
				idadeMedia ++;
			}
		}
		
		System.out.println("Altura media: " + alturaMedia/n);
		System.out.print("Pessoas com menos de 16 anos: " + (idadeMedia / n)*100);
		System.out.println("%");
		
		for (int i = 0; i < n; i++) {
			if(listaDePessoas[i].getIdade() < 16 ) {
				System.out.println(listaDePessoas[i].getNome());
			}
		}
		sc.close();

	}

}
