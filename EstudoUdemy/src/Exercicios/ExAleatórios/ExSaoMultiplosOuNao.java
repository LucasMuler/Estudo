package Exercicios.ExAleatórios;

import java.util.Scanner;

public class ExSaoMultiplosOuNao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		double resultado;
		
		if (A > B) {
			resultado = A % B;
		} else {
			resultado = B % A;
		}
		
		System.out.println(resultado);
		
		if (resultado == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}

}
