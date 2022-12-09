package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteDePrintStream {

	public static void main(String[] args) throws IOException {
		
		PrintWriter ps = new PrintWriter("teste.txt");
		
		ps.println("Teste de PrintStream");
		ps.println();
		ps.println("Sua vantagem é poder usar metodos de alto nivel como println");
		
		ps.close();

	}

}
