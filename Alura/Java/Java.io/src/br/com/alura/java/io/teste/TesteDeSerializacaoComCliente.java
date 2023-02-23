package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteDeSerializacaoComCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		Cliente cliente = new Cliente();
				
		cliente.setCPF("222.222.222-22");
		cliente.setNome("Lucas");
		cliente.setProfissao("Suporte tecnico Junior");
		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contas.bin"));
//		oos.writeObject((Cliente) cliente);
//		oos.close();
		
		//------------------------------------------------------------------------------------
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contas.bin"));
		Cliente nome = (Cliente) ois.readObject();
		System.out.println(nome.getCPF());
		ois.close();
	}
	
}
