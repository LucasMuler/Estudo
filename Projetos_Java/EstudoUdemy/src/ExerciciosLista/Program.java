package ExerciciosLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ExerciciosLista.Entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos funcionarios serã registrados?");
		int numeroCadastro = sc.nextInt();
		List<Funcionario> listaDeEmpregados = new ArrayList<>();
		
		for (int i = 0; i<numeroCadastro; i++) {
			System.out.println("empregado numero #" + i);
			System.out.println("Id: " );
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			sc.nextLine();
			
			Funcionario x = new Funcionario(id, nome, salario);
			listaDeEmpregados.add(x);
		}
		
		System.out.println("digite o id do funcionario que receberá um aumento");
		int idDoAumento = sc.nextInt();
	
		for (Funcionario funcionario : listaDeEmpregados) {
			if (funcionario.getId() == idDoAumento) {
				
				System.out.println("Entre a porcentagem de aumento");
				double porcentagemDoAumento = sc.nextDouble();
				sc.nextLine();
				
				double aumento = (porcentagemDoAumento / 100) * funcionario.getSalario();
				
				System.out.println(aumento);
				
				funcionario.setSalario(aumento);
				
			} else {
				System.out.println("ID não registrado");
			}
		}
		
		System.out.println("Lista de funcionarios");
		
		for (Funcionario funcionario : listaDeEmpregados) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}

}
