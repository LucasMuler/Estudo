package br.com.byteBank.banco.Main;

import br.com.byteBank.banco.Cliente.Cliente;
import br.com.byteBank.banco.Conta.Conta;

public class SistemaInterno{

	private Conta conta;
	private Cliente cliente;


	public void cadastroNovoCliente(String nome, String cpf) {
		this.cliente = new Cliente(nome, cpf);
	}
}
