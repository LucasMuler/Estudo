package ProjetoBanco.Entitys;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	
	/*
	 * Construtor com saldo pre determinado e outro sem  
	 */
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}
	
	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setDeposito(double saldo) {
		this.saldo += saldo;
	}
	
	public void setSaca(double saldo) {
		this.saldo = (this.saldo - saldo) - 5;
	}
	
	public String toString() {
		return "Numero: " + this.numero + ", Titular: " + this.titular + ", Saldo R$ " + this.saldo;
	}
}
