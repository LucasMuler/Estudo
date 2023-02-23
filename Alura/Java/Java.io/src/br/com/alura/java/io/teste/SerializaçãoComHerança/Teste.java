package br.com.alura.java.io.teste.SerializaçãoComHerança;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Teste {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Conta c1 = new ContaCorrente(10, 04);
		Cliente cliente = new Cliente();

		c1.setTitular(cliente);
		cliente.setCPF("2651651651");
		cliente.setNome("Lucas");
		cliente.setIdade(15);
		cliente.setProfissao("Greenwaver");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contas.bin"));
		oos.writeObject(c1);
		oos.close();
		
		//_----------------------------------------------_
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contas.bin"));
		Conta conta = (Conta) ois.readObject();
		System.out.println(conta.getTitular().getCPF());
		System.out.println(conta.getTitular().getIdade());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		ois.close();
		
	}
	
}
