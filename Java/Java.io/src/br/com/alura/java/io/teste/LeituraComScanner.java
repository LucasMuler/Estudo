package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Scanner;

public class LeituraComScanner {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"));
		
		
		while(scanner.hasNext()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			Scanner scannerDeLinha = new Scanner(linha);
			scannerDeLinha.useDelimiter(",");
			
			while(scannerDeLinha.hasNext()) {
				String item = scannerDeLinha.next();
				System.out.println(item);
			}
			
			scannerDeLinha.close();
		}
	
		scanner.close();
		
	}
	
}
