package Exercicios.ExAleatórios;

import java.util.Scanner;

public class ExNumeroParOuImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
				
		sc.close();
	}

}
