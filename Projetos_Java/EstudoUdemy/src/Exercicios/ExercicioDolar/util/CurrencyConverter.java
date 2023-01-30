package Exercicios.ExercicioDolar.util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double CC(double dollar, double totalDollar) {
		return (dollar * totalDollar) + (dollar * totalDollar) * IOF;
		
	}
	
}
