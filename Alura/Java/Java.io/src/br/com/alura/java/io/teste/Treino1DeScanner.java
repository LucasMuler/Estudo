package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Treino1DeScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner scannerDeArquivo = new Scanner(new File("contas.csv"));		
		
		
		while (scannerDeArquivo.hasNext()) {
			String linha = scannerDeArquivo.nextLine();
			System.out.println(linha); 
	
			Scanner scannerObjeto = new Scanner(linha);
			scannerObjeto.useDelimiter(",");
			
			while (scannerObjeto.hasNext()) {
				String obj = scannerObjeto.next();
				System.out.println(obj);
			}
			
			scannerObjeto.close();
		}
		scannerDeArquivo.close();
	}
	
}
