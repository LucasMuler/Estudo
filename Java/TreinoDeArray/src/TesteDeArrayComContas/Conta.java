package TesteDeArrayComContas;

public abstract class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	private Cliente cliente;
	
	public Conta(int numero, int agencia, Cliente cliente) {
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
	}
	
	public boolean equals(Object obj) {
		
		Conta cr = (Conta)obj;
		if (this.saldo == cr.saldo) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * Geters e setters
	 */
	
	public Cliente getTitular() {
		return this.cliente;
	}
	
	public double getSaldo() {
		return saldo;
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


	public void deposita(double saldo) {
		this.saldo = saldo;
	}


}
