package Exercicios.ExRetangulo;

import java.util.Scanner;

import Exercicios.ExRetangulo.Entitis.Retangulo;

public class project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Retangulo r1 = new Retangulo(sc.nextInt(), sc.nextInt());
		
		System.out.println();
		
		System.out.println("area: ");
		System.out.println(r1.getArea());
		System.out.println("perimetro: ");
		System.out.println(r1.getPerimetro());
		System.out.println("Diagonal");
		System.out.println(r1.getDiagonal());
		
		sc.close();
		
	}

}
