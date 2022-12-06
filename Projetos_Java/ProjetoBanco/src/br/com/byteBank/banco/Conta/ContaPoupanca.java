package br.com.byteBank.banco.Conta;

import br.com.byteBank.banco.Cliente.Cliente;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContaPoupanca N: " + this.getNumero() + " agencia: " + this.getAgencia();
	}

	
}
