package MenbrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import MenbrosEstaticos.Util.Calculator;

public class Program {

//	public final static double PI = 3.14159;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre o valor do raio: ");
		double radius = sc.nextDouble();

		double c = Calculator.getCircuference(radius);
		
		double v = Calculator.getVolume(radius);
		
		System.out.printf("%.2f%n", c);
		System.out.printf("%.2f%n", v);
		System.out.printf("%.2f%n", Calculator.PI);
		
		sc.close();
	}
	
//	public static double getCircuference(double radius) {
//		return 2 * PI * radius;
//	}
//
//	public static double getVolume(double radius) {
//		return 4 * PI * radius * radius * radius / 3;
//	}
	
}
