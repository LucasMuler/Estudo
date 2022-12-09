package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("teste2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter br = new BufferedWriter(osw);
		
		br.write("teste de escrita de string, apos o espaço segue caracteres aleatorios");
		br.newLine();
		br.newLine();
		br.write("asdjbaosdkjbvsokajbasdpokjvbdsaokjvbasdokjvbsdapokvjbsdpofajvkbdsaokvjbsdaokjb");
		
		br.close();
	}

}
