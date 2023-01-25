package AreaDosTriangulos;

import java.util.Scanner;

import AreaDosTriangulos.entities.Triangulo;

public class ExerciciosAreaTriangulosCMetodos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		System.out.println("escreve o triangulo ai ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Escreve outro triangulo ai tbm");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		System.out.printf("Triangle X area %.4f%n", x.calculaArea());
		System.out.printf("Triangle X area %.4f%n", y.calculaArea());
		
		
		
		
		sc.close();
	}

}
