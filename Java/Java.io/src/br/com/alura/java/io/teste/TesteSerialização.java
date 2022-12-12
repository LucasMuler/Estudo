package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerialização {

	public static void main(String[] args) throws IOException, Exception {

		String nome = "Lucas Muller";
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		oos.writeObject((String) nome);
		oos.close();
		
		//-----------------------------------------------------------------------------
		
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String name = (String) ios.readObject();
		System.out.println(name);
		ios.close();
		
		
	}

}
