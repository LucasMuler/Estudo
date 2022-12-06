package br.com.byteBank.banco.Conta;

import java.util.ArrayList;

import br.com.byteBank.banco.Cliente.Cliente;
import br.com.byteBank.banco.Excption.MinhaExption;

public class Conta {

	/**
	 * Atributos da minha classe
	 */
	
	private int numero;
	private int agencia;
	private double saldo;
	private Cliente cliente;
	
	/**
	 * Constructor
	 * @param numero
	 * @param agencia
	 * @param cliente
	 */
	
	public Conta(int numero, int agencia, Cliente cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	
	public void deposita(double saldo) {

		if(saldo >= 0) {
			this.saldo = this.saldo + saldo;
		}
		else {
			throw new MinhaExption("saldo negativo, ");
		}
	}
	
	
	
	public double saca(double valor) {
		
		if (valor > 0) {
			
			this.saldo = this.saldo - valor;
			return this.saldo;
			
		}
		
		else {
			throw new MinhaExption("valor de saque negativo, ");
		}
		
		
	}
	
	public void transfere(Conta conta, double valor) {
		
		if (valor > 0) {
		this.saldo = this.saldo - valor;
		conta.saldo = conta.saldo + valor;
		System.out.println("Foi feita uma transferencia de R$ " + valor + " para a " + conta);
		}
		else {
			throw new MinhaExption("valor de transferencia negativo, ");
		}
	}
	
	
	/**
	 * Geters e Sters
	 * @return
	 */
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}
