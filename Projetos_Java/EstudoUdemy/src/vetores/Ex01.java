package vetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] listaDeNumeros = new int[n];
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			listaDeNumeros[i] = x;
		}
		
		System.out.println("Numeros Negativos:");
		
		for (int i = 0; i < n; i++) {
			if (listaDeNumeros[i] < 0) {
				System.out.println(listaDeNumeros[i]);
			}
		}
		
		sc.close();

	}

}
