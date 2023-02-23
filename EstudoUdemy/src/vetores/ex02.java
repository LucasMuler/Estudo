package vetores;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] listaNumeros = new int[n];
		int soma = 0;

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			listaNumeros[i] = x;
			soma += x;

		}

		System.out.print("Valores = ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(listaNumeros[i]+ " ");
		}
		
		System.out.println();

		System.out.println("Soma = " + soma);
		System.out.println("Media = " + soma/n);
		sc.close();

	}

}
