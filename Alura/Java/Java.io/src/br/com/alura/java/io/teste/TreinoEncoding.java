package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TreinoEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		
		//cria um caracterec e mostra qual é seu code point a partir da tabela unicode
		 
		String s = "c";
		System.out.println(s.codePointAt(0));
		System.out.println("-------------------------------------");
		// Visualizando o charset padrão utilziado no windows
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		System.out.println("-------------------------------------");
		
		// alterando o charset do padrão para windows-1252
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
		System.out.println("-------------------------------------");
		
		//alterando o charset padrão de forma mais alto nivel 
		
		bytes = s.getBytes(StandardCharsets.UTF_16);
		System.out.println(bytes.length + ", UTF-16");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
	}
	
}
