package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TreinoEntradaPorTextoSaidaPorTerminal {

	public static void main(String[] args) throws IOException {

		InputStream fis = new FileInputStream("teste.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream ow = System.out;
		Writer osw = new OutputStreamWriter(ow);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while (linha != null) {
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
		
	}

}
