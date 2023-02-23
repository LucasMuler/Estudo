package Entities;

import Exception.EnoughBalanceException;
import Exception.ExceedsWithdrawLimitException;
import Exception.InvalidDepositException;

public class Account {
	
	private int numero;
	private String holder;
	private double saldo;
	private double limiteDeSaque;
	
	public Account() {
	}

	public Account(int numero, String holder, double saldo, double limiteDeSaque) {
		this.numero = numero;
		this.holder = holder;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposit(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Novo saldo: " + this.saldo);
		} else if(valor <= 0){
			throw new InvalidDepositException("The format of deposit is not valid");
		}
	}
	
	public void saque(double valor) {
		if (valor <= this.limiteDeSaque && this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Novo saldo: " + this.saldo);
		} else if (valor > this.limiteDeSaque) {
			throw new ExceedsWithdrawLimitException("The amount exceeds withdraw limit");
		} else if(this.saldo < valor) {
			throw new EnoughBalanceException("Not enought Balance");
		}
	}
}
