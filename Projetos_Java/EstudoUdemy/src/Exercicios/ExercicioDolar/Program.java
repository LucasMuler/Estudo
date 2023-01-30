package Exercicios.ExercicioDolar;

import java.util.Scanner;

import Exercicios.ExercicioDolar.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double totalDollar = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.CC(dollar, totalDollar));
		
		sc.close();
		
	}
	
}
