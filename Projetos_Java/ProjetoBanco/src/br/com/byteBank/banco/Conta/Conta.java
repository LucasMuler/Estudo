package br.com.byteBank.banco.Conta;

import br.com.byteBank.banco.Cliente.Cliente;

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
		this.saldo = saldo;
	}
	
	public double saca(double valor) {
		return this.saldo - valor;
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
