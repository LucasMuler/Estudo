package Exercicios.ExSalario;

import java.util.Scanner;

import Exercicios.ExSalario.entities.Funcionario;

public class Project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String nome = sc.nextLine();
		System.out.println("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		double tax = sc.nextDouble();
		
		Funcionario f1 = new Funcionario(nome, grossSalary, tax);
		
		System.out.println(f1);
		System.out.println();
		
		System.out.println("Which percentage to increase salary?");
		f1.IncreaseSalary(sc.nextDouble());
		
		
		sc.close();

	}

}
