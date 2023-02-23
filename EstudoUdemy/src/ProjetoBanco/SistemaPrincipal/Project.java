package ProjetoBanco.SistemaPrincipal;

import java.util.Scanner;

import ProjetoBanco.Entitys.Conta;

public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Conta c1;
		
		System.out.println("digite o numero da conta");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("digite o Titular da conta");
		String titular = sc.nextLine();
		System.out.println("Será feito um deposito inicial?");
		int opcaoDeposito = sc.nextInt();
		
		if (opcaoDeposito == 1) {
			
			System.out.println("digite o valor a ser depositado");
			double saldo = sc.nextDouble();
			sc.nextLine();
			
			c1 = new Conta(numero, titular, saldo);
			
			System.out.println("dados da conta");
			System.out.println(c1);
			
		} else {
			
			c1 = new Conta(numero, titular);
			System.out.println("dados da conta");
			System.out.println(c1);
			
		}
		
		System.out.println("Entre um valor para o deposito");
		double deposito = sc.nextDouble();
		
		c1.setDeposito(deposito);
		
		System.out.println(c1);
		
		System.out.println("Entre um valor para o saque");
		double saque = sc.nextDouble();
		
		c1.setSaca(saque);
		
		System.out.println(c1);
		
		sc.close();

	}

}
