package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaComFileWriter { 

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("teste2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bf = new BufferedWriter(osw);
		
		FileWriter f = new FileWriter("teste2.txt");
		BufferedWriter bf2 = new BufferedWriter(f);
		
		  bf.write("sdknodfsjbasdokjvbaskdojbncskajodb");
		  bf.newLine();
		  bf.newLine();
		  bf.write("aksnhfkdsnvaskjdvnas");
		  bf2.newLine();
		  bf2.newLine();
		  bf2.write("utilizando o construtor simplificado");
		  
		  
		  bf.close();
		  bf2.close();
		  f.close();
	}

}
