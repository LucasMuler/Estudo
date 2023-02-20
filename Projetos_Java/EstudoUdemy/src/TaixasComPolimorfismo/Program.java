package TaixasComPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TaixasComPolimorfismo.Entities.Pessoa;
import TaixasComPolimorfismo.Entities.PessoaFisica;
import TaixasComPolimorfismo.Entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> listaDePessoas = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers");
		int numberTaxPayers = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberTaxPayers;i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.println("Individual or company (i/c)");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			double anualIncome = sc.nextDouble();
			sc.nextLine();
			
			if (ch == 'i') {
				System.out.println("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				
				listaDePessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
				
			} else if (ch == 'c') {
				System.out.println("Number off employees: ");
				int numberOfEmployees = sc.nextInt();
				sc.nextLine();
				
				listaDePessoas.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
			}	
		}
		
		System.out.println("Taxes Paid:");
		
		for (Pessoa pessoa : listaDePessoas) {
			System.out.println(pessoa);
		}
		
		System.out.print("Total Taxes $ ");
		
		double sum = 0;
		for (Pessoa pessoa : listaDePessoas) {
			sum += pessoa.Imposto();
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}
}
