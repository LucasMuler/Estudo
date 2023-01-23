package Exercicios.ExFor;

import java.util.Scanner;

public class ExValoresDentroDaFaixaComLimite {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int limite = sc.nextInt();
		int valoresAbaixoDe10 = 0;
		int ValoresAcimaDe10 = 0;
		
		for (int x = 0; x < limite; x++) {
			
			int variavel = sc.nextInt();
			
			if (variavel > 10) {
				ValoresAcimaDe10++;
			} else {
				valoresAbaixoDe10++;
			}
			
		}
		
		System.out.println(valoresAbaixoDe10 + " in");
		System.out.println(ValoresAcimaDe10 + " out");
		
		sc.close();

	}

}
