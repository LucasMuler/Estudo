package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteJuncao {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = System.in; //new FileInputStream("teste.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("teste2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bf = new BufferedWriter(osw);

		String texto = br.readLine();
		
		while (texto  != null && !(texto.isEmpty())) {
			System.out.println(texto);
			bf.write(texto);
			bf.newLine();
			bf.flush();
			texto = br.readLine();
		}
		
		bf.newLine();
		bf.write("Esta é o arquivo de copia");
		
		br.close();
		bf.close();
	}
	
}
