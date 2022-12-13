package br.com.alura.java.io.teste.SerializaçãoComHerança;

import java.io.Serializable;

public abstract class Conta implements Serializable{

	private int numero;
	private int agencia;
	private double saldo;
	private Cliente titular;
	private double multiplicadorInposto = 0.3;
	
	
	public Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
		
	}
	
	//metodos
	
	

	public void deposita(double deposito) {
		if (deposito > 0) {
			this.saldo += deposito;
		} else {
			System.out.println("valor negativo");
		}
	}
	
	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			System.out.println("saldo insuficiente");
		}
	}
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);;
		conta.saldo =+ valor;
		System.out.println("foi feita uma transferencia de: " + valor + "para: " + conta);
	}
	
	
	//get e set
	
	public double getMultiplicadorInposto() {
		return multiplicadorInposto;
	}

	public void setMultiplicadorInposto(double multiplicadorInposto) {
		this.multiplicadorInposto = multiplicadorInposto;
	}
	
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

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	
	public String toString() {
		return "numero: " + this.numero + "agencia: " + this.agencia + "este obejto é uma: ";
 	}
	
}
