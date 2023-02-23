package Exercicios.ExFor;

import java.util.Scanner;

public class ExImparComLimite {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int limite = sc.nextInt();
		
		for (int x = 1; x <= limite; x = x + 2) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
